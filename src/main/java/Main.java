import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringBuilder texto;
        ArrayList<String> sospechasConfirmadas = new ArrayList<>();
        ArrayList<String> clavesDescifradas = new ArrayList<>();
        ArrayList<Integer> posicionClaves = new ArrayList<>();
        String hash = "";

        Instant tiempoInicio = Instant.now();

        for (int posicion = 0; posicion < DatosPollito.ROCKYOU_3000.length; posicion++) {
            texto = new StringBuilder(DatosPollito.ROCKYOU_3000[posicion]);
            String textoOriginal = texto.toString();

            for (String sospecha : DatosPollito.PALABRAS_COMUNES) {
                if (texto.toString().contains(sospecha)) {
                    sospechasConfirmadas.add(sospecha);
                    posicionClaves.add(posicion);
                }
            }

            for (int year = 1995; year <= 2024; year++) {
                texto = new StringBuilder(textoOriginal);
                texto.append(year).append("*");

                try {
                    hash = HashConverter.hash(texto.toString());
                } catch (Exception e) {
                    System.out.println("ERROR al convertir a hash la contraseña: " + texto + ". Mensaje: " + e.getMessage());
                }


                for (String clave : DatosPollito.CLAVES_EXPUESTAS) {
                    if (hash.equals(clave)) {
                        clavesDescifradas.add(texto.toString());
                    }
                }
            }
        }

        Instant tiempoFin = Instant.now();
        long tiempoTotal = Duration.between(tiempoInicio, tiempoFin).toMillis();

        System.out.println("Palabras sospechosas encontradas en Rockyou: " + sospechasConfirmadas);
        System.out.println("Claves descifradas: " + clavesDescifradas);
        System.out.println("Palabras Rockyou identificadas (Posición): " + posicionClaves);
        System.out.println("El tiempo total de ejecución fue de: " + tiempoTotal + " milisegundos");
    }
}