import java.util.InputMismatchException;
import java.util.Scanner;

public class clase31Tarea {
    public static void main(String[] args) throws InputMismatchException {
        Scanner teclado = new Scanner(System.in);
        
        int tnum1, tnum2, resultado;
        System.out.println("Tarea desafio");
        try{
            System.out.print("Ingrese primer numero entero: ");
            tnum1=teclado.nextInt();
            //tnum1=teclado.nextInt();
            System.out.print("Ingrese segundo numero entero: ");
            tnum2=teclado.nextInt();
            //tnum2=teclado.nextInt();
            resultado=tnum1*tnum2;
            System.out.println("La multiplicacion es: "+resultado);
        }catch(InputMismatchException error2){
            System.out.println("Debe ingresar un numero entero, no se pudo realizar la operación");
            System.out.println("***Fin del programa***");
        }
        teclado.close();
    }
}
