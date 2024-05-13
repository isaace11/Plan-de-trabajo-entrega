import java.util.Random;
class AlertaTemperatura {
    private double[][] temperatureMatrix;
    private final int MATRIX_SIZE = 5;
    private final double HIGH_TEMPERATURE_THRESHOLD = 500.0;

    public AlertaTemperatura() {
        temperatureMatrix = new double[MATRIX_SIZE][MATRIX_SIZE];
        initializeMatrix();
    }

    private void initializeMatrix() {
        Random random = new Random();
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                temperatureMatrix[i][j] = random.nextDouble() * 1000;
            }
        }
    }

    public void checkTemperatureAlert() {
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                if (temperatureMatrix[i][j] > HIGH_TEMPERATURE_THRESHOLD) {
                    System.out.println("¡Alerta! Temperatura alta detectada en la posición [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("No se han detectado temperaturas altas en la zona.");
    }

    public static String evaluarTemperaturaZona(double temperatura) {
        if (temperatura >= 0 && temperatura <= 50) {
            return "Estado de la zona: Normal";
        } else if (temperatura > 50 && temperatura <= 100) {
            return "Estado de la zona: Incendio leve";
        } else if (temperatura > 100 && temperatura <= 250) {
            return "Estado de la zona: Incendio controlado";
        } else {
            return "Estado de la zona: Incendio grave";
        }
    }
}
