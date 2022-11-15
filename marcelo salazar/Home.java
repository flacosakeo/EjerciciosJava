import java.util.*;
/**
* @author Marcelo Salazar.
* @version 3.0
* @since 08/10/22
*/
public class Home {
    public static void main(String[] args) {

        Scanner teclado;

        teclado= new Scanner(System.in); 

        int opcion=0 , opcion2=0 ,  opcion3=0 ;
        
        int montoTarjeta = 50000;

        int  clave ;
        
        int valorGas= 100000, valorAgua = 500, valorLuz = 2000;

        String destino , usuario;

        int monto= 0;

        int resto , resto2, resto3;


        System.out.println("Ingrese un usuario.");

        usuario = teclado.nextLine();
        
        System.out.println("Ingrese una clave menor a 4 digitos.");
        clave = teclado.nextInt();

        
        do{
            if(clave <10000){
                System.out.println("***Buenos dias " + usuario+ "***");
                System.out.println("Su saldo es de $" + montoTarjeta);
                System.out.println("Por favor, elija una opción:");
                System.out.println("1-Realizar Transferencia.");
                System.out.println("2-Realizar Pago de Servicios.");
                System.out.println("3-Cerrar sesión.");
                opcion=teclado.nextInt();
            }else if(clave>=10000){
                System.out.println("Por favor, ingrese una clave válida.");
                clave = teclado.nextInt();
            }
            
            switch(opcion){
                case 1:
                System.out.println("Ingrese el nombre de la cuenta destino.");
                destino = teclado.next();
                System.out.println("Ingrese el monto que quiere enviar a la cuenta de " + destino + ".");
                monto = teclado.nextInt();
                resto = montoTarjeta - monto;
                montoTarjeta = resto;

                if(monto<50000){
                    System.out.println("Operación realizada exitosamente.");
                    System.out.println("Su saldo acutual es de: $" + resto+ ".");
                    System.out.println("Desea realizar alguna otra operación?");
                    System.out.println("1-Cerrar sesión.");
                    System.out.println("2-Volver al Menú.");

                opcion2 = teclado.nextInt(); 

                
                }else{
                System.out.println("No posee suficiente saldo.");
            }

                break;
                case 2:                              
                
                do{
                    System.out.println("Por favor elija el servicio que desea pagar.");
                    System.out.println("1-Agua = $"+ valorAgua+ ".");
                    System.out.println("2-Luz = $"+ valorLuz+ ".");
                    System.out.println("3-Gas = $" + valorGas+ ".");
                    System.out.println("4-Volver al Menu.");
                    
                    
    
                    opcion3 = teclado.nextInt(); 

                    
    
               
                switch (opcion3) {
                    case 1:
                    resto2= montoTarjeta - valorAgua;
                    resto3= montoTarjeta - valorLuz;
                    montoTarjeta = resto2;
                    System.out.println("**Pago exitoso**");
                    System.out.println("El saldo de su cuenta ahora es de: $"+ resto2+ ".");
                    System.out.println("2-Volver al menú anterior.");
                    opcion2 = teclado.nextInt();
                    
                    
                    break;

                    case 2:                    
                    resto2= montoTarjeta - valorAgua;
                    resto3= montoTarjeta - valorLuz;
                    montoTarjeta =resto3;
                    System.out.println("**Pago exitoso**");
                    System.out.println("El saldo de su cuenta ahora es de: $"+ resto3+ ".");
                    System.out.println("1-Cerrar sesión.");
                    System.out.println("2-Volver al menú anterior.");
                    opcion2 = teclado.nextInt();
                    
                    
                    break;

                    case 3:
                    System.out.println("Saldo insuficiente.");
                    System.out.println("1-Cerrar sesión.");
                    System.out.println("2-Volver al menú anterior.");
                    opcion2 = teclado.nextInt();
                    
                    break;

                }
                }while( opcion3!=4);
                
                

                



            }
            




        }while( opcion!=3 & opcion2!=1 );
        System.out.println("************Extraiga Su tarjeta**************");









    }
}
