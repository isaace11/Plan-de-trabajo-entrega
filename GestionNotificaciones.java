import java.util.ArrayList;

public class GestionNotificaciones {
    public static void enviarAlertaBombero(String nombre, String direccion) {
        System.out.println("Se ha enviado una alerta a los bomberos:");
        System.out.println("¡Incendio reportado en la dirección " + direccion + "!");
    }

    public static void enviarAlertaResidente(String nombre, String direccion) {
        System.out.println("Se ha enviado una alerta a los residentes:");
        System.out.println("¡Incendio reportado en la dirección " + direccion + "! Por favor evacue la zona.");
    }

    public static void Notificaciones(ArrayList<String> destinatarios, String mensaje) {
        for (String destinatario : destinatarios) {
            System.out.println("Mensaje enviado a " + destinatario + ": " + mensaje);
        }
    }
}
