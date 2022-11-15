import java.util.Scanner;

public class cajeroControl {
    public static Double control (String transferir, Scanner miTeclado){//esta funcion controla que los montos
        //que tiene que ingresar el usuario se asegure que sean numeros
        int ban=1;
        Double transferirConvertido=0.0;
        while (ban==1){
            try {
                transferirConvertido=Double.parseDouble(transferir);
                ban=0;
                return transferirConvertido;
            }catch (NumberFormatException e){
                System.out.print("Mal ingresado, reintente: ");
                transferir=miTeclado.nextLine();//guardo el importe en variable
            }
        }
        return transferirConvertido;
        
    }
}
