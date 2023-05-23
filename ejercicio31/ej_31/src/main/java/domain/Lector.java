package domain;

import java.time.LocalDate;
import java.util.List;

public class Lector {
    private List<Prestamo> prestamos;
    private List<Multa> multas;
    private Multa multaActual;

    public void establecerUltimaMulta(Multa multa){
        if (multa.getFechaRealizada().isAfter(multaActual.getFechaRealizada())) {
            multaActual = multa;
        }
    }


    public void agregarPrestamo(Prestamo prestamo){prestamos.add(prestamo);}
    public void devolverPrestamo(Prestamo prestamo){
        prestamo.devolucion();
        prestamos.remove(prestamo);
    }
    public boolean revisarMultas(){
        for (Prestamo prestamo : prestamos) {
            if(prestamo.multa()){
                establecerUltimaMulta(new Multa(prestamo.fechaDevolucion()));
            }
        }
        return multaActual.vigente();
    }
}
