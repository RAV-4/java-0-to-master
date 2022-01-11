
package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        
        
        Empleado empleado = new Empleado("Juan", 4000D);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000D, "Contabilidad");
        determinarTipo(empleado);
        
    }
    
    public static void determinarTipo(Empleado empleado) {
        if(empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            ((Gerente) empleado).getDepartamento();
            System.out.println("gerente = " + ((Gerente) empleado).getDepartamento());
        }
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            
        }
    }
    
    //Puede responder true en el if si se prefunta que un objeto es intancia de una clase que es padre de la clase del objeto
}
