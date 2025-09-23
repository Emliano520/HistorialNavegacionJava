import java.util.Scanner;

public class InvertirCadena {

    // función recursiva para imprimir al revés
    public static void invertir(String texto) {
        if (texto.isEmpty()) { // caso base: cadena vacía
            return;
        } else {
            // imprime el último caracter
            System.out.print(texto.charAt(texto.length() - 1));
            // llamada recursiva con el resto de la cadena
            invertir(texto.substring(0, texto.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Al revés es: ");
        invertir(palabra);

        sc.close();
    }
}
