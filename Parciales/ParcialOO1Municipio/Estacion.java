package parcial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Estacion {
    private String direccion;
    private int estacionamientosDisponibles;
    private List<Bicicleta> bicicletas;
    private List<Uso> entregas;
    private List<Uso> salidas;

    public Estacion(String direccion, int estacionamientosDisponibles) {
        this.direccion = direccion;
        this.estacionamientosDisponibles = estacionamientosDisponibles;
        this.bicicletas = new ArrayList<>();
        this.entregas = new ArrayList<>();
        this.salidas = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEstacionamientosDisponibles() {
        return estacionamientosDisponibles;
    }

    public void agregarBicicleta(Bicicleta bicicleta) {
        if (bicicletas.size() < estacionamientosDisponibles) {
            bicicletas.add(bicicleta);
        } else {
            System.out.println("No hay estacionamientos disponibles.");
        }
    }

    public Bicicleta removerBicicleta() {
        Bicicleta bicicleta = this.bicicletas.get(0);
        bicicletas.remove(bicicleta);
        return bicicleta;
    }

    public boolean tieneBicicletasDisponibles() {
        return !bicicletas.isEmpty();
    }

    public boolean tieneEstacionamientosDisponibles() {
        return bicicletas.size() < estacionamientosDisponibles;
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void registrarEntrega(Usuario usuario, LocalDateTime fechaEntrega) {
        Uso uso = new Uso(usuario, fechaEntrega);
        this.entregas.add(uso);
    }

    public void registrarDevolucion(Usuario usuario, LocalDateTime fechaDevolucion) {
        Uso uso = new Uso(usuario, fechaDevolucion);
        this.salidas.add(uso);
    }
}
