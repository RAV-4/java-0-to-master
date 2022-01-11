package mundopc;

import com.gm.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        Teclado custom = new Teclado("USB C", "Custom");
        Raton magicMouse = new Raton("Inalambrica", "Apple");
        Monitor dell = new Monitor("HDMI", 17d);
        Computadora mac = new Computadora("Macbook", dell, custom, magicMouse);
        
        Teclado keyboard = new Teclado("USB A", "LG");
        Raton  mouse = new Raton("USB A", "LG");
        Monitor lg = new Monitor("HDMI", 17d);
        Computadora base = new Computadora("Trabajo", lg, keyboard, mouse);
        
        Orden orden = new Orden();
        orden.agregarComputadora(mac);
        orden.agregarComputadora(base);
        orden.mostrarOrden();
        
    }
}
