package domain;

import java.time.LocalDateTime;

public class Tarjeta {
    private String nombreTitular;
    private boolean verificada;
    private int numero;
    private LocalDateTime fechaVto;
    private String codigo;

    public void verificar() {
        this.verificada = true;
    }
}
