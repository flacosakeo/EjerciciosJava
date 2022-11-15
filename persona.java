import java.util.LinkedList;
import java.util.List;

public class persona {
    public persona(int i, String string, int j) {
    }

    public static void main(String[] args) {
        List <persona> listaPersonas;
        listaPersonas = new LinkedList<persona>();

        listaPersonas.add(new persona(1,"eduardo",38));
        listaPersonas.add(new persona(2,"ruben",30));

        listaPersonas.add(new persona(0,"lazarte",12));

        for (persona pers:listaPersonas){
            System.out.println("Nombre: "+pers);
        }
    }
}
