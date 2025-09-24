public class ContarChar {

    // Método recursivo
    public static int contar(String texto, char objetivo) {
        // Caso base: si el texto está vacío
        if (texto.isEmpty()) {
            return 0;
        }

        // Tomamos el primer carácter
        char primero = texto.charAt(0);

        // Si coincide con el objetivo, sumamos 1
        if (primero == objetivo) {
            return 1 + contar(texto.substring(1), objetivo);
        } else {
            // Si no coincide, seguimos sin sumar
            return contar(texto.substring(1), objetivo);
        }
    }

    // Método principal para probar
    public static void main(String[] args) {
        String palabra1 = "programacion";
        char letra1 = 'o';
        System.out.println("Palabra: " + palabra1 + " | Letra: " + letra1 + " | Veces: " + contar(palabra1, letra1));

        String palabra2 = "aaaa";
        char letra2 = 'a';
        System.out.println("Palabra: " + palabra2 + " | Letra: " + letra2 + " | Veces: " + contar(palabra2, letra2));

        String palabra3 = "";
        char letra3 = 'x';
        System.out.println("Palabra: \"" + palabra3 + "\" | Letra: " + letra3 + " | Veces: " + contar(palabra3, letra3));
    }
}
