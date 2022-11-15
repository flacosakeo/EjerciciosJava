

public class clase10doWhile {
    public static void main(String[] args) {
        //variables
        int n = 5;//numero del factorial
        int f = 1;//acumulador
        int i = 1;//contador

        //bucle do while
        do{
            f=f*i;
            i++;
        }while(i<=n);

        System.out.println("el factorial: "+n+" es "+f);
        System.out.println("fin");

    }
}
