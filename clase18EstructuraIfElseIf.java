import java.util.*;

public class clase18EstructuraIfElseIf {
    public static void main(String[] args) {
       //inicializar teclado
       Scanner miTeclado;
       miTeclado=new Scanner(System.in);

        //declarar variables e inicializamos
        int nota;
        String alumno;

        //pido ingreso de numero
       System.out.println("Ingrese nombre del alumno");
       alumno = miTeclado.nextLine();

       System.out.println("Ingrese nota del alumno");
       nota = miTeclado.nextInt();
       
       //cerrar teclado
       miTeclado.close();

        //estructura If Else If
        if (nota==10){
            System.out.println("alumno cuadro de honor");
        }else if(nota>=6 && nota<10){
            System.out.println("alumno regular");
        }else if(nota>=1 && nota<6){
            System.out.println("alumno en proceso");
        }else if(nota==0){
            System.out.println("alumno debe recursar");
        }else{
            System.out.println("indroduzca una nota valida");
        }

        //instruccion de salida simple
        System.out.println("**fin del programa**");
    }
}
