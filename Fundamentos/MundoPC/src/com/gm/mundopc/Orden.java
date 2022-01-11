package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private final Computadora[] computadoras;
    private int contadorComputadoras;
    private static int contadorOrdentes;
    private final static int MAXIMO_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdentes;
        this.computadoras = new Computadora[Orden.MAXIMO_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.MAXIMO_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado la cantidad maxima de computadoras: " + Orden.MAXIMO_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("--------");
        System.out.println("Computadoras de la orden:");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println((i+1)+". " + this.computadoras[i]);
        }
        System.out.println("--------");
    }
}
