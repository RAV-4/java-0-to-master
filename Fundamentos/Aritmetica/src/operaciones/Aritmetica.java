
package operaciones;

/**
 *
 * @author rav4
 */
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando Constructor");
    }
    
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    //Metodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno() {
        return  this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}

