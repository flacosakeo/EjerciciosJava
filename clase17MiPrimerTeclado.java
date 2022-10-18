//importacion de bibliotecas
import java.util.*;

//practico de clases objetos y metodos
//objeto escaner, sirve para ingreso por teclado

public class clase17MiPrimerTeclado {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //declaro el objeto
        Scanner miTeclado;

        //inicializacion del objeto scanner
        //o mi primer teclado
        miTeclado = new Scanner(System.in);
        
        //declaro variables
        String nombre;
        int numeroEntero1;
        int numeroEntero2;
        Double numero1;
        Double numero2;
        
        //declarar instrucciones de entrada y salida
        System.out.println("Ingrese su nombre");
        nombre = miTeclado.nextLine();

        System.out.println("Ingrese su 1er numero entero");
        numeroEntero1 = miTeclado.nextInt();

        System.out.println("Ingrese su 2do numero entero");
        numeroEntero2 = miTeclado.nextInt();

        System.out.println("Ingrese su 1er numero decimal expresa con COMA");
        numero1 = miTeclado.nextDouble();

        System.out.println("Ingrese su 2do numero decimal expresado con COMA");
        numero2 = miTeclado.nextDouble();
        
        //se muestran las operaciones que se realizan
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Los numero enteros que ingreso son: "+numeroEntero1+" y "+numeroEntero2);
        System.out.println("La suma de los numero enteros es: "+(numeroEntero1+numeroEntero2));
        System.out.println("La resta de los numero enteros es: "+(numeroEntero1-numeroEntero2));
        System.out.println("La multiplicacion de los numero enteros es: "+(numeroEntero1*numeroEntero2));
        System.out.println("La division de los numero enteros es: "+(numeroEntero1/numeroEntero2));
        System.out.println("Los numeros decimales que ingreso son: "+numero1+" y "+numero2);
        System.out.println("El doble del primer numero decimal ingresado es: "+(numero1*2));
        System.out.println("El triple del segundo numero decimal ingresado es: "+(numero2*3));
        System.out.println("***Fin del programa***");
        


    }
}
