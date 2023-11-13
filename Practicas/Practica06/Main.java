public class Main {

    public static void main(String[] args) {
        int[] repetido = {1, 2, 3, 3, 4, 4, 5, 5, 5, 5};
        int masRepetido = InterfazArreglos.masRepetido(repetido);
        System.out.println("El numero que esta mas repetido es: " + masRepetido);
     
     // 2. Voltear Matriz
     // Con un ejemplo de los que se dio en el pdf de la tarea
        int[][] matriz = {
            {2, 5, 0},
            {7, 3, 8},
            {3, 0, 1}
    };
         InterfazArreglos.espejomatriz(matriz);
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

     String frase = InterfazArreglos.construyeFrase(enunciado);
     System.out.println(frase);
    
    //4. Recibe un arreglo y te indica si esta contenido en otro
    
  }
}
