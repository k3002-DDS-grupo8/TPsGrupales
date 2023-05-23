package domain;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaVencimiento;
    private LocalDate fechaDevolucion;
    private Copia copia;

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaVencimiento, LocalDate fechaDevolucion, Copia copia) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaVencimiento = fechaPrestamo.plusDays(30);
        this.fechaDevolucion = fechaDevolucion;
        this.copia = copia;
    }

    //
    public boolean multa() {
        return fechaDevolucion.isAfter(fechaVencimiento);
    }
    public void devolucion(){
        this.fechaDevolucion = LocalDate.now();
    }
    public LocalDate fechaDevolucion() {return fechaDevolucion}
}
