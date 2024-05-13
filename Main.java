import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        String nombre = EntradaUsuarios.solicitarNombre(scanner);
        String direccion = EntradaUsuarios.solicitarDireccion(scanner);
        boolean esBombero = EntradaUsuarios.esBombero(scanner);

        // Mostrar la información ingresada por el usuario
        EntradaUsuarios.mostrarInformacion(nombre, direccion, esBombero);

        // Enviar alerta según la información del usuario
        if (esBombero) {
            GestionNotificaciones.enviarAlertaBombero(direccion);
        } else {
            GestionNotificaciones.enviarAlertaResidente(direccion);
        }

        // Activar alarma
        ActivadorAlarma.activarAlarma();

        // Reportar incendio
        GestionNotificaciones.reportarIncendio("Calle Principal", "Grave");

        // Evaluar estado de la zona
        String estadoZona = GestionNotificaciones.evaluarEstadoZona("Calle Principal");
        System.out.println("Estado de la zona: " + estadoZona);

        // Enviar notificaciones
        ArrayList<String> destinatarios = new ArrayList<>();
        destinatarios.add("Bomberos");
        destinatarios.add("Residentes");
        GestionNotificaciones.enviarNotificaciones(destinatarios, "Incendio detectado en su área");

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
