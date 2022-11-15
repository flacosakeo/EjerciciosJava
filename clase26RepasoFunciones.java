public class clase26RepasoFunciones {

static String saludar(String nombre){
    //Declaro e inicializo una VL
    String saludo = "Hola. Bienvenido/a "+nombre;
    //Valor de retorno
    return saludo;
}

static String error(String nombre){
    //Declaro e inicializo una VL
    String error = "Ups. No pudimos validar tus datos, por favor "+nombre+" intentalo nuevamente";
    //Valor de retorno
    return error;
}

//Funcion anidada
static void verificar(String usuario, String pass){
    //Declaro variables locales
    String usuarioValido = "edu";
    String passValido = "123";

    //Validacion de datos mediante un if
    if(usuarioValido.equals(usuario)&&passValido.equals(pass)){
        //Llamamos a la funcion mensaje de la clase Imprimir
        clase26RepasoFuncionesImprimir.mensaje(clase26RepasoFunciones.saludar(usuario));
        return;
    }
    //Si los datos no son validos
    clase26RepasoFuncionesImprimir.mensaje(error(usuario));
}


    

}