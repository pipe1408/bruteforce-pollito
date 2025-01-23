import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringBuilder texto;
        ArrayList<String> sospechasConfirmadas = new ArrayList<>();
        ArrayList<String> clavesDescifradas = new ArrayList<>();
        String hash = "";

        for (int posicion = 0; posicion < DatosPollito.ROCKYOU_3000.length; posicion++) {
            texto = new StringBuilder(DatosPollito.ROCKYOU_3000[posicion]);

            for (String sospecha : DatosPollito.PALABRAS_COMUNES) {
                if (texto.toString().equals(sospecha)) {
                    sospechasConfirmadas.add(sospecha);
                }
            }

            for (int year = 1995; year <= 2024; year++) {
                texto.append(year).append("*");
                try {
                    hash = HashConverter.hash(String.valueOf(texto));
                } catch (Exception e) {
                    System.out.println("ERROR: " + e.getMessage());
                }

                for (String clave : DatosPollito.CLAVES_EXPUESTAS) {
                    if (hash.equals(clave)) {
                        clavesDescifradas.add(texto.toString());
                    }
                }
                System.out.println(year);
            }
        }

        System.out.println(sospechasConfirmadas);
        System.out.println(clavesDescifradas);
    }
}
