import java.util.Scanner;

public class AnimadoresPorTrabajo {
    public static void main(String[] args) {
        // Arrays para almacenar animadores y salarios
        String[] animadores = new String[10];
        double[] salarios = new double[10];

        // Arrays para almacenar animadores por trabajo y salarios por trabajo
        String[][] animadoresPorTrabajo = new String[10][10];
        double[][] salariosPorTrabajo = new double[10][10];

        // Contadores
        int contadorAnimadores = 0;
        int[] contadorAnimadoresPorTrabajo = new int[10];

        // Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Permitir al usuario agregar nuevos trabajos o animadores a un trabajo existente
        char opcion;
        do {
            System.out.println("Evento espectacular:");
            System.out.println("1. Agregar un nuevo trabajo");
            System.out.println("2. Agregar animadores a un trabajo existente");
            System.out.println("3. Consultar animadores y salarios");
            System.out.println("4. Ver empleados por categoría");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número de la opción: ");
            int eleccionUsuario = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (eleccionUsuario) {
                case 1:
                    // Agregar un nuevo trabajo
                    if (contadorAnimadores < animadores.length) {
                        System.out.print("Ingrese el nuevo trabajo: ");
                        String nuevoTrabajo = scanner.nextLine();

                        animadores[contadorAnimadores] = nuevoTrabajo;

                        contadorAnimadores++;

                        System.out.println("Trabajo agregado exitosamente");
                    } else {
                        System.out.println("Lista llena, no se puede agregar más trabajos");
                    }
                    break;

                case 2:
                    // Agregar animadores a un trabajo existente
                    System.out.print("Ingrese el nombre del trabajo al que desea agregar animadores: ");
                    String trabajoExistente = scanner.nextLine();

                    // Buscar el índice del trabajo
                    int indiceTrabajo = -1;
                    for (int i = 0; i < contadorAnimadores; i++) {
                        if (animadores[i].equalsIgnoreCase(trabajoExistente)) {
                            indiceTrabajo = i;
                            break;
                        }
                    }

                    if (indiceTrabajo != -1) {
                        // Agregar animadores y salarios al trabajo existente
                        if (contadorAnimadoresPorTrabajo[indiceTrabajo] < animadoresPorTrabajo[indiceTrabajo].length) {
                            System.out.print("Ingrese el nombre del animador: ");
                            String nuevoAnimador = scanner.nextLine();
                            System.out.print("Ingrese el salario para " + nuevoAnimador + ": ");
                            double nuevoSalario = scanner.nextDouble();
                            scanner.nextLine(); // Consumir salto de línea

                            animadoresPorTrabajo[indiceTrabajo][contadorAnimadoresPorTrabajo[indiceTrabajo]] = nuevoAnimador;
                            salariosPorTrabajo[indiceTrabajo][contadorAnimadoresPorTrabajo[indiceTrabajo]] = nuevoSalario;

                            contadorAnimadoresPorTrabajo[indiceTrabajo]++;

                            System.out.println("Animador y salario agregados al trabajo " + trabajoExistente);
                        } else {
                            System.out.println("Lista de animadores llena para este trabajo. No se pueden agregar más animadores.");
                        }
        } 
                    else {
                        System.out.println("No se encontró el trabajo. Por favor, verifique el nombre del trabajo.");
                    }
                    break;

                case 3:
                 // Animadores y salarios en el catálogo
                animadores[contadorAnimadores] = "Malabarista";
                salarios[contadorAnimadores] = 500.0;
                contadorAnimadores++;
                animadores[contadorAnimadores] = "Saxofonista";
                salarios[contadorAnimadores] = 700.0;
                contadorAnimadores++;
                animadores[contadorAnimadores] = "Payaso";
                salarios[contadorAnimadores] = 1000.0;
                contadorAnimadores++;

            // Mostrar el encabezado de la tabla
            System.out.format("%-15s%s\n", "Animadores", "Salarios");
            System.out.println("-------------------------");

            // Mostrar cada trabajo, animadores y sus salarios
             for (int i = 0; i < contadorAnimadores; i++) {
                System.out.format("%-15s%-15s\n", animadores[i], salarios[i]);

             for (int j = 0; j < animadoresPorTrabajo.length; j++) {
                animadoresPorTrabajo[j] = new String[10];
             }

            System.out.println();
        }
            
            break;

                case 4:
                    // Ver empleados por categoría
                    System.out.println("\nCategorías disponibles:");
                    for (int i = 0; i < contadorAnimadores; i++) {
                        System.out.println((i + 1) + ". " + animadores[i]);
                    }
                    System.out.print("Ingrese el número de la categoría: ");
                    int categoriaElegida = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consumir salto de línea

                    if (categoriaElegida >= 0 && categoriaElegida < contadorAnimadores) {
                        System.out.println("Empleados en la categoría " + animadores[categoriaElegida] + ":");
                        for (int j = 0; j < contadorAnimadoresPorTrabajo[categoriaElegida]; j++) {
                            System.out.format("%-15s%.2f\n", animadoresPorTrabajo[categoriaElegida][j], salariosPorTrabajo[categoriaElegida][j]);
                        }
                    } else {
                        System.out.println("Categoría inválida.");
                    }
                    break;

                case 5:
                    // Salir del programa
                    System.out.println("Saliendo del programa. ¡Gracias!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 5.");
                    break;
            }

            System.out.print("¿Desea realizar otra acción? (s/n): ");
            opcion = scanner.next().charAt(0);
            scanner.nextLine();
        } while (opcion == 's' || opcion == 'S');

        // Cerrar el scanner
        scanner.close();
    }
}

