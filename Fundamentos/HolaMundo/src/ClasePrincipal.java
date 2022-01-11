
import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String args[]) {
        
        inicio:
        for ( var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue inicio;
                //Se dirige a la linea con la etiqueta
            }
            System.out.println("contador con continue = " + contador);
        }
        
        
        for ( var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue;
                //Omite las demas lineas e inicia la siguente iteracion
            }
            System.out.println("contador con continue = " + contador);
        }
        
        for ( var contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador con break = " + contador);
                break;
                //Termina o rompe el ciclo
            }
        }
        
    }
}