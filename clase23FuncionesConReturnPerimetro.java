public class clase23FuncionesConReturnPerimetro {
    //funciones con perimetro
    static double circulo(double radio){
        double perimetro = Math.PI * (radio*2);//Math.PI es el valor de pi 3.14
        return perimetro;
    }

    static double rectangulo(double base, double altura){
        double perimetro = (2*base) * (2*altura);
        return perimetro;
    }

    static double cuadrado(double altura){
        double perimetro = altura * 4;
        return perimetro;
    }
    
}
