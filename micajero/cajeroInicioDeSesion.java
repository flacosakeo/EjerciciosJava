import java.io.IOException;
import java.util.Scanner;

public class cajeroInicioDeSesion {
    static int inicioSesion (String usuario, String password, Scanner miTeclado, int ban, int contador) throws InterruptedException, IOException{

        for (int i=1; i<3; i++){//ciclo for para contabilizar la cantidad de intentos para iniciar sesion            
                
            if (usuario.equals("kofla") && password.equals("1234")){//condicion que compara lo ingresado con un
                                                                    // usuario y contraseña fijo
                ban=1;//variable ban o bandera o interruptor que se activa para lograr correr el while del menu principal
                cajeroLimpiar.limpiar();//llamo a la funcion para limpiar pantalla
                break;//interrumpe el ciclo for
            }else{
                cajeroLimpiar.limpiar();//llamo a la funcion para limpiar pantalla
                contador++;//el contador se suma en 1 para contabilizar los intentos fallidos
                System.out.println("Usuario o contraseña incorrecto, intento número "+contador);//mensaje de error al intentar iniciar sesion mas la cantidad de veces que lleva intentandolo
                System.out.print("ingrese usuario:");//mensaje
                usuario = miTeclado.nextLine();//vuelvo a repetir el pedido de usuario ya que si no se coloca
                                                // al iniciar el for lo ignora
                System.out.print("ingrese contraseña:");//pido ingreso de clave
                password = miTeclado.nextLine();//guardo en variable la conraseña ingresada
                
                if (contador==3){//si el contador llega a 3 intentos fallidos se bloquea el usuario y se cierra el programa
                    System.out.println("Alcanzo el máximo de intentos permitidos, usuario bloqueado");//mensaje de aviso que alcanzo el numero maximo de intentos y el bloqueo de usuario
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                }                
            }
        }
        return ban;//retorno la variable que activa el menu principal
    }

    
}
