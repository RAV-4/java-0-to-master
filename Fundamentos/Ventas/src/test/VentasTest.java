package test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;


public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Papas", 1500d);
        Producto producto2 = new Producto("Gaseaosa", 2000d);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
