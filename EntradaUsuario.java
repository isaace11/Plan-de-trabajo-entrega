import java.util.Scanner;

class EntradaUsuarios {
    public static String solicitarNombre(Scanner scanner) {
        System.out.println("Ingrese su nombre:");
        return scanner.nextLine();
    }

    public static String solicitarDireccion(Scanner scanner) {
        System.out.println("Ingrese su dirección:");
        return scanner.nextLine();
    }

    public static boolean esBombero(Scanner scanner) {
        System.out.println("¿Es usted bombero? (si/no):");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("si");
    }

    public static void mostrarInformacion(String nombre, String direccion, boolean esBombero) {
        System.out.println("Información ingresada:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("¿Es bombero?: " + (esBombero ? "Sí" : "No"));
    }
}
