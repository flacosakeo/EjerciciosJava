public class clase25Recursivos {
    static long factorial(long n){//funcion recursiva es cuando una funcion se llama asi misma
        if (n==0){
            return 1;
        }else{
            return n*(factorial(n-1));
        }
    }
    public static void main(String[] args) {
        long t1 = System.nanoTime();//mide el tiempo que demora en ejecutar la funcion recursiva   
        factorial(5);
        long t2 = System.nanoTime();    
        factorial(5);


        clase23FuncionesConReturnImprimir.mensaje(factorial(5));//implemento de la funcion recursiva

        //comparamos la recursiva con un bucle for simple
        long acum = 1;
        long t3 = System.nanoTime();//mide el tiempo que demora en ejecutar el ciclo for
        for (int i = 5; i >= 1; i--){
            acum*=i;//acum=acum*i
        }
        long t4 = System.nanoTime();
        clase23FuncionesConReturnImprimir.mensaje("El tiempo de la funcion recursiva es: ");
        clase23FuncionesConReturnImprimir.mensaje(t2 - t1);

        clase23FuncionesConReturnImprimir.mensaje("El tiempo del bucle for es: ");
        clase23FuncionesConReturnImprimir.mensaje(t4 - t3);
    }
}
