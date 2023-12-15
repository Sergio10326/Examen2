package examen_cod;

    import java.util.Scanner;

public class NumJug {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un mensaje
        System.out.print("Por favor, ingresa un mensaje: ");
        
        // Leer el mensaje ingresado por el usuario
        String mensaje = scanner.nextLine();

        // Mostrar el mensaje ingresado
        System.out.println("Has ingresado: " + mensaje);

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}
