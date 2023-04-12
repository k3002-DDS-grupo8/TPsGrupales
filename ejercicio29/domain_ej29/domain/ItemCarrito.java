package domain;

public class ItemCarrito {

    private Producto producto;
    private int cantidad;
    private float valor;
    public float total() {
        return cantidad * valor;
        // La idea es que se calcule distinto segun el estado del carrito
    }

}
