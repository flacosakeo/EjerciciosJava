//zona de librerias


public class clase22FuncionesConArrayList2 {
    //zona de funiones

    //1 funcion que simula un .size para hallar la longitud del array
    static void size(int[] nombreArray){
        System.out.println("La longitud del ArrayList es: "+nombreArray.length);
        System.out.println("---------------------------------");
    }
    static void size(String[] nombreArray){
        System.out.println("La longitud del ArrayList es: "+nombreArray.length);
        System.out.println("---------------------------------");
    }

    static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    static void imprimir(int[] nombreArray){
        for (int i:nombreArray){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("---------------------------------");
    }

    static void imprimir(String[] nombreArray){
        for (String i:nombreArray){
            System.out.print(i);            
        }
        System.out.println();
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        
        //declaramso e instanciamos e inicializamos nuestro arraylist
        int[] numeros = {1,45,65,55,20,101};
        int[] numeros2 = {3,44,89,67,100,24,55,73};
        String[] letras = {"L", "A", "Z", "A", "R", "T", "E"};

        //probamos nuestras funciones
        imprimir ("El ArrayList numeros es: ");
        size(numeros);
        imprimir ("El ArrayList numeros2 es: ");
        size(numeros2);
        imprimir ("El ArrayList letras es: ");
        size(letras);
        imprimir(numeros);
       
        imprimir(numeros2);
        
        imprimir(letras);

        
    }
}
