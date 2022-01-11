
package test;

import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String[] args) {
        var resultado1 = Operaciones.sumar(1, 10);
        System.out.println("resultado1 = " + resultado1);
        var resultado2 = Operaciones.sumar(2.3, 2.5);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(2.3, 2L);
        System.out.println("resultado3 = " + resultado3);
    }
}
