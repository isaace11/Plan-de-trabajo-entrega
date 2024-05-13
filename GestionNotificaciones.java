import java.util.ArrayList;
class GestionNotificaciones {
    public static void enviarAlertaBombero(String direccion) {
        System.out.println("Se ha enviado una alerta a los bomberos:");
        System.out.println("¡Incendio reportado en la dirección " + direccion + "!");
    }

    public static void enviarAlertaResidente(String direccion) {
        System.out.println("Se ha enviado una alerta a los residentes:");
        System.out.println("¡Incendio reportado en la dirección " + direccion + "! Por favor evacue la zona.");
    }

    public static void reportarIncendio(String ubicacion, String gravedad) {
        System.out.println("Incendio reportado en " + ubicacion + " con gravedad: " + gravedad);
    }

    public static String evaluarEstadoZona(String ubicacion) {
        String[] estados = {"Normal", "Incendio leve", "Incendio grave"};
        int index = (int) (Math.random() * estados.length);
        return estados[index];
    }

    public static void enviarNotificaciones(ArrayList<String> destinatarios, String mensaje) {
        for (String destinatario : destinatarios) {
            System.out.println("Mensaje enviado a " + destinatario + ": " + mensaje);
        }
    }
}
