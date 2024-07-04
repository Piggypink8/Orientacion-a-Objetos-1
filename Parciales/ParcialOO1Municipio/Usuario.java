package parcial;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private TarjetaCredito tarjetaCredito;
    private Abono abono;
    private Bicicleta bicicletaEnUso;

    public Usuario(String id, String nombre, String apellido, TarjetaCredito tarjetaCredito) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public Abono getAbono() {
        return abono;
    }

    public void setAbono(Abono abono) {
        this.abono = abono;
    }

    public void procesarPago(float monto){
        this.tarjetaCredito.procesarPago(monto);
    }
    
    public void retirarBicicleta(Estacion estacion) {
        if(this.abono.esValido()){
            if(estacion.tieneBicicletasDisponibles()){
                this.bicicletaEnUso = estacion.removerBicicleta();
                estacion.registrarEntrega(this, LocalDateTime.now());
            }
        } else
            System.out.println("Debe renovar el abono.");
    }

    public void devolverBicicleta(Estacion estacion, LocalDateTime horaInicio, LocalDateTime horaFin) {
        long minutos = ChronoUnit.MINUTES.between(horaInicio, horaFin);
        this.abono.cobrar(this, minutos);
        estacion.agregarBicicleta(this.bicicletaEnUso);
        estacion.registrarDevolucion(this, horaFin);
        bicicletaEnUso = null;
    }
    
    public void consultarAbono() {
        this.abono.consultar();
    }
}
