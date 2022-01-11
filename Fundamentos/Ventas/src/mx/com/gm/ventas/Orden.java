
package mx.com.gm.ventas;


public class Orden {
    public static final int MAX_PRODUCTOS = 10;
    
    private final int idOrden;
    private final Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado la cantidad maxima de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
    private double calcularTotal(){
        double total = 0d;
        for (int i = 0; i < this.contadorProductos; i++) {
            total +=  productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("--------");
        System.out.println("Productos de la orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println((i+1)+". " + this.productos[i].getNombre() + ": $"+ this.productos[i].getPrecio());
        }
        System.out.println("--------");
        System.out.println("Total de la orden: $"+calcularTotal());
    }
    
    
}
