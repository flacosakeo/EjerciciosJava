//importacion libreria
import java.util.*;

/**
 *ACLARACION: EN ESTE PROGRAMA ME SALGO DE LA CONSIGNA APLICANDO BUCLES PARA VOLVER AL MENU PRINCIPAL SIEMPRE QUE TERMINA DE EJECUTARSE UN DETERMINADO BLOQUE, TAMBIEN EN EL INCIIO DE SESIÓN SE PERMITEN 3 INTENTOS O SE BLOQUEA EL USUARIO Y EN LUGAR DE SALIR DEL PROGRAMA CUANDO SE CUMPLE DTERMINADA CONDICION/BLOQUE SE SALE Y CIERRA SESION POR DETERMINACION DEL USUARIO. EN TRANSFERENCIAS HAY UN SUB MENU CON AGENDA DE DESTINATARIOS U OPCION TRANSFERIR. Y UNA VEZ EJECUTADO EL BLOQUE SELECCIONADO SIEMPRE SE TERONA AL MENU PRINCIPAL.

 CONSIGNA INICIAL:
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

public class cajeroMejorado{

    //zona funciones
    static void imprimir (String mensaje){
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        //declaro objeto
        Scanner miTeclado;

        //inicializo teclado
        miTeclado = new Scanner(System.in);

        //delcaro e inicializo variables
        //LETRAS
        String usuario="", usuarioGuardado="Aldana", claveGuardada="al1234", clave="", sesionContinuar="S", sesion="";
        //NUMEROS
        int intentos=1, maximo=3/*intento inicio de sesion*/, cbu=0, menu=0, respuesta=0, rtaSaved=1, cbuPropio= 309255953 ;
        //DECIMALES
        double monto, saldo=13000.55, totalPagos;
        char menu2='A';

        //declaro e inicializo variables de pagos
        int cable = 10000;
        int inmbobiliario = 4998;
        int automotor = 12350;
        //operacion para PAGOS preestablecidos
        totalPagos = (cable + inmbobiliario + automotor);

        //ARRAYLIST para agenda de destinatarios transferencias
        ArrayList<Integer> cbuAgendado = new ArrayList<Integer>();

        cbuAgendado.add(3000234);
        cbuAgendado.add(3005678);
        cbuAgendado.add(7006543);
        cbuAgendado.add(80076543);

        ArrayList<String> userSaved = new ArrayList<String>();
        userSaved.add("Fernando");
        userSaved.add("Mariela");
        userSaved.add("Pedro");
        userSaved.add("Josefina");



        //Instrucciones e-s
        //ingreso manual Usuario y clave
        while( !( (usuario .equals(usuarioGuardado))&&(clave .equals(claveGuardada))) && (intentos<=maximo) ){
            System.out.println("Ingrese su nombre de usuario");
            usuario = miTeclado.nextLine();
            System.out.println("Ingrese su clave alfanumerica");
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
            }if(sesion .equals(sesionContinuar)){//opcion S para continuar al menu, otra para salir
                System.out.println("********************************************");
                System.out.println("Cargando menú principal");
                System.out.println("********************************************");
                do{//menu de opciones que vuelve cuando terminan las operaciones hasta que se elige salir y cerrar sesion
                do{
                    System.out.println("Menú de opciones");
                    System.out.println("1: Datos de cuenta / Saldos.");
                    System.out.println("2: Transferencias.");
                    System.out.println("3: Pagos.");
                    System.out.println("4: Cerrar sesión.");
                    menu = miTeclado.nextInt();
                    System.out.println("********************************************");
                    System.out.println("Ha seleccionado la opcion: " + menu);
                    System.out.println("********************************************");

                    }while(menu<1 || menu>5);

            //estructura switch para menu principal
                    switch (menu) {
                        case 1://CUENTA Y SALDOS
                            System.out.println("DATOS CUENTA//SALDOS");
                            System.out.println("Usuario: " + usuarioGuardado);
                            System.out.println("CBU N°"+ cbuPropio);
                            System.out.println("1-Ver saldo");
                            System.out.println("2-Regresar al Menú anterior");
                            respuesta=miTeclado.nextInt();
                            if(respuesta==rtaSaved){
                                System.out.println("Su saldo actual es: $" + saldo);
                                imprimir("Regresando al menu principal...");
                                imprimir("*****Aguarde un instante*****");
                                imprimir("*******************************");

                            }else{
                                System.out.println("*****Regresando al menú principal*****");
                            }
                            break;

                        case 2://TRANSFERENCIAS
                            System.out.println("Seccion TRANSFERENCIAS");
                            System.out.println("***********************");
                            System.out.println("A-Ver agenda destinatarios");
                            System.out.println("B-Transferir");
                            System.out.println("C-Salir");
                            menu2=miTeclado.next().charAt(0);
                            //estructura switch sub-menu para ver agenda por arraylist o realizar transferencia
                            switch(menu2){
                                case 'A'://agenda destinatarios
                                    System.out.println("AGENDA DESTINATARIOS");
                                    System.out.println(userSaved.get(0) + ". CBU: " + cbuAgendado.get(0));
                                    System.out.println(userSaved.get(1) + ". CBU: " + cbuAgendado.get(1));
                                    System.out.println(userSaved.get(2) + ". CBU: " + cbuAgendado.get(2));
                                    System.out.println(userSaved.get(3) + ". CBU: " + cbuAgendado.get(3));
                                    break;
                                case 'B'://ejecutar trasnferencia 
                                    System.out.println("TRANSFERENCIAS INMEDIATAS");
                                    System.out.println("Ingrese CBU destinatario");
                                    cbu = miTeclado.nextInt();
                                    System.out.println("Ingrese importe a transferir");
                                    monto=miTeclado.nextDouble();
                                    System.out.println("*****A continuación verifique datos ingresados y confirme operación.*****");
                                    System.out.println("Importe a tranferir $" +monto);
                                    System.out.println("CBU DESTINTARIO:" +cbu);
                                    System.out.println("**************************************");
                                    System.out.println("1-Transferir.");
                                    System.out.println("2-Cancelar");
                                    System.out.println("**************************************");
                                    respuesta=miTeclado.nextInt();//da opcion a cancelar y no realizar transf o continuar si el saldo es suficiente
                                    if((respuesta == rtaSaved) && (monto<=saldo)){
                                        System.out.println("*****PROCESANDO*****");
                                        System.out.println("Operación exitosa! Se han trasnferido $" + monto + " de su cuenta al CBU N° " + cbu +". Su saldo actual es de: $" + (saldo-monto));
                                        System.out.println("**************************************");
                                    }else if((respuesta==rtaSaved) && (monto>saldo)){//si el saldo es insuficiente
                                        System.out.println("Usted no cuenta con fondos suficientes para efectuar la operación. Revise su estado de cuenta");

                                    }else if (respuesta != rtaSaved){//si la respuesta es cancelar retorna menu principal
                                        System.out.println("Operación cancelada");
                                        System.out.println("**************************************");
                                    }
 
                            }
                            System.out.println("Regresando al menu principal...");
                            System.out.println("*****Aguarde un instante*****");
                            System.out.println("*******************************");
                            break;
                        case 3://PAGO DE SERVICIOS
                            System.out.println("Seccion PAGOS");
                            System.out.println("Pendiente de pago - CABLEVISION FIBERTEL. Monto a abonar: $" + cable);
                            System.out.println("Pendiente de pago - IMPUESTO INMOBILIARIO. Monto a abonar: $"+ inmbobiliario);
                            System.out.println("Pendiente de pago - IMPUESTO AUTOMOTOR. Monto a abonar: $" + automotor);
                            System.out.println("El monto total a pagar es de: $" + totalPagos);
                            System.out.println("¿Desea proceder al pago de lo mismos? 1- para Continuar / 2- para regresar al menú principal");
                            respuesta = miTeclado.nextInt();
                            if(respuesta == rtaSaved){//muestra importe total y pide confirmacion
                                System.out.println("Se debitarán de su cuenta: $" + totalPagos);
                                System.out.println("1- Confirmar y pagar.");
                                System.out.println("2- Cancelar y regresar el menú anterior.");
                                respuesta=miTeclado.nextInt();
                            }if((totalPagos <= saldo ) && (respuesta == rtaSaved)){//Si confirma y hay saldo suficiente, procede al pago
                                System.out.println("******PREOCESANDO PAGOS******");
                                System.out.println("Pagos realizados con éxito, se debitó de su cuenta la suma de $" + totalPagos + ". Su saldo actual es: $" +  (saldo - totalPagos));
                                System.out.println("**********************************");
                                System.out.println("*****Regresando al menú anterior*****");

                            }else if (saldo<totalPagos && (respuesta == rtaSaved)){
                                System.out.println("Su saldo es insuficiente para realizar la transaccion.");//No tiene saldo, cancela y vuelve al menu anterior
                                System.out.println("*****Regresando al menú anterior*****");

                            }
                            System.out.println("*****Aguarde un instante*****");
                            System.out.println("*******************************");
                            break;
                        case 4:
                            System.out.println("Cerrando sesión. Esto puede tomar unos segundos...");
                            break;

                        default:
                        System.out.println("No es una opcion válida");
                       
                       }
                    }while((menu != 4));
            }else{
                System.out.println("Cerrando sesion");
            }


       System.out.println("Gracias por utilizar nuestro sistema de banca electrónica.");
       System.out.println("¡¡NO OLVIDE RETIRAR SU TARJETA!!. Hasta pronto");



       miTeclado.close();
    }
}