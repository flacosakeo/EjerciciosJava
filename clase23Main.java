//este archivo es el ejecutable

public class clase23Main {
    public static void main(String[] args) {
        //pido hallar los perimetros
        System.out.println("El perimetro del circulo es: "+clase23FuncionesConReturnPerimetro.circulo(1));
        System.out.println("El perimetro del rectangulo es: "+clase23FuncionesConReturnPerimetro.rectangulo(2,3));
        System.out.println("El perimetro del cuadrado es: "+clase23FuncionesConReturnPerimetro.cuadrado(4)); 


        //perimetro de un circulo
        clase23FuncionesConReturnImprimir.mensaje("Perimetro Circulo: ");
        clase23FuncionesConReturnImprimir.mensaje(clase23FuncionesConReturnPerimetro.circulo(1));

        clase23FuncionesConReturnImprimir.mensaje("cilindro: ");
        clase23FuncionesConReturnImprimir.mensaje(clase23FuncionesConReturnSuperficies.cilindro(1, 10));

        //redondear decimal
        double redondeo = Math.round(clase23FuncionesConReturnSuperficies.cilindro(1,10)*100);
        clase23FuncionesConReturnImprimir.mensaje(redondeo/100);
    }
}
