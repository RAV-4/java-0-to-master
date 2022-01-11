
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        
        for(int i =0; i < personas.length; i++) {
            System.out.println("Persona en la posicion " + "i:  " + personas[i]);
        }
        
    }
}
