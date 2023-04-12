package domain;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccionCobro;
    private String direccionEntrega;
    private String email;
    private int dni;
    private boolean preferencial;
    private Tarjeta[] tarjetas;
    private Carrito[] carritos;

    public void pagarCarrito(Carrito carrito) {
        carrito.comprar();
        // La idea es que le pase por parametros informacion necesaria
        // para que se compre el carrito
    }

}
