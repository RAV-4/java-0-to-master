package paqueteDefault;

public class ClaseHijaDefault extends ClaseDefault{
    public ClaseHijaDefault(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("Atributo default = " + this.atributoDefault);
        this.metodoDefault();
    }
}
