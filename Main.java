import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su dirección:");
        String direccion = scanner.nextLine();

        // Preguntar al usuario si es bombero
        System.out.println("¿Es usted bombero? (si/no):");
        String respuesta = scanner.nextLine();
        boolean esBombero = respuesta.equalsIgnoreCase("si");

        // Mostrar la información ingresada por el usuario
        System.out.println("Información ingresada:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("¿Es bombero?: " + (esBombero ? "Sí" : "No"));

        // Enviar alerta según la información del usuario
        if (esBombero) {
            GestionNotificaciones.enviarAlertaBombero(nombre, direccion);
        } else {
            GestionNotificaciones.enviarAlertaResidente(nombre, direccion);
        }

        // Activar alarma
        AlertaTemperatura.activarAlarma();

        // Reportar incendio
        AlertaTemperatura.Incendio("Calle Principal", "Grave");

        // Evaluar estado de la zona
        String estadoZona = AlertaTemperatura.EstadoZona("Calle Principal");
        System.out.println("Estado de la zona: " + estadoZona);

        // Enviar notificaciones
        ArrayList<String> destinatarios = new ArrayList<>();
        destinatarios.add("Bomberos");
        destinatarios.add("Residentes");
        GestionNotificaciones.Notificaciones(destinatarios, "Incendio detectado en su área");

        // Detectar temperaturas altas
        AlertaTemperatura alertaTemperatura = new AlertaTemperatura();
        alertaTemperatura.checkTemperatureAlert();

        // Generar temperatura aleatoria entre 0 y 400 grados Celsius
        double temperaturaZona = Math.random() * 400;
        String mensajeTemperatura = AlertaTemperatura.evaluarTemperaturaZona(temperaturaZona);
        System.out.println("Temperatura de la zona: " + temperaturaZona + " grados Celsius");
        System.out.println("Estado de la zona según la temperatura: " + mensajeTemperatura);
    }
}
