import java.util.Scanner;
import java.util.InputMismatchException;

public class clase31Excepciones {
    public static void main(String[] args) throws InputMismatchException{
        Scanner teclado = new Scanner(System.in);

        int num, resultado;

        try {
            System.out.print("Ingrese numero: ");
            num=teclado.nextInt();

            resultado=num*num;
            System.out.println("El cuadrado de "+num+" es "+resultado);
        }catch(InputMismatchException error1){
            System.out.println("Debe ingresar un numero entero, no se pudo realizar la operación");
            
        }


        teclado.close();
    }
}
