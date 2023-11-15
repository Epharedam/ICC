//import java.util.Scanner;

public class Main implements InterfazArreglos {

    public static void main(String[] args) {
        // Create an instance of Main
        Main mainInstance = new Main();
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
        int masRepetido = mainInstance.masRepetido(repetido);
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
         mainInstance.espejomatriz(matriz);
         //imprimir la matriz espejada
         System.out.println("La matriz en espejo:");
         // imprime ya volteado
           for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
           System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
        
    }

        // 3. Hacer enunciados a partir de una matriz
        // Your code...

        // 4. Contenido de arreglos
        // Your code...

        // 5. Metodo quitaRepetidos
        // Your code...

        // 6. Muestra los niveles del triangulo de Pascal en una matriz
        // Your code...
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
    
}
