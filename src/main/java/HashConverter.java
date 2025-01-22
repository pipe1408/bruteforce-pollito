import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashConverter {
    public static String hash(String texto) throws NoSuchAlgorithmException {
        String hash = ""; //En esta variable saldrá el Hash generado
        // texto es una variable de tipo String que contiene la contraseña
        // ESTE CÓDIGO NO SE DEBE TOCAR
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(texto.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        hash = hexString.toString();

        return hash;
    }
}
