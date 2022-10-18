public class clase20Arrays {






    public static void main(String[] args) {

      
        
        //declaracion de array
        int [] numeros;//por convencion el nombre del array siempre es plural

        //instanciacion del array
        numeros = new int [3];

        //inicializacion del array
        numeros [0] = 156;//indice 0 posicion 1
        numeros [1] = 14;//indice 1 posicion 2
        numeros [2] = 9;//indice 2 posicion 3

        //declaracion inicializacion de un array en una misma linea
        int [] otroArray = {1,25,100,101};

        //longitud del array con la clausula .length
        System.out.println("La longitud del array otroArray es: "+otroArray.length);

        //hallar el valor del index 0
        System.out.println("El valor del index 0 es: "+otroArray[0] );

        //hallo el ultimo elemento sin saber la longitud del array
        System.out.println("El ultimo elemento de otroArray es: "+otroArray[otroArray.length-1]);

        //bucle for para mostrar los elementos del array
        for (int i=0; i<otroArray.length; i++ ){
            System.out.println("Indice "+i+" Posicion "+(i+1)+" Numero: "+otroArray[i]);
        }

        //sobreescritura
        otroArray[2]=70;
        for (int i=0; i<otroArray.length; i++ ){
            System.out.println("Indice "+i+" Posicion "+(i+1)+" Numero: "+otroArray[i]);
        }

        //bucle FOR EACH
        for (int numero:otroArray){
            System.out.println("Numero: "+numero);
        }

      
    }
}
