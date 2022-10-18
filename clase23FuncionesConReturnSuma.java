import java.util.*;

public class clase23FuncionesConReturnSuma {
    static int sumaEnteros(int num1, int num2){
        //1 declaro una variable, inicializo en una linea
        int resultado = num1 + num2;
        //devolucion de la funcion
        return resultado;
    }
    public static void main(String[] args) {
        Scanner miTeclado;
        miTeclado = new Scanner (System.in);

        int num1, num2;

        System.out.print("Ingrese numero 1: ");
        num1=miTeclado.nextInt();

        System.out.print("Ingrese numero 2: ");
        num2=miTeclado.nextInt();

        
        System.out.print("El resultado de la suma es: "+sumaEnteros(num1, num2));
        miTeclado.close();
    }
}
