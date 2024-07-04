package parcial;

import java.time.LocalDateTime;

public class Uso {
    private Usuario usuario;
    private LocalDateTime fechaUso;

    public Uso(Usuario usuario, LocalDateTime fechaUso) {
        this.usuario = usuario;
        this.fechaUso = fechaUso;
    }
}
