
package test;

import domain.Cliente;
import domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        
        Cliente cliente1 = new Cliente(true, "Pedro", 'M', 25, "Calle Falsa 123");
        System.out.println("cliente1 = " + cliente1);
        
        Cliente cliente2 = new Cliente(true, "Laura", 'F', 29, "Calle Falsa 456");
        System.out.println("cliente2 = " + cliente2);
    }
}
