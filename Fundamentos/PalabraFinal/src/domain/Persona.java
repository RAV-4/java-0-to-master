
package domain;

//Clase no puede tener clases hijas
public final class Persona {
    public final static int MI_CONSTANTE = 10;
    
    private String nombre;
    //metodo no se puede sobreescribir en clases hijas
    public final void imprimir(){
        System.out.println("Imprimir con final");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
