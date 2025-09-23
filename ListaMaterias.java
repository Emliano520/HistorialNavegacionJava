import java.util.ArrayList;
import java.util.Scanner;

public class ListaMaterias {
    private ArrayList<String> materias = new ArrayList<>();

    // Método para agregar materias
    public void agregar(String materia) {
        materias.add(materia);
    }

    // Método para buscar una materia
    public boolean contiene(String materia) {
        // Recorremos la lista para ver si existe
        for (String m : materias) {
            if (m.equals(materia)) { // usamos equals para comparar cadenas
                return true;
            }
        }
        return false;
    }

    // Método para imprimir las materias
    public void imprimir() {
        System.out.println("Materias: " + materias);
    }

    // Método main para probar
    public static void main(String[] args) {
        ListaMaterias lista = new ListaMaterias();
        Scanner sc = new Scanner(System.in);

        // Insertar al menos 5 materias
        lista.agregar("Matemáticas");
        lista.agregar("Física");
        lista.agregar("Química");
        lista.agregar("Historia");
        lista.agregar("Programación");

        // Imprimir materias
        lista.imprimir();

        // Pedir al usuario una materia a buscar
        System.out.print("Ingresa una materia a buscar: ");
        String materiaBuscada = sc.nextLine();

        // Usar contiene() y mostrar resultado
        boolean encontrada = lista.contiene(materiaBuscada);

        System.out.println("Búsqueda: " + materiaBuscada);
        if (encontrada) {
            System.out.println("Resultado: Materia encontrada");
        } else {
            System.out.println("Resultado: Materia no encontrada");
        }

        sc.close();
    }
}
