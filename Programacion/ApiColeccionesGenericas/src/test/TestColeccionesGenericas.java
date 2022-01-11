package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        //Lista
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes"); 
        miLista.add("Sabado");
        miLista.add("Domingo");
        imprimir(miLista);
        String elementoLista = miLista.get(0);
        System.out.println("elemento lista = " + elementoLista);
         
        System.out.println("");
        
        //Set
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);
        
        System.out.println("");
        
        //Map
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "JKarla");
        miMapa.put("Valor3", "Rosario");
        
        String elemento =  miMapa.get("Valor1");
        System.out.println("elemento mapa = " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
        
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
