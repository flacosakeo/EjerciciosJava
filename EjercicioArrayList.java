import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> numeros;
        numeros = new ArrayList<String>();

        Scanner teclado = new Scanner(System.in);

        //String numero;
        for (int i=1; i<6; i++){
            System.out.print("Introduzca "+ i +"º numero: ");
            numeros.add(teclado.nextLine());
        }
        
        System.out.println("ArrayList: "+numeros);

        teclado.close();

    }
}
