import java.util.ArrayList;
import java.util.Scanner;

public class AnimadoresPorTrabajo {

    public static void main(String[] args) {
        Trabajador[] trabajadores = new Trabajador[10];

        String[][] trabajadoresPorTrabajo = new String[10][10];
        double[][] salariosPorTrabajo = new double[10][10];

        int contadorTrabajadores = 0;
        int[] contadorTrabajadoresPorTrabajo = new int[10];
        ArrayList<String[]> lista = new ArrayList<>();
        String[] salarios = { "0", "0", "" };
        int contadorCotizaciones = 0;

        Scanner scanner = new Scanner(System.in);

        char opcion;
        do {
            System.out.println("Evento espectacular:");
            System.out.println("1. Agregar un nuevo trabajo");
            System.out.println("2. Agregar trabajadores a un trabajo existente");
            System.out.println("3. Consultar trabajadores y salarios");
            System.out.println("4. Ver empleados por categoría");
            System.out.println("5. Generar cotización");
            System.out.println("6. Salir");
            System.out.print("Ingrese el número de la opción: ");
            int eleccionUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (eleccionUsuario) {
                case 1:

                    if (contadorTrabajadores < trabajadores.length) {
                        System.out.print("Ingrese el nuevo trabajo: ");
                        String nuevoTrabajo = scanner.nextLine();

                        trabajadoresPorTrabajo[contadorTrabajadores][0] = nuevoTrabajo;

                        contadorTrabajadores++;

                        System.out.println("Trabajo agregado exitosamente");
                    } else {
                        System.out.println("Lista llena, no se puede agregar más trabajos");
                    }
                    break;

                case 2:
                    // Agregar trabajadores a un trabajo existente
                    System.out.print("Ingrese el nombre del trabajo al que desea agregar trabajadores: ");
                    String trabajoExistente = scanner.nextLine();

                    // Buscar el índice del trabajo
                    int indiceTrabajo = -1;
                    for (int i = 0; i < contadorTrabajadores; i++) {
                        if (trabajadoresPorTrabajo[i][0].equalsIgnoreCase(trabajoExistente)) {
                            indiceTrabajo = i;
                            break;
                        }
                    }

                    if (indiceTrabajo != -1) {
                        // Agregar trabajadores y salarios al trabajo existente
                        if (contadorTrabajadoresPorTrabajo[indiceTrabajo] < trabajadoresPorTrabajo[indiceTrabajo].length
                                - 1) {
                            System.out.print("Ingrese el nombre del trabajador: ");
                            String nuevoTrabajador = scanner.nextLine();
                            System.out.print("Ingrese el salario para " + nuevoTrabajador + ": ");
                            double nuevoSalario = scanner.nextDouble();
                            scanner.nextLine(); // Consumir salto de línea

                            trabajadoresPorTrabajo[indiceTrabajo][contadorTrabajadoresPorTrabajo[indiceTrabajo]
                                    + 1] = nuevoTrabajador;
                            salariosPorTrabajo[indiceTrabajo][contadorTrabajadoresPorTrabajo[indiceTrabajo]] = nuevoSalario;

                            contadorTrabajadoresPorTrabajo[indiceTrabajo]++;

                            System.out.println("Trabajador y salario agregados al trabajo " + trabajoExistente);
                            if (lista.size() == 0) {
                                String[] lista1 = { trabajoExistente, String.valueOf(nuevoSalario), "1" };
                                lista.add(lista1);
                            }
                            for (int i = 0; i < lista.size(); i++) {
                                String[] s = lista.get(i);
                                if (s[0].equals(trabajoExistente)) {
                                    s[1] = String.valueOf(Double.parseDouble(salarios[0]) + nuevoSalario);
                                    s[2] = String.valueOf(Integer.parseInt(salarios[1]) + 1);
                                } else {
                                    if (i == lista.size() - 1) {
                                        String[] n = { trabajoExistente,
                                                String.valueOf(Double.parseDouble(salarios[0])),
                                                String.valueOf(Integer.parseInt(salarios[1])) };
                                        lista.add(n);
                                    }
                                }
                            }
                        } else {
                            System.out.println(
                                    "Lista de trabajadores llena para este trabajo. No se pueden agregar más trabajadores.");
                        }
                    } else {
                        System.out.println("No se encontró el trabajo. Por favor, verifique el nombre del trabajo.");
                    }
                    break;

                case 3:
                // Definir los servicios y precios
                String[] servicios = { "Malabarista", "Saxofonista", "Payaso" };
                double[] precios = { 800, 2000, 900 };
            
                // Mostrar el encabezado de la tabla
                System.out.format("%-15s%-15s%-15s\n", "Trabajo", "Animador", "Cantidad");
                System.out.println("-----------------------------------------------");
            
                // Mostrar cada trabajo, trabajadores y la cantidad de animadores por función
                for (int i = 0; i < contadorTrabajadores; i++) {
                    System.out.format("%-15s%-15s\n", trabajadores[i], salarios[i]);
            
                    for (int j = 1; j <= contadorTrabajadoresPorTrabajo[i]; j++) {
                        String animador = trabajadoresPorTrabajo[i][j];

                        //????????????????????????
                        int cantidad = ????? (animador, trabajadoresPorTrabajo, contadorTrabajadoresPorTrabajo);
            
                        System.out.format("%-15s%-15s%-15s\n", "", animador, cantidad);
                    }
                }
                break;
            
                case 4:
                    // Ver empleados por categoría
                    System.out.println("\nCategorías disponibles:");
                    for (int i = 0; i < contadorTrabajadores; i++) {
                        System.out.println((i + 1) + ". " + trabajadoresPorTrabajo[i][0]);
                    }
                    System.out.print("Ingrese el número de la categoría: ");
                    int categoriaElegida = scanner.nextInt() - 1;
                    scanner.nextLine(); 

                    if (categoriaElegida >= 0 && categoriaElegida < contadorTrabajadores) {
                        System.out.println(
                                "Trabajadores en la categoría " + trabajadoresPorTrabajo[categoriaElegida][0] + ":");
                        for (int j = 1; j <= contadorTrabajadoresPorTrabajo[categoriaElegida]; j++) {
                            System.out.format("%-15s%.2f\n", trabajadoresPorTrabajo[categoriaElegida][j],
                                    salariosPorTrabajo[categoriaElegida][j - 1]);
                        }
                    } else {
                        System.out.println("Categoría inválida.");
                    }
                    break;

                case 5:
                    // Generar cotización
                    if (contadorTrabajadores > 0) {
                        // Mostrar opciones de trabajo
                        System.out.println("Opciones de trabajo disponibles:");
                        for (int i = 0; i < contadorTrabajadores; i++) {
                            System.out.println((i + 1) + ". " + trabajadoresPorTrabajo[i][0]);
                        }
                        System.out.print("Ingrese el número del trabajo: ");
                        int trabajoElegido = scanner.nextInt() - 1;
                        scanner.nextLine(); 

                        if (trabajoElegido >= 0 && trabajoElegido < contadorTrabajadores) {
                            // Continuar con la cotización usando el trabajo seleccionado
                            System.out.println("Trabajo seleccionado: " + trabajadoresPorTrabajo[trabajoElegido][0]);

                            // Solicitar la cantidad de trabajadores
                            System.out.print("Ingrese la cantidad de trabajadores: ");
                            int cantidadTrabajadores = scanner.nextInt();
                            scanner.nextLine(); 

                            // Crear arreglos para almacenar nombres y salarios de animadores
                            double[] salariosAnimadores = new double[cantidadTrabajadores];
                            
                            // Mostrar la tabla con los datos ingresados
                            System.out.println("Animador       Cantidad       Pago por hora");
                            System.out.println("-----------------------------------------------");
                            String anterior = "";

                            for (int j = 0; j < cantidadTrabajadores; j++) {
                                if (trabajadoresPorTrabajo[trabajoElegido][0].equals(anterior)) {
                                    break;
                                }
                                double promedio = 0.0;
                                for (String[] s : lista) {
                                    if (s[0].equals(trabajadoresPorTrabajo[trabajoElegido][0])) {
                                        promedio += Double.parseDouble(s[1]) / Double.parseDouble(s[2]);
                                    }
                                }
                                System.out.format("%-15s%-15s%.2f\n", trabajadoresPorTrabajo[trabajoElegido][0],
                                        cantidadTrabajadores,
                                        promedio);
                                anterior = trabajadoresPorTrabajo[trabajoElegido][0];
                            }

                            System.out.println("-----------------------------------------------");

                        } else {
                            System.out.println("Número de trabajo inválido.");
                        }
                    } else {
                        System.out.println("No hay trabajadores registrados para generar una cotización.");
                    }
                    break;
                case 6:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 6.");
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