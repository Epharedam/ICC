interface InterfazArreglos
{
    int masRepetido(int[] numeros);

      //2. Matriz volteada 
     public static void matrizEspejo(int[][] arreglo) {
        int rows = arreglo.length - 1, cols = arreglo[0].length - 1;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols / 2; j++) {
                int temp = arreglo[i][j];
                arreglo[i][j] = arreglo[i][cols - j];
                arreglo[i][cols - j] = temp;
            }
        }
      }  

      //3. matriz que hace frases 
      public static String construyeFrase(char[][] frase) {
        StringBuilder frase2 = new StringBuilder();

        for (int i = 0; i < frase.length; i++) {
            for (int j = 0; j < frase[i].length; j++) {
                frase2.append(frase[i][j]);
            }

            // Agrega un espacio entre cada palabra
            if (i < frase.length - 1) {
                frase2.append(' ');
            }
        }

        return frase2.toString();
    }
    
    //4.
    //Método buscar array en otro
    public static boolean contenido(int contenido[], int contenedor[], int m, int n) {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (contenedor[i] == contenido[j])
                    break;


            if (j == m)
                return true;
        }
        return false;
    }  

    // 5. Quita los elementos repetidos
    public static int[] quitaRepetidos(int[] array) {
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

    public static int[][] pascal(int n) {
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
  //llave de class  
} 