import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class cajeroPagoDeServicios {

    static double pagos (String importe, double saldo, int servicio, ArrayList <String> ultimosMovimientos, Scanner miTeclado, String descripcionServicio) throws InterruptedException, IOException{
        Double importeConvertido=cajeroControl.control(importe, miTeclado);
        while (importeConvertido>saldo | importeConvertido <=0){//bucle que utilizo para obligar al usuario a
            //ingresar un importe dentro del rango permitido segun sea su saldo
            System.out.print("El importe a pagar es mayor al saldo, reingrese:");//mensaje de aviso que el importe ingresado no es correcto
            importe=miTeclado.nextLine();//guardo en variable el nuevo importe
            importeConvertido=cajeroControl.control(importe, miTeclado);
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
        }

        System.out.print( "Confirme operación 1-SI / 2-NO:");//solicitud de confirmacion de la operacion que realiza
        String rta2=miTeclado.nextLine();//guardo en variable la respuesta 1si o 2no
        //rta2=miTeclado.nextLine();
        System.out.println("-----------------------------");//lineas divisorias para una mejor comprension

        if (rta2.equals("1")){//si la respuesta es si
            cajeroLimpiar.limpiar();
            saldo=saldo-importeConvertido;//resto al saldo el importe ingresado
            System.out.println("Pago realizado, su saldo actual es de $"+saldo);//mensaje de confirmacion de operacion mas saldo actual
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
            //llamo a la funcion cargar arraylist para registrar el movimiento
            cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    PAGO DE SERVICIO DE "+descripcionServicio+servicio+" -- "+"Importe: $"+importeConvertido, ultimosMovimientos);
            return saldo;
        }

        if (rta2.equals("2")){//si respuesta es no
            cajeroLimpiar.limpiar();
            System.out.println("Operación cancelada...");//mensaje de operacion cancelada
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
            return saldo;
        }    

        if (!rta2.equals("2") | !rta2.equals("1")){//si la respuesta es cualquier otro numero ingresado que no sea 1 o 2
            cajeroLimpiar.limpiar();
            System.out.println("Operación cancelada por mal ingreso de confirmación");//mensaje de cancelacion de operacion por mal ingreso de opcion
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
        }
        return saldo;//retorno el nuevo saldo
    }
}
