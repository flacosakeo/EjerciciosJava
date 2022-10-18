public class clase19Parseo {
    public static void main(String[] args) {
        /* Supongamos haber ingresado a nuestro sistema el numero 453 
pero como cadena pero debo trabajar con el como de tipo int*/

String numString = "453";

//Parseo
int numInt;
numInt = Integer.parseInt(numString);

       System.out.println("numString = " + (numString+24));
       System.out.println("numInt = " + (numInt+24));
    }
}
