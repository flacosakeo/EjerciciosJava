import java.util.ArrayList;

public class clase24Main {
    public static void main(String[] args) {
        //1 crear arraylist
        //declaramos
        ArrayList<Double> notas;
        //instanciamos
        notas = new ArrayList<Double>();
        //proceso de inicializacion
        //declaro variables
        String respuesta;
        double num;
        //comenzamos a cargar nuestro array
        clase24Funcion.imprimir("Cargar nota? ");
        respuesta = clase24Funcion.teclado("");
        //bucle while
        while(respuesta.toUpperCase().equals("S")){
            clase24Funcion.imprimir("Ingrese una nota al finalizar presione ENTER: ");
            num = clase24Funcion.teclado(0);
            //cargo num dentro del arraylist
            notas.add(num);
            //actualizaco mi respuesta
            clase24Funcion.imprimir("Desea cargar otra nota? (SI - NO): ");
            respuesta = clase24Funcion.teclado("");
        }
}
}
