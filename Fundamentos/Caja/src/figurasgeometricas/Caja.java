
package figurasgeometricas;

/**
 *
 * @author rav4
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja() {
        System.out.println("Ejecutando constructor Vacio");
    }
    
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen(){
        return this.ancho * this.alto * this.profundo;
    }
}
