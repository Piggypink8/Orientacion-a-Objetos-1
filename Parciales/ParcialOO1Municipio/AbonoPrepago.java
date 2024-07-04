package parcial;

class AbonoPrepago extends Abono {
    private static final int COSTO_POR_5_MINUTOS = 50;
    private float saldo;

    public AbonoPrepago(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean esValido() {
        return saldo > 0;
    }

    @Override
    public void cobrar(Usuario usuario, long minutos) {
        float monto = (minutos / Abono.PERIODO_MINUTOS) * COSTO_POR_5_MINUTOS;
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            monto = saldo;
            saldo = 0;
        }
        usuario.procesarPago(monto);
    }

    public float getSaldo() {
        return saldo;
    }

    public void recargarSaldo(float monto) {
        saldo += monto;
    }

    @Override
    public void consultar(){
        System.out.println("Saldo disponible: $" + this.getSaldo());
    }
}
