import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
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
        int masRepetido = InterfazArreglos.masRepetido(repetido);

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
         InterfazArreglos.espejomatriz(matriz);
     System.out.println("La matriz en espejo:");
    // imprime ya volteado
           for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
           System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
        
    }
    //3. Hacer enunciados a partir de una matriz. Con ejemplo del pdf
    char[][] enunciado = {
        {'h', 'o', 'l', 'a'},
        {'q', 'u', 'e'},
        {'t', 'a', 'l'}
    };
    //imprime la matriz original
    System.out.print("\nEnunciado en modo matriz:\n");
    for (char[] fila : enunciado){
        for (char letra : fila) {
            System.out.printf("%c",letra);
            }
            System.out.println();
            }
    System.out.println("Enunciado normal:");        
    //imprime en texto
     String frase = InterfazArreglos.construyeFrase(enunciado);
     System.out.println(frase);
    

    // 4. Contenido de arreglos
    int arreglo1[] = {5, 4, 1};
    int arreglo2[] = {8, 4, 6, 2, 3, 0, 5, 1};
    //impresion de los arreglos
    int arr1 = arreglo1.length;
    int arr2 = arreglo2.length;
    
    if (InterfazArreglos.contenido(arreglo1, arreglo2, arr1, arr2)) {
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
    int[] elementosRepetidos = InterfazArreglos.quitaRepetidos(repetidos);
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
        int[][] niveles = InterfazArreglos.pascal(n);

        // Imprime el triangulo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", niveles[i][j]);
            }
            System.out.println();
        }
     }
    //llaves del main 
  }
}
