import java.io.IOException;

public class cajeroExtraccion {
    static double extraccion(double saldo, double monto) throws InterruptedException, IOException {//declaracion de funcion extraccion
        if (saldo<monto){//condicion que compara el saldo actual con el monto que se ingresa
            System.out.println("Saldo Insuficiente");//mensaje
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
        }else{
            
            cajeroProcesamiento.procesamiento(monto);//llamo a la funcion de procesamiento para acelerar o no el tiempo de proceso
            saldo=saldo-monto;//guardo el nuevo saldo
            System.out.println("Retire su dinero");//mensaje
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
            
        }
        return saldo;//retorno la variable saldo con el nuevo saldo
    }
}
