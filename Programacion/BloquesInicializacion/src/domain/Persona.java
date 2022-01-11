package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //Bloque de inicializacion estatico
    //Solo se ejecuta una vez, al cargar la clase a memoria
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        //No se puede acceder a lo no estatico
    }
    
    //Bloque de inicializacion NO estatico
    //Se ejecuta cada vez que se crea un obejeto de esta clase
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
