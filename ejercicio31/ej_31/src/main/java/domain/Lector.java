package domain;

import java.time.LocalDate;
import java.util.List;

public class Lector {
    private List<Prestamo> prestamos;
    private List<Multa> multas;

    public void agregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }
    public void terminarPrestamo(Prestamo prestamo){
        prestamos.remove(prestamo);
    }
    public boolean estaMultado(){
        LocalDate haceDosDias = LocalDate.now().minusDays(2);

        for (Multa multa : multas) {
            if (multa.getFechaRealizada().isAfter(haceDosDias)) {
                return true;
            }
        }
        return false;
    }

}
