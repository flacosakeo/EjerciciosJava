public class clase19Break {
    public static void main(String[] args) {
        //aun cuando el if debe hacer 3 pasadas porque las claves no coinciden el break obliga a que no sea asi
        int intento = 0; //Contador declarado de manera global
        String pass = "123";
        String passControl = "124";

        //Bucle for
        for (int i = 1; i<=3; i++){

            if(pass == passControl){
                System.out.println("\nConstraseña correcta\n");
                System.out.println("Intentos: "+i);
                intento ++;
                break;//interrumpe el ciclo for y sale antes de cumplir el limite permitido
            //continue;//hace continuar el ciclo hasta cumplir el limite aunque se cumpla la condicion
            }
        }

        System.out.println("Intentos totales: "+intento);

        if (intento == 1)
            System.out.println("El programa debió haber hecho 3 recorridos pero se utilizo un break por lo que se produjo un solo bucle i = " + intento);

        if (intento == 3)
            System.out.println("Se utilizo un continue por lo tanto hubieron 3 recorridos i="+ intento);

        System.out.println("*** El programa ha finalizado ***");
    }
}
