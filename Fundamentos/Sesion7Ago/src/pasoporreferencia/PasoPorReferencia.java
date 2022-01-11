
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author rav4
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
        
        var dato1 = "dato";
        System.out.println("dato1 = " + dato1);
        var dato2 = "dato";
        System.out.println("dato2 = " + dato2);
        pruebaString(dato1);
        System.out.println("dato1 = " + dato1);
        System.out.println("dato2 = " + dato2);
    }
    
    public static void cambiarValor(Persona persona) {
        persona.nombre = "Karla";
    }
    
    public static void pruebaString(String dato){
        dato = "Cambio";
    }
}
