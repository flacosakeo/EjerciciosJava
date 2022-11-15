import java.util.Scanner;

public class Teclado {
    //A- Funciones para almacenar datos por teclado
static double num1(double dato){
    //1-Declaro el objeto
    Scanner miTeclado;
    //2-Instanciamos el objeto
    miTeclado = new Scanner(System.in);
    //3-Inicializar
    dato = miTeclado.nextDouble();
    //4-Valor de retorno
    return dato;
}

    //A- Funciones para almacenar datos por teclado
static int num(int dato){
    //1-Declaro el objeto
    Scanner miTeclado;
    //2-Instanciamos el objeto
    miTeclado = new Scanner(System.in);
    //3-Inicializar
    dato = miTeclado.nextInt();
    //4-Valor de retorno
    return dato;
}
static String teclado(String dato){
    //1-Declaro el objeto
    Scanner miTeclado;
    //2-Instanciamos el objeto
    miTeclado = new Scanner(System.in);
    //3-Inicializar
    dato = miTeclado.nextLine();
    //4-Valor de retorno
    return dato;
}


    

}