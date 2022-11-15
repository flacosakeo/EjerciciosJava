import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;



public class cajeroUltimosMovimientos {
    static void UltimosMovimientos(ArrayList<String> ultimosMovimientos) throws InterruptedException, IOException{
        cajeroLimpiar.limpiar();
        System.out.println("*** ULTIMOS MOVIMIENTOS ***");//encabezado
        System.out.println();//espacio entrelineas para una mejor comprension
        //Collections.sort(al, Collections.reverseOrder()); ordena el array a la inversa

        ListIterator iter = ultimosMovimientos.listIterator(ultimosMovimientos.size());
        while (iter.hasPrevious()){
            System.out.println(iter.previous());
        }
        

        //for (String i:ultimosMovimientos){//ciclo que recorre el arraylist y muestra por pantalla cada registro
            //System.out.println(i);//muestro registro           
        //}
        System.out.println();//espacio entrelineas para una mejor comprension
        System.out.println("---------------------------------");//lineas divisorias para una mejor comprension
    }
}
