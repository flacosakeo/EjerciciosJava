public class clase21Funciones {
    
    //aqui se tipean las funciones
    //funciones tipo void, no devuleven un valor
    static void imprimir(String mensaje){
        System.out.println("El valor de variable es: "+mensaje);
    }


    //funcion que me devuelve la longitud del array
    static void impresion(String mensaje1){
        System.out.println("El valor de otra variable: "+mensaje1);
    }

    //funcion con 2 parametros
    static void saludo(String nombre, int edad){
        System.out.println("Hola "+nombre+" tu edad es de "+edad+" años.");

    }

    //otra funcion donde suma 2 numeros pero con el mismo nombre
    //java ya reconoce la cantidad de parametros que ingresa y sabe que funcion usar
    static void saludo(String nombre, int num1, int num2){
        System.out.println("Hola "+nombre+" la suma de tus 2 numeros es "+(num1+num2));

    }


    public static void main(String[] args) {
        imprimir("Esta es una prueba de una impresion mediante una funcion");

        impresion("Hola Mundo");

        //saludo personalizado con una funcion
        saludo("Eduardo", 38);

        saludo("Eduardo", 1,12);
        
    }

  
}
