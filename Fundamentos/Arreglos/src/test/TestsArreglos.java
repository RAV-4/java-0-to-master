
package test;


public class TestsArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        edades[1] = 5;
        edades[2] = 2;
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " + edades[2]);
        
        for(int i = 0; i < edades.length; i++) {
            System.out.println("edades en la posicion " + i + ": " + edades[i]);
        }
        
        String frutas[] = {"Naranja", "Manzana", "Uva"};
        System.out.println("frutas tamano= " + frutas.length);
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
