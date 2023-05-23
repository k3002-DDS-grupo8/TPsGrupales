package domain;

import java.time.LocalDate;

public class Multa {
    private LocalDate fechaRealizada;

    public Multa(LocalDate fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }

    public LocalDate getFechaRealizada() {
        return this.fechaRealizada;
    }
}
