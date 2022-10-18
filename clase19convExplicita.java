public class clase19convExplicita {
    public static void main(String[] args) {
        /*Conversion explicita, casting o casteo
        Supongamos tener una variable del tipo double pero por alguna razon debemos pasarla a un tipo
        inferior por ejemplo int*/

        double miDecimal = 100.856341;

        //Casteo
        int miEntero = (int) miDecimal;

        System.out.println("miDecimal = " + miDecimal);
        System.out.println("miEntero = " + miEntero); 
    }
}
