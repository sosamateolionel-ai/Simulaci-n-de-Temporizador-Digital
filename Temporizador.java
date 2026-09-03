public class Temporizador {

    private int minutos;
    private int segundos;

    public Temporizador(int minutos, int segundos) {

        if (minutos < 0) {
            throw new IllegalArgumentException(
                    "Los minutos no pueden ser negativos"
            );
        }

        if (segundos <= 0 || segundos >= 60) {
            throw new IllegalArgumentException(
                    "Los segundos deben estar entre 1 y 59"
            );
        }

        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void avanzarSegundos(int cantidad) {

        if (cantidad < 0) {
            throw new IllegalArgumentException(
                    "La cantidad de segundos no puede ser negativa"
            );
        }

        segundos += cantidad;

        minutos += segundos / 60;
        segundos = segundos % 60;
    }

    public void mostrarTiempo() {
        System.out.printf(
                "Tiempo restante: %02d:%02d%n",
                minutos,
                segundos
        );
    }

    public static void main(String[] args) {

        Temporizador temporizador = new Temporizador(5, 30);

        System.out.println("Tiempo inicial:");
        temporizador.mostrarTiempo();

        temporizador.avanzarSegundos(95);

        System.out.println("Tiempo después de avanzar 95 segundos:");
        temporizador.mostrarTiempo();
    }
}