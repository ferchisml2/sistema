import java.util.Scanner;
public class sistema {
    private static final Scanner scanner = new Scanner(System.in);

    public static String obtenerCadena (String mensaje){
    String cadenaTemporal;
    System.out.println (mensaje + ":");
    cadenaTemporal = scanner.nextLine();
    return cadenaTemporal;
}

public static void main (String [] args){
    String nombreUsuario = "ferchis";
    String contraUsuario = "200923";

    String usuarioIngresado = obtenerCadena ("usuario");
    String contraIngresada = obtenerCadena ("contrasenia");
    if (contraIngresada.equals (contraUsuario) && (usuarioIngresado.equals (nombreUsuario)) ){
        System.out.println ("bienvenido");
    } else {
        System.out.println ("sesion incorrecta");
    }
}
}