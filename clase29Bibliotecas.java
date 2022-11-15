import java.util.Scanner;
//java.lang no hace falta importar, ya viene cargada

public class clase29Bibliotecas {
    public static void main(String[] args) {
    
        Scanner miTeclado = new Scanner(System.in);//System es una clase, in es un metodo asociado a esa clase

        System.out.print("Introduzca la base: ");//System es una clase,
        double x = miTeclado.nextDouble();

        //System.exit(0);//produce un cierre o una salida

        System.out.print("Introduzca la potencia: ");//System es una clase,
        int y = miTeclado.nextInt();

        double resultado = Math.pow(x, y);
        System.out.println("El Numero "+x+" elevado a "+y+","+" da como resultado: "+resultado); 
    
        miTeclado.close();
    }
}
