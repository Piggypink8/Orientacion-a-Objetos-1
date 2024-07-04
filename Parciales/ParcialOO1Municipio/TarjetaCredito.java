package parcial;

public class TarjetaCredito {
    private String nombre;
    private String numero;

    public TarjetaCredito(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void procesarPago(float monto){
        Payment.processPayment(numero, monto);
    }
}
