
package test;

import dominio.Persona;

/**
 *
 * @author rav4
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1" + persona1.toString());
        persona1.setNombre("Juan Carlos");
        System.out.println("persona1" + persona1);
    }
}
