public class clase20PromediosConArray {
    public static void main(String[] args) {
        //declaracion instanciacion e inicializacion
        double [] notas = {1,5,6,8,10,9};
        double suma = 0;
        double promedio = 0;

        //for each
        for (double nota : notas){
            suma += nota;//suma = suma + nota
        }

        //hallar el promedio
        promedio = suma / notas.length;

        //muestro resultado
        System.out.println("El promedio es: "+promedio);
    }
}
