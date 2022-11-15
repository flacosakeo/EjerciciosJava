//CODO A CODO
//COMISON 22923
//CAJERO AUTOMATICO REALIZADO POR EDUARDO LAZARTE
//COPYRIGHT 2022
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class cajeroMain {
    public static void main(String[] args) throws InterruptedException, IOException{
        cajeroLimpiar.limpiar();//llamo a la funcion limpiar pantalla
        //inicio de teclado
        Scanner miTeclado;
        miTeclado = new Scanner (System.in);
        
        //declaracion de variables
        int ban, ban2, ban3, ban4, cbu, servicio, contador, cuenta, miCbu;
        String importe,monto, transferir, opcion1,opcion2,opcion3,usuario,password, nombre, apellido, domicilio, provincia, verde, amarillo, cyan, borrarColor, descripcionServicio; 
        double saldo; 
        
        //declaracion de arraylist donde se guardan los movimientos
        ArrayList <String> ultimosMovimientos;
        ultimosMovimientos = new ArrayList <String>();

        //inicializacion de variables
        ban=0;
        ban2=0;
        ban3=0;
        ban4=0;
        saldo=50000.00;
        usuario="";
        password="";
        contador=1;
        nombre="Eduardo";
        apellido="Lazarte";
        domicilio="Lamadrid 112 - Centro";
        provincia="Jujuy";
        cuenta=123654789;
        miCbu=1122334455;
        verde="\u001B[32m";//variable que almacena el color verde
        amarillo="\u001B[33m";//variable que almacena el color amarillo
        cyan="\u001B[36m";//variable que almacena el color cyan
        borrarColor="\u001B[0m";//variable que borra el color y vuelve al color estandar
        
        cajeroPresentacion.main(args);//llamo a la funcion de presentacion descargada de internet

        System.out.print("ingrese usuario:");//pido ingreso de usuario
        usuario = miTeclado.nextLine();//guardo en variable lo tipeado
        System.out.print("ingrese contraseña:");//pido ingreso de clave
        password = miTeclado.nextLine();//guardo en variable lo tipeado
        System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
        
        //llamo a la funcion de iniciar sesion y guardo el valor de retorno en la variable ban 
        //para poder ingresar al menu principal de sistema
        ban=cajeroInicioDeSesion.inicioSesion(usuario, password, miTeclado, ban, contador);

        while (ban==1){//si se inicia sesion correctamente la variable ban toma el valor 1 y da inicio al bucle
                        //del menu principal
            
            System.out.println(verde+"*** MENU PRINCIPAL ***");//encabeza del menu
            System.out.println();//espacio entrelineas para una mejor comprension
            
            System.out.println("1 - Datos del Usuario           2 - Saldo");//opciones del menu principal
            System.out.println("3 - Transferencia               4 - Pago de Servicios");//opciones del menu principal
            System.out.println("5 - Extracción                  6 - Ultimos Movimientos");//opciones del menu principal
            System.out.println("7 - SALIR");//opcion del menu principal
            System.out.println();//espacio entrelineas para una mejor comprension
            System.out.print("Elija una opción: ");//aviso de seleccion de opcion
            //opcion1="";//inicializo la variable para posteriormente activar el switch
            opcion1 = miTeclado.nextLine();//guardo en variable lo elegido para acceder al case correspondiente del switch
            
            System.out.println("-----------------------------"+borrarColor);//lineas divisorias para una mejor comprension

            switch (opcion1){//segun la opcion que se elija se accede al case que corresponde
                
                case "1":
                    cajeroLimpiar.limpiar();
                    System.out.println("*** OPCION:"+opcion1+" ***");//muestro como encabezado la opcion elegida
                    System.out.println();//espacio entrelineas para una mejor comprension
                    System.out.println("Usuario: "+usuario);//muestro el usuario guardado en variable
                    System.out.println("Nombre y Apellido: "+nombre+" "+apellido);//muestro el nombre y apellido guardado en variable
                    System.out.println("Domicilio: "+domicilio);//muestro el domicilio guardado en variable
                    System.out.println("Provincia: "+provincia);//muestro provincia guardado en variable
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                break;

                case "2":
                    cajeroLimpiar.limpiar();
                    System.out.println("*** OPCION:"+opcion1+" ***");//muestro como encabezado la opcion elegida
                    System.out.println();//espacio entrelineas para una mejor comprension
                    System.out.println("Número de Cuenta: "+cuenta);//muestro el numero de cuenta guardado en variable
                    System.out.println("Mi CBU: "+miCbu);//muestro el cbu guardado en variable
                    System.out.println("Su saldo es de: $"+saldo);//muestro el saldo del usuario
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                break;

                case "3":
                    cajeroLimpiar.limpiar();
                    System.out.println("*** OPCION:"+opcion1+" ***");//muestro como encabezado la opcion elegida
                    System.out.println();//espacio entrelineas para una mejor comprension
                    System.out.print("Ingrese Número de CBU:");//mensaje de ingreso de numero de cbu
                    cbu=miTeclado.nextInt();//guardo cbu en variable
                    System.out.println("Su saldo es de $"+saldo);//muestro el saldo que dispone el usuario
                    System.out.print("Ingrese importe a transferir:");//mensaje de ingreso de importe que se transferira
                    transferir=miTeclado.nextLine();//guardo el importe en variable
                    transferir=miTeclado.nextLine();
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                    //llamo a la funcion transferencia para realizar la operacion y guardar en variable el nuevo saldo
                    //transferir=cajeroControl.control(transferir, miTeclado);
                    saldo=cajeroTransferencias.transferencia(transferir, saldo, cbu, ultimosMovimientos, miTeclado);
                    
                break;
                    
                case "4":
                    cajeroLimpiar.limpiar();
                    ban2=1;//al ingresar a este case activo el interruptor para el segundo menu
                    while (ban2==1){//ciclo que mantiene a la vista el segundo menu
                    System.out.println(amarillo+"*** MENU DE SERVICIOS ***");//muestro como encabezado la opcion elegida
                    System.out.println();//espacio entrelineas para una mejor comprension
                    System.out.println("1 - Luz");//primera opcion del segundo menu
                    System.out.println("2 - Agua");//segunda opcion del segundo menu
                    System.out.println("3 - Gas");//tercera opcion del segundo menu
                    System.out.println("4 - Limpieza Urbana");//cuarta opcion del segundo menu
                    System.out.println("5 - Volver al menú principal");//quinta opcion del segundo menu
                    System.out.println();//espacio entrelineas para una mejor comprension
                    System.out.print("Elija una opción: ");//aviso de seleccion de opcion
                    opcion2 = miTeclado.nextLine();//guardo en variable lo seleccionado
                    System.out.println("-----------------------------"+borrarColor);//lineas divisorias para una mejor comprension

                    switch (opcion2){//segun la opcion que se elija se accede al case que corresponde
                        case "1":
                            cajeroLimpiar.limpiar();
                            System.out.println("***PAGO DE SERVICIO DE LUZ***");//encabezado de pantalla para saber en que opcion me encuentro
                            System.out.println();
                            System.out.println("Su saldo actual es de $"+saldo);//se muestra el saldo que dispone el usuario
                            System.out.print("Ingrese número de servicio:");//se pide numero del servicio que se desea pagar
                            servicio=miTeclado.nextInt();//guardo en variable el numero de servicio
                            System.out.print("Importe a pagar:");//se pide que ingrese el monto a pagar
                            importe=miTeclado.nextLine();//guardo en variable el importe ingresado
                            importe=miTeclado.nextLine();
                            descripcionServicio="LUZ: ";//guardo en variable el texto del servicio que estoy pagando
                            ////llamo a la funcion pago de servicios para realizar la operacion y guardar en variable el nuevo saldo
                            saldo=cajeroPagoDeServicios.pagos(importe, saldo, servicio, ultimosMovimientos, miTeclado, descripcionServicio);
                            //opcion2 = miTeclado.nextLine();
                        break;

                        case "2":
                            cajeroLimpiar.limpiar();
                            //para el pago del servicio de agua, las explicaciones son iguales que la del servicio de luz
                            System.out.println("***PAGO DE SERVICIO DE AGUA***");
                            System.out.println();
                            System.out.println("Su saldo actual es de $"+saldo);
                            System.out.print("Ingrese número de medidor:");                            
                            servicio=miTeclado.nextInt();
                            System.out.print("Importe a pagar:");
                            importe=miTeclado.nextLine();
                            importe=miTeclado.nextLine();
                            descripcionServicio="AGUA: ";
                            saldo=cajeroPagoDeServicios.pagos(importe, saldo, servicio, ultimosMovimientos, miTeclado, descripcionServicio);
                            //opcion2 = miTeclado.nextLine();
                        break;

                        case "3":
                            cajeroLimpiar.limpiar();
                            //para el pago del servicio de gas, las explicaciones son iguales que la del servicio de luz
                            System.out.println("***PAGO DE SERVICIO DE GAS***");
                            System.out.println();
                            System.out.println("Su saldo actual es de $"+saldo);
                            System.out.print("Ingrese número de medidor:");                            
                            servicio=miTeclado.nextInt();
                            System.out.print("Importe a pagar:");
                            importe=miTeclado.nextLine();
                            importe=miTeclado.nextLine();
                            descripcionServicio="GAS: ";
                            saldo=cajeroPagoDeServicios.pagos(importe, saldo, servicio, ultimosMovimientos, miTeclado, descripcionServicio);
                            //opcion2 = miTeclado.nextLine();
                        break;

                        case "4":
                            cajeroLimpiar.limpiar();
                            //para el pago del servicio de limpieza urbana, las explicaciones son iguales que la del servicio de luz
                            System.out.println("***PAGO DE SERVICIO DE LIMPIEZA URBANA***");
                            System.out.println();
                            System.out.println("Su saldo actual es de $"+saldo);
                            System.out.print("Ingrese número de padrón:");                            
                            servicio=miTeclado.nextInt();
                            System.out.print("Importe a pagar:");
                            importe=miTeclado.nextLine();
                            importe=miTeclado.nextLine();
                            descripcionServicio="LIMPIEZA URBANA: ";
                            saldo=cajeroPagoDeServicios.pagos(importe, saldo, servicio, ultimosMovimientos, miTeclado, descripcionServicio);
                            //opcion2 = miTeclado.nextLine();
                        break;

                        case "5":
                            cajeroLimpiar.limpiar();
                            //al ingresar en este case la variable que mantiene activo el segundo menu
                            //toma el valor cero para desactivar el ciclo while y volver al menu principal
                            ban2=0;//variable que toma valor cero
                 
                        break;
                       
                        default:
                            cajeroLimpiar.limpiar();
                            System.out.println("Opcion Mal Ingresado");//mensaje que muestra que la opcion elegida es incorrecta
                            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                            opcion2="";//limpio variable

                        break;
                    }                    
                }                
                break;

                case "5":
                    cajeroLimpiar.limpiar();
                    opcion3="";//variable que se inicializa en 0, esta opcion accedera al case correspondiente
                    ban3=1;//variable que toma valor 1 paraactivar wl while del menu extracciones
                    while (ban3==1){//ciclo que mantiene a la vista el segundo menu
                        System.out.println(cyan+"*** EXTRACCION ***");//muestro como encabezado la opcion elegida
                        System.out.println();
                        System.out.println("1 - $100          2 - $200");//opciones del menu extraccion
                        System.out.println("3 - $500          4 - $1000");//opciones del menu extraccion
                        System.out.println("5 - $5000         6 - $10000");//opciones del menu extraccion
                        System.out.println("7 - OTRO IMPORTE  8 - VOLVER");//opciones del menu extraccion
                        System.out.println();//espacio entrelineas para una mejor comprension
                        System.out.print("Elija una opción: ");//aviso de seleccion de opcion
                        opcion3 = miTeclado.nextLine();//guardo en variable lo seleccionado
                        System.out.println("-----------------------------"+borrarColor);//lineas divisorias para una mejor comprension
           
                        switch (opcion3){//segun la opcion que se elija se accede al case que corresponde
                            case "1":
                            //llamo a la funcion extraccion para realizar la operacion y devolver el nuevo saldo    
                            saldo=cajeroExtraccion.extraccion(saldo,100);
                            //llamo a la funcion cargar arraylist para reggistrar el movimiento
                            cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    EXTRACCION: $"+100, ultimosMovimientos);
                            break;

                            case "2":
                                saldo=cajeroExtraccion.extraccion(saldo,200);
                                cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    EXTRACCION: $"+200, ultimosMovimientos);
                            break;

                            case "3":
                                saldo=cajeroExtraccion.extraccion(saldo,500);
                                cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    EXTRACCION: $"+500, ultimosMovimientos);
                            break;

                            case "4":
                                saldo=cajeroExtraccion.extraccion(saldo,1000);
                                cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    EXTRACCION: $"+1000, ultimosMovimientos);
                            break;

                            case "5":
                                saldo=cajeroExtraccion.extraccion(saldo,5000);
                                cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    EXTRACCION: $"+5000, ultimosMovimientos);
                            break;

                            case "6":
                                saldo=cajeroExtraccion.extraccion(saldo,10000);
                                cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    EXTRACCION: $"+10000, ultimosMovimientos);        
                            break;

                            case "7":
                                cajeroLimpiar.limpiar();
                                System.out.println("*** OTRO IMPORTE ***");//encabezado
                                System.out.println();
                                ban4=1;//variable que toma el valor 1 para activar el while que valida que el monto ingreado sea multiplo de 50
                                //monto=1;//inicializo variable que almacena el monto ingresado
                                System.out.print("Ingrese monto: $");//mensaje
                                monto=miTeclado.nextLine();//la variable monto toma el valor ingresado por el usuario
                                Double montoConvertido=cajeroControl.control(monto, miTeclado);
                                while (ban4==1){//ciclo que controla que el monto ingresado sea multilplo de 50
                                    if (montoConvertido%50==0){//if que controla que el monto sea miltiplo de 50
                                        saldo=cajeroExtraccion.extraccion(saldo,montoConvertido);//llamo a la funcion extraccion para realizar la operacion y almacenar el nuevo saldo
                                        //llamo a la funcion cargar arraylist para registrar el movimiento
                                        cajeroCargaArrayList.carga(String.valueOf(LocalDateTime.now().withNano(0))+"    EXTRACCION: $"+montoConvertido, ultimosMovimientos);
                                        ban4=0;//cambio el valor de la variable para desactivar el while
                                    }else{
                                        System.out.print("Ingrese un número multiplo de 50: $");//mensaje que pide nuevo ingreso de monto
                                        monto=miTeclado.nextLine();//guardo nuevo ingreso en variable
                                        montoConvertido=cajeroControl.control(monto, miTeclado);
                                    }
                                    //opcion3 = miTeclado.nextLine(); 
                                }
                            break;

                            case "8":
                                cajeroLimpiar.limpiar();
                                ban3=0;//cambio el valor de la variable para desactivar el while del menu extraccion y volver al menu principal
                            break;

                            default:
                            cajeroLimpiar.limpiar();
                            System.out.println("Opcion Mal Ingresado");//mensaje que muestra que la opcion elegida es incorrecta
                            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                            opcion3="";//limpio variable
                            break;
                        }
                    }
                break;
                
                case "6":
                    cajeroUltimosMovimientos.UltimosMovimientos(ultimosMovimientos);//llamo a la funcion ultimos movimientos para mostrar el contenido del arraylist
                break;

                case "7":
                    miTeclado.close();//cierro teclado de memoria
                    cajeroLimpiar.limpiar();
                    System.out.println("*** RETIRE SU TARJETA ***");//mensaje de salir del sistema
                    System.out.println();
                    cajeroPresentacion.main(args);//llamo a la funcion de presentacion
                    System.out.println();
                    System.out.println("***FIN DEL PROGRAMA***");//mensaje de fin del programa
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                    //esta opcion desactiva la variable que mantiene visible el menu principal y sale del sistema
                    ban=0;//variable que toma el valor 0 para desactivar el while del menu principal y finalizar el sistema
                break;
                default:
                    cajeroLimpiar.limpiar();
                    System.out.println("Opcion Mal Ingresado");//mensaje que muestra que la opcion elegida es incorrecta
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                    //opcion1="";//limpio variable
                break;
                
            }
            

        }
        
    }
}