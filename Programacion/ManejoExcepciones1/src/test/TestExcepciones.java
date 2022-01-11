package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        /*try{
            resultado = 10/0;
        } catch (Exception e) {
            System.out.println("Ocurrió  un error:");
            e.printStackTrace(System.out);
        }*/
        try{
            resultado = Aritmetica.division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrió un error de tipo OperacionExcepcion: ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error de tipo Exception:");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se revisó la division entre cero");
        }
        
        System.out.println("resultado = " + resultado);
    }
}
