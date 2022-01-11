package mx.com.gm.ventas;

public class Producto {
    private final int idProdcuto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto(){
        this.idProdcuto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio =  precio;
    }

    public int getIdProdcuto() {
        return this.idProdcuto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProdcuto=").append(idProdcuto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
