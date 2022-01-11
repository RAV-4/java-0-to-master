package test;

import domain.*;


public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());
        
        //downcasting
        //Es necesario especificar el casteo
        System.out.println(((Escritor) empleado).getTipoEscritura());
        
        Escritor escritor2= new Escritor("Karla", 6000, TipoEscritura.MODERNO);
        //upcasting
        //No es necesario especificar el casteo
        Empleado empleado2 = escritor2;
        System.out.println(empleado2.obtenerDetalles());
        
        
        
    }
}
