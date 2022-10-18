import java.util.*;


public class clase20ArrayList {
    public static void main(String[] args) {
        
        //declaracion de un arraylist
        ArrayList <String> autos;

        //instanciacion del arraylist
        autos = new ArrayList <String>();

        //metodos del arraylist
        //metodo insertar .add()
        autos.add("Fiat");
        autos.add("Volkswagen");
        autos.add("Renault");
        autos.add("Peugeot");

        //metodo impresion
        System.out.println("El ArrayList Autos es: "+autos);
        System.out.println("--------------------------------");

        //obtener longitud del arraylist
        System.out.println("La longitud del ArrayList es: "+autos.size());
        System.out.println("--------------------------------");

        //añadimos otro elemento en cualquier momento
        autos.add("BMW");
        System.out.println("El ArrayList Autos es: "+autos);
        System.out.println("La longitud del ArrayList es: "+autos.size());
        System.out.println("--------------------------------");

        //getters y setters
        //getters obtengo un elemento del array
        //setters lo modifica
        //autos.get(indice);
        System.out.println("El valor del elemento del indice 3 es: "+autos.get(3));
        System.out.println("--------------------------------");

        //autos.set(indice, "valor")
        autos.set(1, "Ford");
        System.out.println("El ArrayList Autos con el indice 1 modificado: "+autos);
        System.out.println("--------------------------------");

        //obtener el ultimo elemento
        int tamañoArray = autos.size();
        System.out.println("El tamaño de ArrayList es: "+tamañoArray);
        System.out.println("--------------------------------");

        //obtener el elemento 5
        System.out.println("El ultimo elemento del ArrayList es: "+autos.get(autos.size()-1));

        //buscamos el indice de un elemento
        System.out.println("Busco un elemento en el ArrayList 'Renault', esta en posicion "+autos.indexOf("Renault"));
        System.out.println("--------------------------------");

        //eliminar un elemento autos.remove(index)
        autos.remove(0);
        System.out.println("El ArrayList resultante es: "+autos);
        System.out.println("--------------------------------");

         //ordenar alfabeticamente
         Collections.sort(autos);
         System.out.println("La lista ordenas es: "+autos);
         System.out.println("--------------------------------");

         //buscamos un elemento con un metodo boleano
         boolean resultado = autos.contains("Citroen");
         System.out.println("Existe el elemento?: "+resultado);

    }
}
