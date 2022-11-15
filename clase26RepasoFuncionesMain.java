public class clase26RepasoFuncionesMain {


    public static void main(String[] args) {
        //Declaro variables
        String usuario, pass;

        //Instrucciones de E-S
        clase26RepasoFuncionesImprimir.mensaje("Ingrese su nombre");
        usuario = clase26RepasoFuncionesCapturar.miTeclado("");
        clase26RepasoFuncionesImprimir.mensaje("Ingrese su clave");
        pass = clase26RepasoFuncionesCapturar.miTeclado("");

        //Procesos y resultados. Utilizando la funcion anidada
        clase26RepasoFunciones.verificar(usuario, pass);
    }

}
