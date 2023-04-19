package domain;
import java.util.List;

public class Libro {
    private String nombre;
    private int anio;
    private List<Autor> autores;
    private List<Categoria> categoria;
    private String editorial;

    public Libro(String nombre, int anio, List<Autor> autores, List<Categoria> categoria, String editorial) {
        this.nombre = nombre;
        this.anio = anio;
        this.autores = autores;
        this.categoria = categoria;
        this.editorial = editorial;
    }

}
