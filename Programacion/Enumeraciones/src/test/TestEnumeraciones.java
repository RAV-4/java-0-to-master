
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1 de la semana " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        
        System.out.println("---------------");
        System.out.println("Continente numero 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises en el cuarto continente = " 
                 + Continentes.AMERICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
        }
    }
}
