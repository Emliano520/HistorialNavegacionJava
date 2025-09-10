import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialNavegacion {
    public static void main(String[] args) {
        // Crear el "stack" de historial usando Deque
        Deque<String> historial = new ArrayDeque<>();

        // Agregar 3 páginas web
        historial.push("www.google.com");
        historial.push("www.youtube.com");
        historial.push("www.facebook.com");

        System.out.println("Historial inicial: " + historial);

        // Retroceder una página (pop)
        String paginaActual = historial.pop();
        System.out.println("Se retrocede desde: " + paginaActual);

        // Consultar en qué página estás (peek)
        System.out.println("Página actual: " + historial.peek());

        // Agregar una nueva página
        historial.push("www.twitter.com");

        // Mostrar todo el contenido del historial
        System.out.println("Historial final: " + historial);
    }
}
