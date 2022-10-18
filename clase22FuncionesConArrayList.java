import java.text.*;
import java.time.LocalDateTime;
import java.util.*;

public class clase22FuncionesConArrayList {
    
    public static void main(String[] args) {
        
        //los arraylist hay que importar java.util.arraylist o *
        //1 declaracion 
        ArrayList <String> frutas;

        //2 instaciacion
        frutas = new ArrayList <String>();

        //3 inicializacion
        //LocalDateTime fecha=LocalDateTime.now();
        String fecha1=String.valueOf(LocalDateTime.now())+" HOLA";
        
        
        
        frutas.add("Manzana");
        frutas.add("Naranja");
        frutas.add("Banana");
        frutas.add("Sandia");
        frutas.add("Limon");

        //METODOS DEL ARRAYLIST//
        //1 imprimir nuestro arraylist
        System.out.println("Mi ArrayList es :"+frutas);
        System.out.println("--------------------------------");
        
        //2 metodo para obtener un dato .get
        System.out.println("El indice 1 es "+frutas.get(1));
        System.out.println("--------------------------------");

        //3 metodo .set para cambiar un valor en mi arraylist, es un procedimiento
        frutas.set(3,"Mandarina");
        System.out.println("Mi nuevo arraylist es: "+frutas);
        System.out.println("--------------------------------");
        
        //4 metodo que no necita parametros pero devuelve algo .size()
        System.out.println("La longitud de mi arraylist es: "+frutas.size());
        System.out.println("--------------------------------");

        //5 metodo como tal a traves de la llamada a un objeto
        // hay que importar java.util.collections o *
        Collections.sort(frutas);
        Collections.reverse(frutas);
        System.out.println("Mi arraylist ordenado alfabeticamente "+ frutas);
        System.out.println("--------------------------------");

        System.out.println( fecha1);

    }

 


    
}
