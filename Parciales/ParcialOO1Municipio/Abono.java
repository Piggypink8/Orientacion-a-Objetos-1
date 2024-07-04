package parcial;

import java.time.LocalDateTime;

abstract class Abono {
    protected static final int PERIODO_MINUTOS = 5;
    protected LocalDateTime fechaInicio;
    protected float montoPagado;

    public abstract boolean esValido();
    public abstract void cobrar(Usuario usuario, long minutos);
    public abstract void consultar();
}
