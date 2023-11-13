public class InterfazArreglos {

    public static int masRepetido(int[] repetido) {
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

      //Matriz volteada 
      public static void espejomatriz(int[][] matriz) {
        int rows = matriz.length - 1, cols = matriz[0].length - 1;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][cols - j];
                matriz[i][cols - j] = temp;
            }
        }
      }  

      //matriz que hace enunciados 
      public static String construyeFrase(char[][] enunciado) {
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

}