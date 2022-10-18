public class clase23Cadenas {
    public static void main(String[] args) {

        //Declaracion e inicializacion de variables
        String texto1 = "Mi texto";
        String texto2 = "mi texto";
        String texto3 = "   mi texto con espacios     ";

        //Operaciones con Strings
        //Imprimo la letra del index 1
        System.out.println(texto1.charAt(1));
        //Comparamos detalladamente los strings
        System.out.println(texto1.compareTo(texto2));
        //Comparamos ingnorando may y minus
        System.out.println(texto1.compareToIgnoreCase(texto2));
        //Concatenamos strings
        System.out.println(texto1.concat(texto2));
        //Buscamos coincidencias
        System.out.println(texto1.contains("texto"));
        //Comparo con verdadero falso
        System.out.println(texto1.equals(texto1));
        //Está vacía?
        System.out.println(texto1.isEmpty());
        //Volver a mayuscula, esto es ideal para los ingresos de datos.
        System.out.println(texto1.toUpperCase());
        //Volver a minusculas
        System.out.println(texto1.toLowerCase());
        //Recortar cadena
        System.out.println(texto3.trim());
    }
}