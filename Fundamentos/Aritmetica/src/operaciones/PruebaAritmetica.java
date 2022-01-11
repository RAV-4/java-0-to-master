
package operaciones;

/**
 *
 * @author rav4
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        Aritmetica aritemtica1 = new Aritmetica();
        System.out.println("aritemtica1 a = " + aritemtica1.a);
        System.out.println("aritemtica1 b = " + aritemtica1.b);
        aritemtica1.a = a;
        aritemtica1.b = b;
        aritemtica1.sumar();
        int resultadoSuma = aritemtica1.sumarConRetorno();
        System.out.println("resultadoSuma = " + resultadoSuma);
        
        int resultadoConParametros = aritemtica1.sumarConArgumentos(8, 5);
        System.out.println("resultadoConParametros = " + resultadoConParametros);
        
        Aritmetica aritemtica2 = new Aritmetica(5, 8);
        System.out.println("aritemtica2 a = " + aritemtica2.a);
        System.out.println("aritemtica2 b = " + aritemtica2.b);
    }
}
//Dentro de un metodo estatico no se puede acceder al operador this
