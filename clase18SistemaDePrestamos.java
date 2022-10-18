import java.util.*;

/*
* Programar un sistema de créditos que pida el nombre del usuario y su ingreso medio,
* A partir de los datos ingresados  el programa arrojará el máximo crédito disponible.
* Las lineas de crédito son
* Ingresos inferiores a $ 50000 son clase A
* Ingresos entre $50000 y 100000 son clase B
* Ingresos mayores a 100000 son clase C
*
* En todos los casos el valor de la cuota no debe superar 1/3 del ingreso
* Hasta en 24 cuotas
*
*
* */


public class clase18SistemaDePrestamos {
    public static void main(String[] args) {
        
        
        //inicializo mi teclado
        Scanner miTeclado;
        miTeclado=new Scanner(System.in);

        //variables
        String nombre;
        double sueldo;
        char clas = 'A';

        //instruccion de E S
        System.out.println("Ingrese su nombre");
        nombre=miTeclado.nextLine();

        System.out.println("Detalle su ingreso");
        sueldo=miTeclado.nextDouble();

        //cerrar teclado
        miTeclado.close();

        //estructura If Else
        if (sueldo>0 && sueldo<=50000){
            clas='A';
        }else if(sueldo>50000 && sueldo<=100000){
            clas='B';
        }else if(sueldo>100000){
            clas='C';
        }else if(sueldo<=0 ){
            System.out.println("no puede solicitar un prestamo");
            clas='D';
        }else{
            System.out.println("mal ingresado");
        }

        //procesos
        double valorCuota=sueldo/3;
        double valorPrestamo=valorCuota*24;

        //estructura switch
        switch (clas) {
            case 'A':
                System.out.println("hola "+nombre);
                System.out.println("sus ingresos son clasificados como tipo "+clas);
                System.out.println("usted puede pedir un prestamo de hasta "+valorPrestamo);
                System.out.println("a devolver en 24 cuotas de: $ "+valorCuota);                
                break;
            case 'B':
                System.out.println("hola "+nombre);
                System.out.println("sus ingresos son clasificados como tipo "+clas);
                System.out.println("usted puede pedir un prestamo de hasta "+valorPrestamo);
                System.out.println("a devolver en 24 cuotas de: $ "+valorCuota);                
                break;
            case 'C':
                System.out.println("hola "+nombre);
                System.out.println("sus ingresos son clasificados como tipo "+clas);
                System.out.println("usted puede pedir un prestamo de hasta "+valorPrestamo);
                System.out.println("a devolver en 24 cuotas de: $ "+valorCuota);                
                break;
        
            default:
                System.out.println("mal ingresado");
                break;
        }

    }
}
