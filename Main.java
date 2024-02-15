import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        Stack<String> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar con cola");
            System.out.println("2. Eliminar con cola");
            System.out.println("3. Agregar con pila");
            System.out.println("4. Eliminar con pila");
            System.out.println("5. Mostrar datos");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a agregar con cola: ");
                    String datoCola = scanner.nextLine();
                    cola.add(datoCola);
                    System.out.println("Dato agregado a la cola: " + datoCola);
                    break;

                case 2:
                    if (!cola.isEmpty()) {
                        String datoEliminadoCola = cola.poll();
                        System.out.println("Dato eliminado de la cola: " + datoEliminadoCola);
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el dato a agregar con pila: ");
                    String datoPila = scanner.nextLine();
                    pila.push(datoPila);
                    System.out.println("Dato agregado a la pila: " + datoPila);
                    break;

                case 4:
                    if (!pila.isEmpty()) {
                        String datoEliminadoPila = pila.pop();
                        System.out.println("Dato eliminado de la pila: " + datoEliminadoPila);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 5:
                    System.out.println("Datos en la cola: " + cola);
                    System.out.println("Datos en la pila: " + pila);
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}