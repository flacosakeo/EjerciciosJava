import java.io.IOException;

public class cajeroProcesamiento {
    static void procesamiento(double monto) throws InterruptedException, IOException{
        if (monto <= 1000){
            for (int i=1; i<=monto; i++){//ciclo que muestra el procesamiento hasta llegar al numero del monto ingresado
                cajeroLimpiar.limpiar();//llamo a la funcion limpiar para limpiar pantalla
                System.out.println("Procesando... $"+i);//muestra la variable i del ciclo for para mostrar el progreso
            }
        }

        if (monto >= 1001 && monto <= 5000){
            for (int i=20; i<=monto; i=i+20){//ciclo que muestra el procesamiento hasta llegar al numero del monto ingresado
                cajeroLimpiar.limpiar();//llamo a la funcion limpiar para limpiar pantalla
                System.out.println("Procesando... $"+i);//muestra la variable i del ciclo for para mostrar el progreso
            }
        }

        if (monto >= 5001 && monto <= 10000){
            for (int i=50; i<=monto; i=i+50){//ciclo que muestra el procesamiento hasta llegar al numero del monto ingresado
                cajeroLimpiar.limpiar();//llamo a la funcion limpiar para limpiar pantalla
                System.out.println("Procesando... $"+i);//muestra la variable i del ciclo for para mostrar el progreso
            }
        }

        if (monto >= 10001){
            for (int i=100; i<=monto; i=i+100){//ciclo que muestra el procesamiento hasta llegar al numero del monto ingresado
                cajeroLimpiar.limpiar();//llamo a la funcion limpiar para limpiar pantalla
                System.out.println("Procesando... $"+i);//muestra la variable i del ciclo for para mostrar el progreso
            }
        }



        
    }
}
