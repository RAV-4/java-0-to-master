package paqueteDefault;

public class TestClaseDefault {
    public static void main(String[] args) {
        ClaseDefault claseDefault = new ClaseDefault();
        claseDefault.atributoDefault = "Cambio desde la prueba";
        System.out.println("Clase default atibuto default = " + claseDefault.atributoDefault);
        claseDefault.metodoDefault();
    }
}
