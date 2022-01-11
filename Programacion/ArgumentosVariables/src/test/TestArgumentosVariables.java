package test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 5, 6);
        imprimirNumeros(4, 5 , 6 , 7);
        variosParametros("Juan", 34, 4, 3);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
