import java.util.Scanner;

public class Servicios {
    public static void main(String[] args) {
    
        String[] servicios = new String[10];
        double[] precios = new double[10];
        int animadores = 0;

        // input del usuario
        Scanner scanner = new Scanner(System.in);

        // animadores disponibles 
        servicios[animadores] = "Malabarista";
        precios[animadores] = 800;
        animadores++;
        servicios[animadores] = "Saxofonista";
        precios[animadores] = 2000;
        animadores++;
        servicios[animadores] = "Payaso";
        precios[animadores] = 900;
        animadores++;

        // Display the table header
        System.out.format("%-15s%s\n", "Animador", "Precio");
        System.out.println("-------------------------");

        // precio de cada animador y nombre 
        for (int i = 0; i < animadores; i++) {
            System.out.format("%-15s$%.2f\n", servicios[i], precios[i]);
        }

        // Agrega animadores nuevos y sus salarios/precios ademas de ver los que ya estan en el catalogo
        char choice;
        do {
            System.out.println("\nEvento espectacular");
            System.out.println("1. Agregar un nuevo animaodr");
            System.out.println("2. animadores disponibles y precios");
            System.out.println("3. salir");
            System.out.print("Elige un numero: ");
            int eleccionUsuario = scanner.nextInt();
            scanner.nextLine(); 

            switch (eleccionUsuario) {
                case 1:
                    // Agrega un nuevo animador al catalogo
                    if (animadores < servicios.length) {
                        System.out.print("Ingresa el nuevo animador: ");
                        String nuevoAnimador = scanner.nextLine();
                        System.out.print("Ingresa el salario del nuevo animador " + nuevoAnimador + ": ");
                        double nuevoPrecio = scanner.nextDouble();

                        servicios[animadores] = nuevoAnimador;
                        precios[animadores] = nuevoPrecio;

                        animadores++;

                        System.out.println("Animador agregado");
                    } else {
                        System.out.println("Lista llena, no puede agregar más animadores");
                    }
                    break;

                case 2:
                    // Consultar los animadores disponibles y agregarlos
                    System.out.println("\nAnimadores");
                    for (int i = 0; i < animadores; i++) {
                        System.out.format("%-15s$%.2f\n", servicios[i], precios[i]);
                    }
                    break;

                case 3:
                    // Quit the program
                    System.out.println("saliendo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Solo puede elegir un número del menú.");
                    break;
            }

            System.out.print("¿Quieres ejecutar otra accion en el menú? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        // Cierra el scanner
        scanner.close();
    }
}