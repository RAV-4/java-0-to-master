package paqueteProtected2;

import paqueteprotected.ClaseProtected;


public class ClaseHijaProtected extends ClaseProtected{
    
    public ClaseHijaProtected(){
        super();
        this.atributoProtected = "Modificacion del atributo protected";
        System.out.println("Atributo protected = " + this.atributoProtected);
        this.metodoProtected();
    }
}
