
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Documented Tema Excepciones
 * @dominio Codo a Codo Inicial 2022
 * @author Fernando Lucena
 * */


/*
* Realizaremos una función división, la dividiremos por 0 y observaremos el resultado.
* */

public class clase31TryCatch {
    //Zona de funciones
    static double division (double dividendo, double divisor) throws ArithmeticException{
        //Variables
        double aux;

        //Estructura de control if evalúa y lanza excepciones
        if (divisor != 0){
            aux = dividendo/divisor;
        }
        else{
            throw new ArithmeticException();
        }
        return aux;
    }

    public static void main(String[] args) throws Exception, InputMismatchException{
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        double dividendo = 0, divisor=1, resultado;

        //Salida-Entrada con excepciones en la entrada de datos
        try{
            System.out.println("Ingrese un numero");
            dividendo = sc.nextDouble();
            System.out.println("Ingrese otro numero");
            divisor = sc.nextDouble();
            }catch (InputMismatchException ex){
                System.out.println("Debe ingresar obligatoriamente un numero entero.\n");
                System.out.println("** Reinicie el programa y cargue adecuadamente los datos. **");
                System.exit(0);
            }

        //Proceso con excepciones en el calculo
        try {
            resultado = division(dividendo, divisor);
            System.out.println("El resultado es " + resultado);
        } catch (ArithmeticException e1){
            System.out.println("Intentaste dividir por 0");
        } catch (Exception e2) {
            System.out.println("La operacion no se puede realizar");
        } finally {
            System.out.println("El programa ha terminado");
        }
        sc.close();
    }
}
