/*
Hombanking con tres opciones: Saldo-Transferencia-Pago de srvicios
25/10/22
Codo a Codo inicial
@JuanaEzcurdia
*/

public class Main {
    public static void main(String[] args) {
                
        //El do while es por si el usuario o contraseña son incorrectos para que vuelva a ingresarlos                    
        do {
            Imprimir.mensaje("Ingrese nombre de usuario: ");
            Variables.usuario = Teclado.teclado("");
             Imprimir.mensaje("Ingrese su contraseña:");
             Variables.cont = Teclado.num(0);
        }while(Variables.usuario.compareTo(Variables.usuario)!=0 || Variables.cont!=12345);
        //mientras usuario y contraseña sean correctos: 
        if (Variables.usuario.equals(Variables.usuario)&&Variables.cont==12345) {
            do { //Do while por si el usuario quiere volver a menú principal después de la operación
                Imprimir.mensaje("Eliga una opción:");
                Imprimir.mensaje("1- Saldo");
                Imprimir.mensaje("2- Transferencias");
                Imprimir.mensaje("3- Pago de servicios");
                Variables.opcion = Teclado.num(0);
                if (Variables.opcion==1) {//Si elige Saldo
                    Imprimir.mensaje("Su saldo actual es de: ");
                    Imprimir.num1(Variables.saldo);//llamo el saldo de la carpeta variables
                    Imprimir.mensaje("¿Desea salir? S/N");
                    Variables.resp = Teclado.teclado("");
                    if (Variables.resp.compareToIgnoreCase("S")==0) {
                        Imprimir.mensaje("Gracias por usar nuestro servicio");
                    
                    }


                
                }else if (Variables.opcion==2) {//En caso que el cliente desee hacer una transferencia
                    Imprimir.mensaje("Ingrese el monto que desea transferir:");
                    Variables.transferencia = Teclado.num1(0);
                    Imprimir.mensaje("Su transferencia fue exitosa! Su saldo actual es de:");
                    Imprimir.num1(Variables.saldo-Variables.transferencia);
                    Imprimir.mensaje("¿Desea salir? S/N");
                    Variables.resp=Teclado.teclado("");
                    if (Variables.resp.compareToIgnoreCase("S")==0) {
                        Imprimir.mensaje("Gracias por usar nuestros servicios!");
                        
                    }
                   
                    
                }else if (Variables.opcion==3) {//En caso que el cliente desee hacer un pago de servicios
                    Imprimir.mensaje("Seleccione un servivio:");
                    Imprimir.mensaje("4-Luz: 2000");
                    Imprimir.mensaje("5-Gas: 40000");
                    Imprimir.mensaje("6-Agua: 1500");
                    Variables.opcion1 = Teclado.num(0);
                    if (Variables.opcion1==4) {
                        Imprimir.mensaje("Su pago ha sido realizado con éxito:");
                        Imprimir.mensaje("Su número de comprobante es: 8794324");
                        Imprimir.mensaje("Su saldo actual es: "); 
                        Imprimir.num1(Pagos.luz(2000));
                    }else if (Variables.opcion1==5) {
                        Imprimir.mensaje("Su pago ha sido realizado con éxito:");
                        Imprimir.mensaje("Su número de comprobante es: 8794345");
                        Imprimir.mensaje("Su saldo actual es: ");
                        Imprimir.num1(Pagos.agua(4000));
                    }else if (Variables.opcion1==6) {
                        Imprimir.mensaje("Su pago ha sido realizado con éxito:");
                        Imprimir.mensaje("Su número de comprobante es: 9845327");
                        Imprimir.mensaje("Su saldo actual es: ");
                        Imprimir.num1(Pagos.gas(2000));
                    }
                    Imprimir.mensaje("¿Desea salir? S/N");
                    Variables.resp = Teclado.teclado("");
                    if (Variables.resp.compareToIgnoreCase("S")==0) {
                        Imprimir.mensaje("Gracias por usar nuestros servicios!");
                    }
                        

                    

                    
                }

            }while(Variables.resp.compareToIgnoreCase("N")==0);
            

            
            
        }


    }
    

    

}