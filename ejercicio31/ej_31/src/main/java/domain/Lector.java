package domain;

import java.time.LocalDate;
import java.util.List;

public class Lector {
    private List<Prestamo> prestamos;
    private List<Multa> multas;
    private Multa multaActual;

    public void establecerUltimaMulta(Multa multa){

    }


    public void agregarPrestamo(Prestamo prestamo){prestamos.add(prestamo);}
    public void terminarPrestamo(Prestamo prestamo){
        prestamo.devolucion();
        prestamos.remove(prestamo);
    }
    public void revisarMultas(){
        for (Prestamo prestamo : prestamos) {
            if(prestamo.multa()){
                establecerUltimaMulta(new Multa(prestamo.fechaDevolucion()))
            }

        }

    }

}
