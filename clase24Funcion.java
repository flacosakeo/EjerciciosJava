import java.util.Scanner;
import java.util.ArrayList;

public class clase24Funcion {
    //A funciones para almacenar datos por teclado
    static double teclado(double dato){
        //1 declaro objeto
        Scanner miTeclado;
        //2 instanciar el objeto
        miTeclado = new Scanner(System.in);
        //3 inicializar
        dato = miTeclado.nextDouble();
        //4 valor del retorno
        miTeclado.close();//cierro teclado de memoria
        return dato;

    }

    static String teclado(String dato){
        //1 declaro objeto
        Scanner miTeclado;
        //2 instanciar el objeto
        miTeclado = new Scanner(System.in);
        //3 inicializar
        dato = miTeclado.nextLine();
        //4 valor del retorno
        miTeclado.close();//cierro teclado de memoria
        return dato;

    }

    static void imprimir (String mensaje){
        System.out.println(mensaje);
    }

    static void imprimir (double mensaje){
        System.out.println(mensaje);
    }

    //B funcion para correr un arraylist y que permita obtener un promedio
    static double promedio(ArrayList<Double> nombreArrayList){
        //1 declaracion, inicilizacion de variables
        double acum = 0;
        double promedio = 0;
        //2 hacemos nuestro bucle foreach
        for(double elemento:nombreArrayList){
            acum += elemento;//acum = acum + elemento;
        }
        //3 procesos, calculamos el promedio
        promedio = acum/nombreArrayList.size();
        //4 valor de retorno
        return promedio;

    }
}
