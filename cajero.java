import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class cajero {
    
    static void limpiar() throws InterruptedException, IOException{//declaracion de funcion limpiar
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    
    static void extraccion(double saldoActual, double monto) throws InterruptedException, IOException{//declaracion de funcion extraccion
        if (saldoActual<monto){
            System.out.println("Saldo Insuficiente");
            System.out.println("-----------------------------");
        }else{
            
            for (int i=1; i<=monto; i++){
                limpiar();
                System.out.println("Procesando... $"+i); 
            }
            System.out.println("Retire su dinero");
            System.out.println("-----------------------------");
            
        }
    }


        


    public static void main(String[] args) throws InterruptedException, IOException{
        limpiar();
        //inicio de teclado
        Scanner miTeclado;
        miTeclado = new Scanner (System.in);
        
        //declaracion de variables
        int ban, ban2, ban3, ban4, password, cbu, rta, rta2, opcion1, opcion2, opcion3, servicio, contador, dni, cuenta, miCbu;
        String usuario, nombre, apellido, domicilio, provincia, verde, amarillo, cyan, borrarColor; 
        double saldo, transferir, importe; 
        
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
        password=0;
        contador=0;
        nombre="Eduardo";
        apellido="Lazarte";
        dni=30726244;
        domicilio="Lamadrid 112 - Centro";
        provincia="Jujuy";
        cuenta=123654789;
        miCbu=1122334455;
        verde="\u001B[32m";
        amarillo="\u001B[33m";
        cyan="\u001B[36m";
        borrarColor="\u001B[0m";
    

        
        for (int i=1; i<4; i++){//ciclo for para contabilizar la cantidad de intentos para iniciar sesion            
            System.out.print("ingrese usuario:");//pido ingreso de usuario
            usuario = miTeclado.nextLine();//guardo en variable lo tipeado
            System.out.print("ingrese contraseña:");//pido ingreso de clave
            password = miTeclado.nextInt();//guardo en variable lo tipeado
            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
            if (usuario.equals("kofla") && password==123){//condicion que compara lo ingresado con un
                                                                    // usuario y contraseña fijo
                ban=1;//variable ban o bandera o interruptor que se activa para lograr correr el while del menu principal
                limpiar();
                break;//interrumpe el ciclo for
            }else{
                limpiar();
                contador=contador+1;//el contador se suma en 1 para contabilizar los intentos fallidos
                System.out.println("Usuario o contraseña incorrecto, intento número "+contador);//mensaje de error al intentar iniciar sesion mas la cantidad de veces que lleva intentandolo
                usuario = miTeclado.nextLine();//vuelvo a repetir el pedido de usuario ya que si no se coloca
                                                // al iniciar el for lo ignora
                if (contador==3){//si el contador llega a 3 intentos fallidos se bloquea el usuario y se cierra el programa
                    System.out.println("Alcanzo el máximo de intentos permitidos, usuario bloqueado");//mensaje de aviso que alcanzo el numero maximo de intentos y el bloqueo de usuario
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                }
                
            }
        }

        while (ban==1){//si se inicia sesion correctamente la variable ban toma el valor 1 y da inicio al bucle
                        //del menu principal
            
            System.out.println(verde+"*** MENU PRINCIPAL ***");
            System.out.println();
            opcion1=0;//inicializo la variable para posteriormente activar el switch
            System.out.println("1 - Datos del Usuario           2 - Saldo");//primera opcion del menu principal
            System.out.println("3 - Transferencia               4 - Pago de Servicios");//segunda opcion del menu principal
            System.out.println("5 - Extracción                  6 - Ultimos Movimientos");//tercera opcion del menu principal
            System.out.println("7 - SALIR");//cuarta opcion del menu principal
            System.out.println();
            System.out.print("Elija una opción: ");//aviso de seleccion de opcion
            opcion1 = miTeclado.nextInt();//guardo en variable lo elegido para acceder al case correspondiente del switch
            System.out.println("-----------------------------"+borrarColor);//lineas divisorias para una mejor comprension

            switch (opcion1){//segun la opcion que se elija se accede al case que corresponde
                
                case 1:
                    
                    System.out.println("*** OPCION:"+opcion1+" ***");//muestro como encabezado la opcion elegida
                    System.out.println();
                    System.out.println("Usuario: "+usuario);//muestro el nombre de usuario
                    System.out.println("Nombre y Apellido: "+nombre+" "+apellido);
                    System.out.println("Domicilio: "+domicilio);
                    System.out.println("Provincia: "+provincia);
                    opcion1=0;//limpio la variable de opcion elegida
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                    break;

                case 2:
                    
                    System.out.println("*** OPCION:"+opcion1+" ***");//muestro como encabezado la opcion elegida
                    System.out.println();
                    System.out.println("Número de Cuenta: "+cuenta);
                    System.out.println("Mi CBU: "+miCbu);
                    System.out.println("Su saldo es de: $"+saldo);//muestro el saldo del usuario
                    opcion1=0;//limpio la variable de opcion elegida
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                    
                    break;

                case 3:
                    System.out.println("*** OPCION:"+opcion1+" ***");//muestro como encabezado la opcion elegida
                    System.out.println();
                    System.out.print("Ingrese Número de CBU:");//mensaje de ingreso de numero de cbu
                    cbu=miTeclado.nextInt();//guardo cbu en variable
                    System.out.println("Su saldo es de $"+saldo);//muestro el saldo que dispone el usuario
                    System.out.print("Ingrese importe a transferir:");//mensaje de ingreso de importe que se transferira
                    transferir=miTeclado.nextDouble();//guardo el importe en variable
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension

                    while (transferir>saldo | transferir <=0){//bucle que utilizo para obligar al usuario a
                                                                //ingresar un importe dentro del rango permitido segun sea su saldo
                        System.out.print("El importe a transferir no es valido, reingrese:");//mensaje de aviso que se ingreso mal el importe y que ingrese nuevamente
                        transferir=miTeclado.nextDouble();//vuelvo a guardar en variable el nuevo importe ingresado   
                        System.out.println("-----------------------------");//lineas divisorias para una mejor comprension                           
                    }

                    System.out.print("Se transferiran a la cuenta "+cbu+" un total de $"+transferir+ " Confirme operación 1-SI / 2-NO:");//mensaje que muestra los detalles de transferencia y solicitud de confirmacion de operacion
                    rta=miTeclado.nextInt();//guardo en variable la respuesta si o no
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
              
                    if (rta==1){//si la respuesta es si
                        saldo=saldo-transferir;//guardo en variable el nuevo saldo que queda despues de hacer la operacion
                        System.out.println("Transferencia realizada, su saldo actual es de $"+saldo);//mensaje de confirmacion de transferencia y muestra de saldo actual
                        System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                        ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" TRANSFERENCIA A CBU: "+cbu+" "+"IMPORTE: $"+transferir);
                        
                    }

                    if (rta==2){//si la respuesta es no
                        System.out.println("Operación cancelada...");//mensaje de aviso que la operacion se cancelo
                        System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                    }    

                    if (rta>2 | rta<1){//si la respuesta es cualquier otro numero que no sea 1 o 2
                        System.out.println("Operación cancelada por mal ingreso de confirmación");//mensaje de aviso de cancelacion de operacion porque no ingresa el numero correcto
                        System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                    }

                    rta=0;//limpio variable
                    opcion1=0;//limpio variable
                    break;
                    
                case 4:
                    
                    ban2=1;//al ingresar a este case activo el interruptor para el segundo menu
                    while (ban2==1){//ciclo que mantiene a la vista el segundo menu
                    System.out.println(amarillo+"*** MENU DE SERVICIOS ***");//muestro como encabezado la opcion elegida
                    System.out.println();
                    System.out.println("1 - Luz");//primera opcion del segundo menu
                    System.out.println("2 - Agua");//segunda opcion del segundo menu
                    System.out.println("3 - Gas");//tercera opcion del segundo menu
                    System.out.println("4 - Limpieza Urbana");//cuarta opcion del segundo menu
                    System.out.println("5 - Volver al menú principal");//quinta opcion del segundo menu
                    System.out.println();
                    System.out.print("Elija una opción: ");//aviso de seleccion de opcion
                    opcion2 = miTeclado.nextInt();//guardo en variable lo seleccionado
                    System.out.println("-----------------------------"+borrarColor);//lineas divisorias para una mejor comprension

                    switch (opcion2){//segun la opcion que se elija se accede al case que corresponde
                        case 1:
                            System.out.println("***PAGO DE SERVICIO DE LUZ***");//encabezado de pantalla para saber en que opcion me encuentro
                            System.out.println();
                            System.out.println("Su saldo actual es de $"+saldo);//se muestra el saldo que dispone el usuario
                            System.out.print("Ingrese número de servicio:");//se pide numero del servicio que se desea pagar
                            servicio=miTeclado.nextInt();//guardo en variable el numero de servicio
                            System.out.print("Importe a pagar:");//se pide que ingrese el monto a pagar
                            importe=miTeclado.nextDouble();//guardo en variable el importe ingresado

                            while (importe>saldo | importe <=0){//bucle que utilizo para obligar al usuario a
                                                                //ingresar un importe dentro del rango permitido segun sea su saldo
                                System.out.print("El importe a pagar no es valido, reingrese:");//mensaje de aviso que el importe ingresado no es correcto
                                importe=miTeclado.nextDouble();//guardo en variable el nuevo importe
                                System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                            }

                            System.out.print( "Confirme operación 1-SI / 2-NO:");//solicitud de confirmacion de la operacion que realiza
                            rta2=miTeclado.nextInt();//guardo en variable la respuesta 1si o 2no
                            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                      
                            if (rta2==1){//si la respuesta es si
                                saldo=saldo-importe;//resto al saldo el importe ingresado
                                System.out.println("Pago realizado, su saldo actual es de $"+saldo);//mensaje de confirmacion de operacion mas saldo actual
                                System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" PAGO DE SERVICIO DE LUZ: "+servicio+" -- "+"Importe: $"+importe);
                            }
        
                            if (rta2==2){//si respuesta es no
                                System.out.println("Operación cancelada...");//mensaje de operacion cancelada
                                System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                            }    
        
                            if (rta2>2 | rta2<1){//si la respuesta es cualquier otro numero ingresado que no sea 1 o 2
                                System.out.println("Operación cancelada por mal ingreso de confirmación");//mensaje de cancelacion de operacion por mal ingreso de opcion
                                System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                            }
                            rta2=0;//limpio variable
                            opcion2=0;//limpio variable
                            importe=0;//limpio variable
                            servicio=0;//limpio variable
                            break;

                        case 2:
                            //para el pago del servicio de agua, las explicaciones son iguales que la del servicio de luz
                            System.out.println("***PAGO DE SERVICIO DE AGUA***");
                            System.out.println();
                            System.out.println("Su saldo actual es de $"+saldo);
                            System.out.print("Ingrese número de medidor:");                            
                            servicio=miTeclado.nextInt();
                            System.out.print("Importe a pagar:");
                            importe=miTeclado.nextDouble();

                            while (importe>saldo | importe <=0){
                                System.out.print("El importe a pagar no es valido, reingrese:");
                                importe=miTeclado.nextDouble();   
                                System.out.println("-----------------------------");                             
                            }

                            System.out.print( "Confirme operación 1-SI / 2-NO:");
                            rta2=miTeclado.nextInt();
                            System.out.println("-----------------------------");
                    
                            if (rta2==1){
                                saldo=saldo-importe;
                                System.out.println("Pago realizado, su saldo actual es de $"+saldo);
                                System.out.println("-----------------------------");
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" PAGO DE SERVICIO DE AGUA: "+servicio+" -- "+"Importe: $"+importe);
                            }
        
                            if (rta2==2){
                                System.out.println("Operación cancelada...");
                                System.out.println("-----------------------------");
                            }    
        
                            if (rta2>2 | rta2<1){
                                System.out.println("Operación cancelada por mal ingreso de confirmación");
                                System.out.println("-----------------------------");
                            }

                            rta2=0;
                            opcion2=0;
                            importe=0;
                            servicio=0;
                        break;

                        case 3:
                            //para el pago del servicio de gas, las explicaciones son iguales que la del servicio de luz
                            System.out.println("***PAGO DE SERVICIO DE GAS***");
                            System.out.println();
                            System.out.println("Su saldo actual es de $"+saldo);
                            System.out.print("Ingrese número de medidor:");                            
                            servicio=miTeclado.nextInt();
                            System.out.print("Importe a pagar:");
                            importe=miTeclado.nextDouble();

                            while (importe>saldo | importe <=0){
                                System.out.print("El importe a pagar no es valido, reingrese:");
                                importe=miTeclado.nextDouble();   
                                System.out.println("-----------------------------");                             
                            }

                            System.out.print( "Confirme operación 1-SI / 2-NO:");
                            rta2=miTeclado.nextInt();
                            System.out.println("-----------------------------");
                    
                            if (rta2==1){
                                saldo=saldo-importe;
                                System.out.println("Pago realizado, su saldo actual es de $"+saldo);
                                System.out.println("-----------------------------");
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" PAGO DE SERVICIO DE GAS: "+servicio+" -- "+"Importe: $"+importe);
                            }
        
                            if (rta2==2){
                                System.out.println("Operación cancelada...");
                                System.out.println("-----------------------------");
                            }    
        
                            if (rta2>2 | rta2<1){
                                System.out.println("Operación cancelada por mal ingreso de confirmación");
                                System.out.println("-----------------------------");
                            }

                            rta2=0;
                            opcion2=0;
                            importe=0;
                            servicio=0;
                        break;

                        case 4:
                            //para el pago del servicio de limpieza urbana, las explicaciones son iguales que la del servicio de luz
                            System.out.println("***PAGO DE SERVICIO DE LIMPIEZA URBANA***");
                            System.out.println();
                            System.out.println("Su saldo actual es de $"+saldo);
                            System.out.print("Ingrese número de padrón:");                            
                            servicio=miTeclado.nextInt();
                            System.out.print("Importe a pagar:");
                            importe=miTeclado.nextDouble();

                            while (importe>saldo | importe <=0){
                                System.out.print("El importe a pagar no es valido, reingrese:");
                                importe=miTeclado.nextDouble();   
                                System.out.println("-----------------------------");                             
                            }

                            System.out.print( "Confirme operación 1-SI / 2-NO:");
                            rta2=miTeclado.nextInt();
                            System.out.println("-----------------------------");
                    
                            if (rta2==1){
                                saldo=saldo-importe;
                                System.out.println("Pago realizado, su saldo actual es de $"+saldo);
                                System.out.println("-----------------------------");
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" PAGO DE SERVICIO DE LIMP. URB.: "+servicio+" -- "+"Importe: $"+importe);
                            }
        
                            if (rta2==2){
                                System.out.println("Operación cancelada...");
                                System.out.println("-----------------------------");
                            }    
        
                            if (rta2>2 | rta2<1){
                                System.out.println("Operación cancelada por mal ingreso de confirmación");
                                System.out.println("-----------------------------");
                            }

                            rta2=0;
                            opcion2=0;
                            importe=0;
                            servicio=0;
                        break;

                        case 5:
                            //al ingresar en este case la variable que mantiene activo el segundo menu
                            //toma el valor cero para desactivar el ciclo while y volver al menu principal
                            ban2=0;//variable que toma valor cero
                            break;
                        default:
                            System.out.println("Opcion Mal Ingresado");//mensaje que muestra que la opcion elegida es incorrecta
                            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                            opcion2=0;//limpio variable
                            break;
                    }
                    
                }                
                break;

                case 5:
                    opcion3=0;
                    ban3=1;
                    while (ban3==1){//ciclo que mantiene a la vista el segundo menu
                        System.out.println(cyan+"*** EXTRACCION ***");//muestro como encabezado la opcion elegida
                        System.out.println();
                        System.out.println("1 - $100          2 - $200");//primera opcion del menu extraccion
                        System.out.println("3 - $500          4 - $1000");//segunda opcion del menu extraccion
                        System.out.println("5 - $5000         6 - $10000");//tercera opcion del menu extraccion
                        System.out.println("7 - OTRO IMPORTE  8 - CANCELAR");
                        System.out.println();
                        System.out.print("Elija una opción: ");//aviso de seleccion de opcion
                        opcion3 = miTeclado.nextInt();//guardo en variable lo seleccionado
                        System.out.println("-----------------------------"+borrarColor);
                    

                        switch (opcion3){
                            case 1:
                                extraccion(saldo,100);
                                saldo=saldo-100;
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" EXTRACCION: $"+100);
                            break;

                            case 2:
                                extraccion(saldo,200);
                                saldo=saldo-200;
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" EXTRACCION: $"+200);
                            break;

                            case 3:
                                extraccion(saldo,500);
                                saldo=saldo-500;
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" EXTRACCION: $"+500);
                            break;

                            case 4:
                                extraccion(saldo,1000);
                                saldo=saldo-1000;
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" EXTRACCION: $"+1000);
                            break;

                            case 5:
                                extraccion(saldo,5000);
                                saldo=saldo-5000;
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" EXTRACCION: $"+5000);
                            break;

                            case 6:
                                extraccion(saldo,10000);
                                saldo=saldo-10000;  
                                ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" EXTRACCION: $"+10000);        
                            break;

                            case 7:
                                ban4=1;
                                Double miIngreso=1.0;
                                System.out.print("Ingrese monto: $");
                                miIngreso=miTeclado.nextDouble();
                                while (ban4==1){
                                    if (miIngreso%50==0){
                                        extraccion(saldo,miIngreso);
                                        saldo=saldo-miIngreso;
                                        ban4=0;
                                        ultimosMovimientos.add (String.valueOf(LocalDateTime.now())+" EXTRACCION: $"+miIngreso);
                                        miIngreso=1.0;
                                    }else{
                                        System.out.print("Ingrese un número multiplo de 50: $");
                                        miIngreso=miTeclado.nextDouble();
                                    }
                                }
                            break;

                            case 8:
                                ban3=0;
                            break;

                            default:
                            System.out.println("Opcion Mal Ingresado");//mensaje que muestra que la opcion elegida es incorrecta
                            System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                            opcion3=0;//limpio variable
                            break;
                        }
                    }
                break;
                
                case 6:
                    System.out.println("*** ULTIMOS MOVIMIENTOS ***");
                    System.out.println();
                    for (String i:ultimosMovimientos){
                        System.out.println(i);            
                    }
                    System.out.println();
                    System.out.println("---------------------------------");
                break;

                case 7:
                    //esta opcion desactiva la variable que mantiene visible el menu principal y sale del sistema
                    ban=0;//variable que toma el valor 0
                    System.out.println("RETIRE SU TARJETA");//mensaje de salir del sistema
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                break;
                default:
                    System.out.println("Opcion Mal Ingresado");//mensaje que muestra que la opcion elegida es incorrecta
                    System.out.println("-----------------------------");//lineas divisorias para una mejor comprension
                    opcion1=0;//limpio variable
                    break;
                
            }
            

        }
        miTeclado.close();//cierro teclado de memoria
        System.out.println("***FIN DEL PROGRAMA***");//mensaje de fin del programa
    }
}