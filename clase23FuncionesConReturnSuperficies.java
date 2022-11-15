public class clase23FuncionesConReturnSuperficies {
    //funciones de superficie
    static double circulo(double radio){
        double superficie = Math.PI * (radio*2);
        return superficie;
    }

    static double rectangulo(double base, double altura){
        double superficie = base * altura;
        return superficie;
    }

    static double cuadrado(double altura){
        double superficie = altura * 4;
        return superficie;
    }

    //funciones anidadas
    //hallar la sup del cilindro
    static double cilindro(double radio, double altura){
        //superficies de tapa y piso dentro de una variable
        double supCirculos = circulo(radio)*2;
        //hallar sup rectangulo
        //base del rectangulo
        double base = clase23FuncionesConReturnPerimetro.circulo(radio);
        //hallar la sup del rectangulo
        double supRectangulo = rectangulo(base, altura);
        //valor del retorno
        return supCirculos + supRectangulo;
    }
    
}
