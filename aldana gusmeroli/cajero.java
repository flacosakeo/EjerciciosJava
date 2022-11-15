//importacion libreria
import java.util.*;

/**
 * Porgramar solo con estructuras de control switch y estructuras if anidados, un menú home-banking.
 * Que pida un usuario sin limite de ingresos (por ahora).
 * Que pida una clave.
 * Que el menú muestre un saldo ficticio, una opción transferencia y una opción pago online.
 * El menu de saldo nos mostrará el saldo ficticio y nos dará la opción de cerrar sesion para salir, no se puede regresar al menu por ahora. Nota: utilizar solo if anidado y switch en todo el practico. NO UTILIZAR BUCLES
 * La operación de transferencia será a una cuenta ficticia, que lo importante en este punto es sea que tras la operación el descuento se vea reflejado en el saldo en la misma seccion, esta seccion tambien contendra la opcion cerrar sesion, por el momento no se puede volver al menu. NO UTILIZAR BUCLES AUN
 * La seccion de pago de algun servicio, que luego del pago el descuento tambien se vea reflejado en el saldo y permita pagar servicios, cuando el saldo sea insuficiente la operación no podra realizarse y mostrará la leyenda "Saldo insuficiente", esta seccion tambien tendra una opcion cerrar sesion, por el momento tampoco se podra regresar alm menu. NO UTILIZAR BUCLES
 * Por ultimo tras el cierre de sesion en todos los casos arrojará la leyenda por favor extraiga su tarjeta.
 * 
 * 
 * @author Aldana Gusmeroli
 * @version 3.0
 */

public class cajero{
    public static void main(String[] args) {
        //declaro objeto
        Scanner miTeclado;

        //inicializo teclado
        miTeclado = new Scanner(System.in);

        //delcaro e inicializo variables
        String usuario, usuarioGuardado, claveGuardada, clave, opcion, sesionContinuar, sesion;
        //modificar saldo para probar todas las funciones
        int saldo = 6000;
        int monto, totalPagos, intentos, maximo;
        maximo = 3;
        intentos = 1;
        monto = 0;
        opcion = "";
        sesion = "";
        usuario="";
        clave = "";
        usuarioGuardado = "aldana";
        claveGuardada = "1234";
        sesionContinuar = "S";
        int cablevision = 10000;
        int inmbobiliario = 4998;
        int automotor = 12350;
        totalPagos = (cablevision + inmbobiliario + automotor);


        //Instrucciones e-s
        //ingreso manual Usuario y clave
        while( !( (usuario .equals(usuarioGuardado))&&(clave .equals(claveGuardada))) && (intentos<=maximo) ){
            System.out.println("Ingrese su nombre de usuario");
            usuario = miTeclado.nextLine();
            System.out.println("Ingrese su clave numérica");
            clave = miTeclado.nextLine();
            if (intentos==3){
                System.out.println("Usuario bloqueado");
            }
            intentos++;
        }

        //if-else
        //Saludo de bienvenida, opcion de cerrar sesion/continuar a menu
        if(usuario .equals(usuarioGuardado) && clave .equals(claveGuardada)){
                System.out.println("Hola, " + usuario + ". Bienvenido/a a la red de banca electrónica");
                System.out.println("Su saldo actual es de $" + saldo);
                System.out.println("¿Desea continuar operando? Marque S para continuar al Menu de opciones / N para cerrar sesion)");
                sesion = miTeclado.nextLine();
            }if(sesion .equals(sesionContinuar)){
                System.out.println("Menu de opciones");
                System.out.println("A: Saldos. B: Transferencias. C: Pagos. D: Cerrar sesión");
                opcion = miTeclado.nextLine();
                System.out.println("Ha seleccionado la opcion: " + opcion);
            }


        //ESTRUCTURA SWITCH para menu de opciones trasnferencia/pagos/salir
       switch (opcion) {
        case "A":
            System.out.println("Sección saldos");
            System.out.println("Su saldo actual es: $" + saldo);
            break;
        case "B":
            System.out.println("Sección TRANSFERENCIAS");
            System.out.println("Ingrese monto a transferir");
            monto = miTeclado.nextInt();
            System.out.println("Se han debitado $" + monto + " para transferir a otra cuenta. Su saldo actual es de: $" + (saldo-monto));

            break;
        case "C":
            System.out.println("Sección PAGOS");
            System.out.println("Pendiente de pago - CABLEVISION FIBERTEL. Monto a abonar: $" + cablevision);
            System.out.println("Pendiente de pago - IMPUESTO INMOBILIARIO. Monto a abonar: $"+ inmbobiliario);
            System.out.println("Pendiente de pago - IMPUESTO AUTOMOTOR. Monto a abonar: $" + automotor);
            System.out.println("El monto total a pagar es de: $" + totalPagos);
            System.out.println("¿Desea proceder al pago de lo mismos? Ingrese S para continuar / N para terminar");
            opcion = miTeclado.nextLine();
            if(opcion .equals(sesionContinuar)){
                System.out.println("Se debitarán de su cuenta: $" + totalPagos);
                System.out.println("S para confirmar el pago. N para cancelar operación");
                opcion=miTeclado.nextLine();
            }if((totalPagos <= saldo ) && (opcion .equals(sesionContinuar))){
                System.out.println("Pagos realizados con éxito, se debitó de su cuenta la suma de $" + totalPagos + ". Su saldo actual es: $" +  (saldo - totalPagos));
                break;
            }else if (saldo<totalPagos){
                System.out.println("Su saldo es insuficiente para realizar la transaccion.");
            }
        case "D":
            System.out.println("Gracias por utilizar nuestro sistema de HB. Hasta pronto.");
        default:
            System.out.println("Su sesión ha expirado. Ingrese nuevamente sus datos para entrar al sistema");
            break;
       }

       System.out.println("*****CERRANDO SESION*****");
       System.out.println("¡¡NO OLVIDE EXTRAER SU TARJETA!!");

       miTeclado.close();
    }
}
    