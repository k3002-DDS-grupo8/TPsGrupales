package domain;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private EstadoCarrito estadoCarrito;
    private List<ItemCarrito> items;

    public void agregar(Producto producto, int cantidad) {
        ItemCarrito item = new ItemCarrito();
        items.add(item);
        // instancia un ItemCarrito y lo aniade a items
    }
    public void sacar(ItemCarrito item) {
        items.remove(item);
    }
    public void comprar() {
        this.estadoCarrito = EstadoCarrito.PAGADO;
    }

    public Carrito() {
        this.items = new ArrayList();
    }
}
