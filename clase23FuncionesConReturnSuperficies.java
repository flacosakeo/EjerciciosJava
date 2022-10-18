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
    
}
