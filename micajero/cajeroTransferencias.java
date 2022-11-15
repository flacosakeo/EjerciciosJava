import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class cajeroTransferencias {
    static double transferencia (String transferir, double saldo, int cbu, ArrayList <String> ultimosMovimientos, Scanner miTeclado) throws InterruptedException, IOException{
        Double transferirConvertido=cajeroControl.control(transferir, miTeclado);
        
        while (transferirConvertido>saldo | transferirConvertido <=0){//bucle que utilizo para obligar al usuario a
                    //ingresar un importe dentro del rango permitido segun sea su saldo
            System.out.print("El importe a transferir es mayor al saldo, reingrese:");//mensaje de aviso que se ingreso mal el importe y que ingrese nuevamente
            transferir=miTeclado.nextLine();//vuelvo a guardar en variable el nuevo importe ingresado   
            transferirConvertido=cajeroControl.control(transferir, miTeclado);
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension                           
        }

        System.out.print("Se transferiran a la cuenta "+cbu+" un total de $"+transferirConvertido+ " Confirme operación 1-SI / 2-NO:");//mensaje que muestra los detalles de transferencia y solicitud de confirmacion de operacion
        String rta = miTeclado.nextLine();//guardo en variable la respuesta si o no
        //rta = miTeclado.nextLine();
        System.out.println("-----------------------------");//lineas divisorias para una mejor comprension

        if (rta.equals("1")){//si la respuesta es si
            cajeroLimpiar.limpiar();
            saldo=saldo-transferirConvertido;//guardo en variable el nuevo saldo que queda despues de hacer la operacion
            System.out.println("Transferencia realizada, su saldo actual es de $"+saldo);//mensaje de confirmacion de transferencia y muestra de saldo actual
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
            //llamo a la funcion cargar arraylist para registrar el movimiento
            cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    TRANSFERENCIA A CBU Nº "+cbu+" Importe: $"+transferirConvertido, ultimosMovimientos);
            return saldo;
        }

        if (rta.equals("2")){//si la respuesta es no
            cajeroLimpiar.limpiar();
            System.out.println("Operación cancelada...");//mensaje de aviso que la operacion se cancelo
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
            return saldo;
        }    

        if (!rta.equals("2") | !rta.equals("1")){//si la respuesta es cualquier otro numero que no sea 1 o 2
            cajeroLimpiar.limpiar();
            System.out.println("Operación cancelada por mal ingreso de confirmación");//mensaje de aviso de cancelacion de operacion porque no ingresa el numero correcto
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
            return saldo;
        }
        return saldo;//retorno el nuevo saldo
    }
}
