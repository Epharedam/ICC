import java.util.Scanner;

public class Main implements InterfazArreglos {

    public static void main(String[] args) {
        // Create an instance of Main
        Main claseHijx = new Main();
        //1. Número mas repetido, usare el ejemplo del pdf de la practica
        int[] repetido = {1, 2, 3, 3, 4, 4, 5, 5, 5, 5};
        
        // imprime los numeros
        System.out.print("Numeros: [");
        for (int i = 0; i < repetido.length; i++) {
            System.out.print(repetido[i]);
            if (i < repetido.length - 1) {
                System.out.print(", ");
            }
        
        }
        System.out.println("]");
        // ve cual es el mas repetido
        int masRepetido = claseHijx.masRepetido(repetido);
        // imprime el resultado
        System.out.println("El numero que esta mas repetido es: " + masRepetido);
        
    
        // 2. Voltear Matriz
        // Con un ejemplo de los que se dio en el pdf de la practica
        int[][] matriz = {
            {2, 5, 0},
            {7, 3, 8},
            {3, 0, 1}
        };
         //imprimir la matriz original
        System.out.print("\nMatriz Original:\n");
        for (int fila=0; fila<matriz.length; fila++){
         for (int columna=0; columna<matriz[fila].length; columna++){
            System.out.printf("%d ", matriz[fila][columna]);
            }
            System.out.println();
            }
         //voltear la matriz
         //InterfazArreglos.espejomatriz(matriz);
         // voltear la matriz
         claseHijx.espejomatriz(matriz);
         //imprimir la matriz espejada
         System.out.println("La matriz en espejo:");
         // imprime ya volteado
           for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
           System.out.print(matriz[i][j] + " ");
          }
          System.out.println();  
        }

        // 3. Matriz que hace enunciados
        char[][] enunciado = {
            {'h', 'o', 'l', 'a'},
            {'q', 'u', 'e'},
            {'t', 'a', 'l'}
        };

        // imprime la matriz original
        System.out.print("\nEnunciado en modo matriz:\n");
        for (char[] fila : enunciado) {
            for (char letra : fila) {
                System.out.printf("%c", letra);
            }
            System.out.println();
        }

        System.out.println("Enunciado normal:");
        // imprime en texto
        String frase = claseHijx.construyeFrase(enunciado);
        System.out.println(frase);

    
    
    // 4. Contenido de arreglos
    int arreglo1[] = {5, 4, 1};
    int arreglo2[] = {8, 4, 6, 2, 3, 0, 5, 1};
    //impresion de los arreglos
    int arr1 = arreglo1.length;
    int arr2 = arreglo2.length;
    
    if (claseHijx.contenido(arreglo1, arreglo2, arr1, arr2)) {
        System.out.print("El arreglo {");
        for (int i = 0; i < arr1; i++) {
            System.out.print(arreglo1[i]);
            if (i < arr1 - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("} esta contenido en el arreglo {");
        for (int i = 0; i < arr2; i++) {
            System.out.print(arreglo2[i]);
            if (i < arr2 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    } else {
        System.out.print("El arreglo {");
        for (int i = 0; i < arr1; i++) {
            System.out.print(arreglo1[i]);
            if (i < arr1 - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("} no esta contenido en el arreglo {");
        for (int i = 0; i < arr2; i++) {
            System.out.print(arreglo2[i]);
            if (i < arr2 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // 5. Metodo quitaRepetidos
    int repetidos[] = {8, 4, 5, 2, 2, 0, 5, 8};
    System.out.print("Arreglo original: [");
    for (int i = 0; i < repetidos.length; i++) {
        System.out.print(repetidos[i]);
        if (i < repetidos.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");

    // InterfazArreglos para borrar
    int[] elementosRepetidos = claseHijx.quitaRepetidos(repetidos);
    System.out.print("Arreglo sin repeticion: [");
    for (int i = 0; i < elementosRepetidos.length; i++) {
        System.out.print(elementosRepetidos[i]);
        if (i < elementosRepetidos.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");

    //6. Muestra los niveles del triangulo de Pascal en una matriz
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe de cuantos niveles quieres el triangulo de Pascal, n = ");
        int n = sc.nextInt();
        sc.close();

        // llama interfazArreglos para hacer el triangulo
        int[][] niveles = claseHijx.pascal(n);

        // Imprime el triangulo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", niveles[i][j]);
            }
            System.out.println();
        }
     }
    }

        @Override
    public int masRepetido(int[] repetido) {
        int n = repetido.length;
        int[] frecuencias = new int[n]; // Array
          for (int i = 0; i < n; i++) {
            int frecuenciaActual = 1;
            for (int j = i + 1; j < n; j++) {
                if (repetido[i] == repetido[j]) {
                    frecuenciaActual++;
                }
            }
    
            frecuencias[i] = frecuenciaActual;
        }
    
            int masRepetido = repetido[0];
            int maximaFrecuencia = frecuencias[0];
    
            for (int i = 1; i < n; i++) {
                if (frecuencias[i] > maximaFrecuencia) {
                    maximaFrecuencia = frecuencias[i];
                    masRepetido = repetido[i];
                }
            }
    
            return masRepetido;
        }
    @Override
    //Matriz volteada 
    public void espejomatriz(int[][] matriz) {
        int rows = matriz.length - 1, cols = matriz[0].length - 1;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][cols - j];
                matriz[i][cols - j] = temp;
            }
        }
     }  

    //3. matriz que hace enunciados 
      public String construyeFrase(char[][] enunciado) {
        StringBuilder frase = new StringBuilder();

        for (int i = 0; i < enunciado.length; i++) {
            for (int j = 0; j < enunciado[i].length; j++) {
                frase.append(enunciado[i][j]);
            }

            // Agrega un espacio entre cada palabra
            if (i < enunciado.length - 1) {
                frase.append(' ');
            }
        }

        return frase.toString();
    }

    //4. Método buscar array en otro
    public boolean contenido(int arreglo1[], int arreglo2[], int m, int n) {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arreglo2[i] == arreglo1[j])
                    break;


            if (j == m)
                return true;
        }
        return false;
    }  

    // 5. Quita los elementos repetidos
    public int[] quitaRepetidos(int[] array) {
        int origarr = 0;
        int[] borrados = new int[array.length];
    
        outer:
        for (int i : array) {
            for (int k = 0; k < origarr; k++) {
                if (i == borrados[k]) {
                    continue outer;
                }
            }
            borrados[origarr++] = i;
        }

        int[] elementosRepetidos = new int[origarr];
        for (int i = 0; i < origarr; i++) {
            elementosRepetidos[i] = borrados[i];
        }

        return elementosRepetidos;
    }

    //6. Niveles del triangulo de Pascal

    public int[][] pascal(int n) {
        int[][] niveles = new int[n][];
 //utiliza dos bucles for anidados, el externo recorre las filas de la matriz y el interno recorre 
 //las columnas de cada fila
        for (int i = 0; i < n; i++) {
            niveles[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    niveles[i][j] = 1;
                } else {
                    niveles[i][j] = niveles[i - 1][j - 1] + niveles[i - 1][j];
                }
            }
    //por cada iteracion se verifica si la columna actual es la primera (j == 0) o la ultima (j == i).
    // Si es asi el elemento en esa posicion se establece en 1      
        }
        return niveles;
        // despues de escribir en la matriz 'niveles' la devuelve como resultado
    }
    
}
