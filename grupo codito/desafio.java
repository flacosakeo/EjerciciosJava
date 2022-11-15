/*
Programar un menú hombe-banking.
1. Que tenga una pantalla de bienvenida y pida usuario y clave sin límite de ingresos (por ahora).
2. Que al ingresar el menú muestre:
a. Datos del usuario
b. un saldo ficticio,
c. una opción transferencia
d. y una opción pago online.
3. El menú de saldo nos mostrará el saldo ficticio y nos dará dos opciones de cerrar sesión para salir o volver al
menú, programar las acciones para tales fines.
4. La operación de transferencia será a una cuenta ficticia donde podremos colocar CBU o Alias y el monto a
transferir, el sistema nos dará aviso de que la operacion de transferencia a dicho usuario por el monto
establecido fue realizada con éxito, adicionalmente tendremos en cuenta la validación de que el fondo a
transferir sea menor o igual al disponible, en caso de que no valide, el sistema nos devolverá la leyenda “La
operacion no puede realizarse por falta de fondos”, tras esta operación el descuento se verá reflejado en el
saldo. Esta sección también contendrá la opción cerrar sesión o regresar al menú.
5. La sección de pago de algún servicio, El usuario podrá ingresar el nombre de la empresa o servicio a pagar y
a continuacion el monto a pagar, luego del pago, deberá descontarse este monto del saldo. El sistema
permita seguir pagando sercivios mientras el saldo disponible sea mayor al monto a pagar, cuando el saldo
sea insuficiente la operacion no podrá realizarse y mostrará la leyenda “Saldo insuficiente”, esta sección
tambien, tendrá una opcion cerrar sesión, o regresar al menú.
6. Por último tras el cierre de sesión en todos los casos arrojará la leyenda por favor extraiga su tarjeta.
*/
/** @ Autores: Sosa Carolina, Avelleneda Erica, Sejas Claudia Rocio , Mercado Florencia , Molina Paula, Exequiel Arce, Frias Milagros.
    @ Comision 22923 "Grupo Codito"
 */




import java.util.*;

public class desafio {

       //función para imprimir mensaje
    static void imprimir(String mensaje){
        System.out.println(mensaje);}
    
    
      
