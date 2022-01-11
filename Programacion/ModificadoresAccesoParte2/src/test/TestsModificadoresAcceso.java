package test;

import paqueteProtected2.ClaseHijaProtected;
import paqueteprotected.ClaseProtected;
import paquetepublic.ClasePublic;


public class TestsModificadoresAcceso {
    public static void main(String[] args) {
        ClasePublic clasePublic = new ClasePublic();
        System.out.println("clasePublic = " + clasePublic.atributoPublico);
        clasePublic.metodoPublico();
        System.out.println("--------------------");
        ClaseProtected claseProtected = new ClaseProtected("ARG");
        System.out.println("--------------------"); 
        ClaseHijaProtected claseHijaProtected = new ClaseHijaProtected();
        System.out.println("claseHijaProtected = " + claseHijaProtected);
        
    }
}
