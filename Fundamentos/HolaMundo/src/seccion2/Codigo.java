/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion2;

import java.util.Scanner;

/**
 *
 * @author rav4
 */
public class Codigo {
    private void codigo(){
        /*System.out.println("Hola Mundo desde Java");
        
        //Definimos variable entera
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        //Modificamos la variable entera
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCandena = "Saludos";
        System.out.println(miVariableCandena);
        
        miVariableCandena = "Adios";
        System.out.println(miVariableCandena);
        
        //Var - inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //Valores permitidos en nombrado variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        var áMiVariable = 4; //No se recomienda utilizar
        
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;

        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);//Se realiza la suma de numeros
        System.out.println(i + j + usuario);//Se evalua de izq a derecha imprime suma y luego texto
        System.out.println(usuario + i + j);//imprime texto y los numeros concatenados
        System.out.println(usuario + (i + j));//realiza primero la operacion de los parentesis
        
        var nombre = "Karla";
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble \" " + nombre + "\"");
        
        
        System.out.println("Informacion del Libro\n");
        System.out.println("Proporciona el titulo:");
        Scanner consola = new Scanner(System.in);
        var tit = consola.nextLine();
        System.out.println("Proporciona el autor");
        var autor = consola.nextLine();
        System.out.println(tit + " fue escrito por " + autor);
        
        /*
            Tipos Primitivos enteros: byte, short, int, long
        */
        
        /*byte numeroByte = (byte)129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo Short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroShort = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        long numeroLong = (long)9223372036854775808D;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo int: " + Long.MIN_VALUE);
        System.out.println("Valor maximo int: " + Long.MAX_VALUE);
        
        /*
            Tipos Primitivos de tipo flotante: float y double
        */
        
        /*float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
        
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);

        var miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        var varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        var varCharDecimal = (char)33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        var varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        int variableEnteraPeroConSimbolo = '1';
        System.out.println("variableEnteraPeroConSimbolo = " + variableEnteraPeroConSimbolo);
        
        int letraA = 'a';
        System.out.println("letraA = " + letraA);
        
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean) {
            System.out.println("La bandera es verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        var esAdulto = edad >= 18;
        
        if(esAdulto){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menos de edad");
        }
        
        //Convertir un tipo String a un int
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var edad2 = "20";
        System.out.println("edad2 = " + edad + 1);
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //Pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        var consola = new Scanner(System.in);
        
        System.out.println("Tienda de Libros\n");
        System.out.println("Proporciona el nombre:");
        var titulo = consola.nextLine();
        System.out.println("\nProporciona el id:");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("\nProporciona el precio:");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("\nProporciona el envio gratuito:");
        var envioGratuito = Boolean.valueOf(consola.nextLine());
        
        System.out.println("\n" + titulo + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito " + envioGratuito);
        
        
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado = " + resultado);
        
        if(a % 2 == 0){
            System.out.println("Es numero par");
        }
        else {
            System.out.println("Es numero impar");
        }

        
        int a = 3, b =2;
        int c = a + 5 - 2;
        
        System.out.println("c = " + c);
        
        a += 3; //a = a + 1
        System.out.println("a = " + a);
        
        a -= 2;
        System.out.println("a = " + a);
        
        a *= 2;
        System.out.println("a = " + a);
        
        
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Incrento
        //1. Preincremeto (Simbolo antes de la variable)
        var e = 3;
        var f = ++e;//Primero se incrementa el valor y luego se asigna
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2.PostIncremneto (Simbolo antes de la variable)
        var g = 5;
        var h = g++;//Primero se utiliza el valor y luego se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //Decremto
        //Predecrento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //PostDecrento
        var k = 4;
        var l = k--;//Primero se utiliza el valor y posteriormente se decrementa
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = cadena == cadena2; //Se compara las referencias en memoria
        System.out.println("e = " + e);
        var f = cadena.equals(cadena2); //Comparamos contenido
        System.out.println("f = " + f);

        var g = a > b;//mayor que > mayor o igual >=
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es numero Par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es adulto");
        }
        else {
            System.out.println("No es adulto");
        }
        
        var a = -10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= valorMinimo && a <= valorMaximo;
        
        if(resultado){
            System.out.println("Dentro del rango");
        }
        else {
            System.out.println("Fuera del rango");
        }
        
        var vacaciones = false;
        var diaDescanso = true;
        
        if( vacaciones || diaDescanso ) {
            System.out.println("Padre puede asistir al juego del hijo");
        }
        else {
            System.out.println("El padre esta ocupado");
        }
        
        var resultado = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero % 2 == 0) ? "Numero es Par" : "Numero es impar";
        System.out.println("resultado = " + resultado);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y); 
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        var scanner = new Scanner(System.in);
        System.out.println("Rectangulo\n");
        
        System.out.println("Proporciona el alto:");
        var alto = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Proporciona el ancho:");
        var ancho = Integer.parseInt(scanner.nextLine());
        
        var area = alto + ancho;
        var perimetro = (alto + ancho) * 2;
        
        System.out.println("\nResultados");
        System.out.println("Area: " + area);
        System.out.println("Perimetro:" + perimetro);
        
         var scanner = new Scanner(System.in);
        
        System.out.println("Proporciona el numero1:");
        var numero1 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Proporciona el numero1:");
        var numero2 = Integer.parseInt(scanner.nextLine());
        
        var numeroMayor = numero1 > numero2 ? numero1 : numero2;
        System.out.println("El numero mayor es:\n" + numeroMayor);
        
        var condicion = true;
        
        if (condicion) {
            System.out.println("Condicion verdadera");
        }
        else {
            System.out.println("Condicion falsa");
        }
        
        ar mes = 10;
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);
        
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el mes");
        
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);
        
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        
        var numero = Integer.parseInt(consola.nextLine());
        var numeroTexto = "Valor Desconocido";
        
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Numero no encontrado";         
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        //Optimizado
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        
        var numero = Integer.parseInt(consola.nextLine());
        var numeroTexto = "Valor Desconocido";
        
        numeroTexto = switch (numero) {
            case 1 -> "Numero uno";
            case 2 -> "Numero dos";
            case 3 -> "Numero tres";
            case 4 -> "Numero cuatro";
            default -> "Numero no encontrado";
        };
        System.out.println("numeroTexto = " + numeroTexto);
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        
        var valor = Double.parseDouble(consola.nextLine());
        var calificacion = "Valor Desconocido";
        
        if (valor >= 9 && valor <= 10) {
            calificacion = "A";
        } else if (valor >= 8 && valor < 9) {
            calificacion = "B";
        } else if (valor >= 7 && valor < 8) {
            calificacion = "C";
        } else if (valor >= 6 && valor < 7) {
            calificacion = "D";
        } else if (valor >= 0 && valor < 6) {
            calificacion = "F";
        }
        System.out.println(calificacion);
        
        var contador = 0;
        while ( contador < 3 ) {
            System.out.println("contador = " + contador);
            contador++;
        }
        
        var contador = 0;
        do {
             System.out.println("contador = " + contador);
             contador++;
        } while (contador < 3);
        
        
        for ( var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue;
                //Omite las demas lineas e inicia la siguente iteracion
            }
            System.out.println("contador con continue = " + contador);
        }
        
        for ( var contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador con break = " + contador);
                break;
                //Termina o rompe el ciclo
            }
        }
        
        inicio:
        for ( var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue inicio;
                //Se dirige a la linea con la etiqueta
            }
            System.out.println("contador con continue = " + contador);
        }
        
        
        for ( var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue;
                //Omite las demas lineas e inicia la siguente iteracion
            }
            System.out.println("contador con continue = " + contador);
        }
        
        for ( var contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador con break = " + contador);
                break;
                //Termina o rompe el ciclo
            }
        }
*/
    }
}
