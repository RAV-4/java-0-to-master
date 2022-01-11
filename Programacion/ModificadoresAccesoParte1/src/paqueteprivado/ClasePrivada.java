package paqueteprivado;

class ClasePrivada {
    private String atributoPrivado = "Valor Atributo privado";
    
    private ClasePrivada(){
        System.out.println("Constructor privado");
    }
    
    private ClasePrivada(String arg){
        System.out.println("Constructor privado");
    }
    
    private void metodoPrivadp(){
        System.out.println("Metodo privado");
    }
}

//Solo tenemos acceso a las caracteristicas desde la misma clase, no se tiene acceso desde niguna otra clase, así esta sea una clase hija