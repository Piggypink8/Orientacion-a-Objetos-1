package parcial;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class AbonoAnual extends Abono {
    private static final int COSTO_EXTRA_POR_5_MINUTOS = 100;
    private static final int DURACION_ANUAL = 365;
    private static final int MINUTOS_DE_PERIODO_GRATUITO= 30;

    public AbonoAnual(LocalDateTime fechaInicio, float montoPagado) {
        this.fechaInicio = fechaInicio;
        this.montoPagado = montoPagado;
    }

    @Override
    public boolean esValido() {
        return LocalDateTime.now().isBefore(fechaInicio.plusDays(DURACION_ANUAL));
    }

    @Override
    public void cobrar(Usuario usuario, long minutos) {
        if (minutos > MINUTOS_DE_PERIODO_GRATUITO) {
            long minutosExtra = minutos - MINUTOS_DE_PERIODO_GRATUITO;
            float monto = (minutosExtra / Abono.PERIODO_MINUTOS) * COSTO_EXTRA_POR_5_MINUTOS;
            usuario.procesarPago(monto);
        }
    }

    public long getDiasRestantes() {
        return ChronoUnit.DAYS.between(LocalDateTime.now(), fechaInicio.plusDays(DURACION_ANUAL));
    }

    @Override
    public void consultar(){
        System.out.println("Días restantes: " + this.getDiasRestantes());
    }
}
