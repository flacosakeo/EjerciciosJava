import java.io.IOException;

public class cajeroLimpiar {
    static void limpiar() throws InterruptedException, IOException{//declaracion de funcion limpiar
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//comando que limpia la pantalla
    }
}
