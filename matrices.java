import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");//limpia pantalla
        String matriz [][] = new String [3][3];//declaro matriz de 3 x 3
        Scanner teclado = new Scanner (System.in);//inicializo mi teclado para ingreso de datos
            for (int f=0; f<3; f++){//for que recorre las filas de la matriz
                for (int c=0; c<3; c++){//for que recorre las columnas de la matriz
                    System.out.print("ingrese valor para fila "+f+" columna "+c+": ");//pido que ingrese un valor en la posicion que se indica de la matriz
                    String tecla = teclado.nextLine();//guardo el dato en variable
                    matriz [f][c]= tecla;//guardo en la matriz el dato
                }
            }
        
        System.out.println("--------------------");//linea devisorias
        System.out.print("Contenido de la Matriz: ");
        for (int f=0; f<3; f++){//for que recorre las filas de la matriz
            for (int c=0; c<3; c++){//for que recorre las columnas de la matriz
                System.out.print(matriz[f][c]+",");//muestro el contenido de cada casillero de la matriz separado por una coma
            }
        }
        System.out.println();
        System.out.println("--------------------");//linea divisoria
        System.out.print("Elemento que quiere buscar: ");//pido que ingrese algun dato para buscar en la matriz
        String buscar=teclado.nextLine();//guardo el dato ingresado en variable
        System.out.println("--------------------");//linea divisoria

        for (int f=0; f<3; f++){//for que recorre las filas de la matriz
            for (int c=0; c<3; c++){//for que recorre las columnas de la matriz
                if (buscar.equals(matriz[f][c])){//comparo el dato ingresado para buscar con cada casillero de la matriz
                    System.out.println("Encontrado, "+buscar+ ": fila: "+f+" columna: "+c);//si lo encuentra dice "encontrado" y la posicion en donde se encuentra
                    System.out.println("--------------------");//linea divisoria
                    //System.out.println("Cuenta Nº: "+matriz[f][c+1]);//esta linea muestra el valor que le sigue al encontrado
                    //System.out.println("Saldo: "+matriz[f][c+2]+" pesos");//esta linea muestra el segundo valor que le sigue al encontrado
                    break;//sale de los cliclos for cuando encuentra el dato buscado
                }
            }
            
        }
        
        teclado.close();//cierro teclado
    }
}
