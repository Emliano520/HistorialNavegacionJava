import java.util.Scanner;

public class SumaRecursiva {
    
    // Método recursivo para calcular la suma
    public static int suma(int n) {
        if (n == 0) {
            return 0; // Caso base
        } else {
            return n + suma(n - 1); // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        // Calcular la suma recursiva
        int resultado = suma(n);

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);

        sc.close();
    }
}
