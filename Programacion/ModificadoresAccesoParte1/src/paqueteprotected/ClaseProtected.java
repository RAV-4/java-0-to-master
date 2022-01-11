package paqueteprotected;


public class ClaseProtected {
    protected String atributoProtected = "Valor Atributo protected";
    
    protected ClaseProtected(){
        System.out.println("Constructor Protected");
    }
    
    public ClaseProtected(String arg){
        System.out.println("Constructor Publico");
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo Protected");
    }
}