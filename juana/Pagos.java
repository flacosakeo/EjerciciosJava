public class Pagos {
    //codeamos funciones de servicios
    //Luz
    static double luz(double valor){
         //1-Declaro inicializo mi VL
        double luz = (Variables.saldo-valor);//necesito traer el valor de la variable saldo
        //devolvemos un valor
        return luz;
    }
    static double agua(double valor){
        //1- declaro inicializo variable
        double agua = (Variables.saldo-valor);
        //2-valor de retorno
        return agua;
    }
    static double gas(double valor){
        double gas = (Variables.saldo-valor);
        return gas;
    }


    

}