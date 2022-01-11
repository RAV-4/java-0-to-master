
package figurasgeometricas;

/**
 *
 * @author rav4
 */
public class Prueba {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.ancho = 5;
        caja1.alto = 6;
        caja1.profundo = 4;
        var volumenCaja1 = caja1.calcularVolumen();
        System.out.println("Volumen caja 1 = " + volumenCaja1);
        
        Caja caja2 = new Caja(2, 4, 6);
        var volumenCaja2 = caja2.calcularVolumen();
        System.out.println("Volumen caja 2 = " + volumenCaja2);
    }
}