    public static void main(String[] args) {
         //Declaración del objeto

        Scanner miTeclado;

         //Inicializo el objeto
        miTeclado = new Scanner(System.in);

         //variables definidas previamente

        String usuario = "Carlitos";
        int clave = 123;
         //Declaración de la variables
        String usuarioNuevo;
        int claveNueva;

        imprimir("Bienvenidos al banco Codito"); //Se muestra por pantalla el mensaje de bievenida al usuario
        imprimir("Ingrese su nombre de usuario"); // se le solicita al usuario que ingrese su nombre de usuario

        //inicialización de la variable

        usuarioNuevo = miTeclado.nextLine();

         //Se utiliza una estructura condicional doble anidada

        if (usuario.equals(usuarioNuevo)) {   //Se utiliza el método equals para comparar dos string
            imprimir("Su usuario es correcto"); //Se muestra por pantalla al usuario si su nombre de usuario  ingresado es el correcto
            imprimir("Ingrese su clave"); // Se muestra por pantalla ,un mensaje al usuario para que ingrese su clave

            claveNueva = miTeclado.nextInt(); //inicialización de la variable

             //Se utiliza una estructura condicional doble anidada

            if (clave == claveNueva){  //se compara si la clave ingresada es la correcta
                imprimir("Su clave es correcta"); // Se muestra por pantalla el mensaje en el caso que sea correcta la clave ingresada

                imprimir("* * * *"); // se imprime por pantalla unos separadores
                imprimir("Seleccionar la operación deseada: "); // se imprime por pantalla solicitando al usuario que seleccione unas opciones
                imprimir("0- Ingresar al Menú");
                imprimir("1- Salir");

                //Declaración de variables
                int opcion, cbu, dni, nroCuenta;
                double saldoActual;
                
                //variables definidas previamente
                opcion = miTeclado.nextInt();
                cbu = 528449349;
                saldoActual = 100000;
                dni = 19453712;
                nroCuenta = 944322;

                //Se utiliza una estructura condicional doble anidada
                if (opcion == 0){ //En el caso que la opción ingresada sea igual a cero se muestra por pantalla al usuario que seleccione algunas de las opciones que se le muestran por pantalla

                    imprimir("Seleccione una opcion");
                    imprimir("* * * *");
                    
                    //Se utiliza una estructura repetitiva while para que repita las siguientes acciones hasta que el valor ingresado sea distinto al de salida
                    
                    while (opcion != 5){

                        // se muestra en pantalla al usuario las opciones que puede seleccionar una vez ingresado l menú de la aplicación del banco
                        imprimir("1- Datos del usuario");
                        imprimir("2- Consultar Saldo");
                        imprimir("3- Realizar una transferencia");
                        imprimir("4- Opcion pago online");
                        imprimir("5- Salir");

                        opcion = miTeclado.nextInt(); //inicialización de la variable

                        imprimir("* * * *");

                        // se utiliza una estructura de selección múltiple para iniciar el menú que va a utilizar el usuario

                        switch (opcion) {
                            case 1: // en la opción uno se muestra por pantalla la bienvenida al usuario y información de su dni, cbu y número de cuenta
                                imprimir("Bienvenido: "+usuario);
                                imprimir("DNI: "+dni);
                                imprimir("CBU: "+cbu);
                                imprimir("Numero de cuenta: "+nroCuenta);
                                break; //se utiliza esta sentencia para finalizar el switch

                            case 2: // en la opción dos se muestra por pantalla el saldo actual que tiene el usuario en el banco 
                                imprimir("Saldo actual: $"+saldoActual); // se muestra por pantalla el saldo actual que posee el usuario en ese momento
                                imprimir(" *  *  *  *"); // se muestra por pantalla unos separadores
                                imprimir("Seleccione una de las siguientes opciones:"); // se muestra por pantalla un submenú que le permite al usuario, por un lado cerrar la sección directamente de la aplicación del banco y por el otro lado permitiendo al usuario volver al menú principal

                                imprimir("0- Cerrar sección");
                                imprimir("1- Volver al menú");

                                //Declaración de la variable
                                int opcion2;

                                //inicialización de la variable
                                opcion2 = miTeclado.nextInt();
                                 
                                 //se utiliza una estructura condicional doble anidada

                                 if(opcion2!=0){ // si opción seleccionada es distinta a cero, el usuario va a poder volver al menú principal
                                    imprimir("A regresado al menú principal");
                                 } else {
                                        // se utiliza una estructura condional simple

                                        if (opcion2==0){  // si la opción seleccionada es cero, se le asigna el valor que tiene el menú principal para salir de la aplicación
                                            opcion2=5; //asignación de valor 
                                         }
                                        opcion=opcion2; //asignación de valor

                                       imprimir("A salido de la aplicación correctamente"); // se muestra por pantalla que ha podido salir ,yaque al seleccionar la opción cero, este toma el valor de salida que tiene el menú principal
                                          
                                 }                
                                       
                                
                                break; //se utiliza esta sentencia para finalizar el switch

                            case 3: 
                                imprimir("Opción de transferencia");
                                imprimir("Monto a transferir: "); // se muestra por pantalla el monto a transferir

                                  //inicialización de la variable

                                  double transferencia = miTeclado.nextDouble();

                                  // se utiliza una estructura condicional doble

                                if(transferencia <= saldoActual){ //se evalua si el valor de la transferencia menor o igual al saldo actual que posee el usuario en el banco

                                    saldoActual = saldoActual - transferencia; // calculo

                                    imprimir("Ud ha transferido: $"+transferencia); // se muestra por pantalla al usuario el valor a transferir
                                    imprimir("Su nuevo saldo es de: $"+saldoActual); // se muestra por pantalla el saldo que le queda al usuario, luego de haber realizado la transferencia
                                }else{
                                    imprimir("*ERROR* Monto no válido"); // este mensaje es para el caso que el valor a transferir supere al saldo actual
                                }
                                break; //se utiliza esta sentencia para finalizar el switch

                            case 4:
                            
                                imprimir("Pago online"); // con esta opción el usuario va a poder realizar pagos online
                                imprimir("Por favor ingrese el monto a pagar de su factura electrónica: ");

                                double servicioPagar = miTeclado.nextDouble(); //inicialización de la variable

                                if(servicioPagar <= saldoActual){ // se utiliza una estructura condicional simple
                                    saldoActual = saldoActual - servicioPagar; // se realiza un operación matemática para calcular cuanto es lo que le queda al usuario luego de pagar en forma online
                                }
                                imprimir("Transfiriendo..."); // se muestra por pantalla un mensaje de espera, para avisarle al usuario que se está realizando la opereción solicitada
                                try { // se aplica esta estructura para poder estimar el tiempo de espera
                                    Thread.sleep (5000);
                                    } catch (Exception e) {
                                    // Mensaje en caso de que falle
                                    }
                                imprimir("Su transferencia se ha completado con exito"); //se muestra por pantalla al usuario que la operación realizada fue realizada con éxito
                                imprimir("Usted ha pagado su factura electronica, el total de $"+servicioPagar); // se muestra por pantalla el monto de la factura que ha pagado en forma online
                                imprimir("Su saldo actual es de $"+saldoActual); // muestra por pantalla el saldo que le ha quedado al usuario una vez realizado el pago
                                try { // se aplica esta estructura para poder estimar el tiempo de espera
                                    Thread.sleep (5000);
                                    } catch (Exception e) {
                                    // Mensaje en caso de que falle
                                    }
                                
                                break; //se utiliza esta sentencia para finalizar el switch

                            case 5:
                                imprimir("Adios, vuelva pronto"); // se muestra por pantalla que a podido salir correctamente al usuario , una vez seleccionado la opción cinco

                                break; //se utiliza esta sentencia para finalizar el switch

                            default:
                                imprimir("Elija una opcion correcta"); // para el caso que ingrese una opción diferente a las indicadas en el menú principal
                                break; //se utiliza esta sentencia para finalizar el switch
                        }
                    }
                     
                }

            } else{
                imprimir("xxxx");
            }

        } else {
            imprimir("XXXXX");
        }
    }
}
        
