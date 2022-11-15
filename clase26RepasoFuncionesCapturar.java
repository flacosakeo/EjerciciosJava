import java.util.Scanner;

public class clase26RepasoFuncionesCapturar {

static String miTeclado(String variable){
    //Declaro el objeto y lo instancio
    Scanner miTeclado = new Scanner(System.in);
    //Preparacion de la inicializacion
    variable = miTeclado.nextLine();
    //Valor de retorno
    return variable;     
}
    

}