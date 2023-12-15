public class Main implements AnalizadorCadenas {
    
    public static void main(String[] args) {
        Main mainPrueba = new Main();

        // Ejemplo de encuentra vocal
        String ejemplo = "ciencias";
        char primeraVocal = mainPrueba.encuentraVocal(ejemplo);
        System.out.println("Primera vocal en '" + ejemplo + "' es: " + primeraVocal);

        // Ejemplo de cuadrado

        int nivel = 4; 
        mainPrueba.cuadrado(nivel);
    
        //Nombre ejemplo
        String fullName = "Hilda Carbajal";
        String abbreviatedName = mainPrueba.nombreAbreviado(fullName);
        System.out.println("" + abbreviatedName);

        


    }

    @Override
    public char encuentraVocal(String palabra) {
        char[] vocales = {'A', 'E', 'I', 'O', 'U'};
        for (char letra : palabra.toUpperCase().toCharArray()) {
            for (char vocal : vocales) {
                if (letra == vocal) {
                    return letra;
                }
            }
        }
        return '\0';
    }

    @Override
    public void cuadrado(int nivel) {
        for (int i = 1; i <= nivel; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("  ");
            for (int j = 4; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
        

        
    @Override
    public void rombosNumericos(int n) {
        int max = 5;
    int startNumber = 1;

    // First Half of the Pyramid
    for (int i = 1; i <= max; i++) {
      // This loop will print the whitespaces in each row
      // of the first half of the Pyramid
      for (int j = max; j > i; j--) {
        System.out.print(" ");
      }
      // This loop will print the stars in each row
      // of the first half of the Pyramid
      for (int k = 0; k < i * 2 - 1; k++) {
        System.out.print(startNumber++);
      }
      // Re-initializing the start number for next row
      startNumber = 1;
      //To move the cursor to new line for each new row
      System.out.println();
    }

    // Second Half of the Pyramid
    for (int i = 1; i <= max - 1; i++) {
      // Print whitespace in second half of pattern
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // Print stars in second half of pattern
      for (int k = (max - i) * 2 - 1; k > 0; k--) {
        System.out.print(startNumber++);
      }
      // Re-initializing the start number for next row
      startNumber = 1;
      //new line for next row
      System.out.println();
    }
        
    }
    @Override
    public String nombreAbreviado(String nombre) {
        int len = nombre.length();
        nombre = nombre.trim();
     
        String t = "";
        String temp = "";
    
        for (int i = 0; i < len; i++) {
            char ch = nombre.charAt(i);
    
            if (ch != ' ') {
                t = t + ch;
            } else {
    
                // primera letra del nombre en mayúscula
                System.out.print(Character.toUpperCase(t.charAt(0)) + ". ");
                
                // procesar apellido
                for (int j = 0; j < t.length(); j++) {
                    // primera letra del apellido en mayúscula
                    if (j == 0)
                        temp = temp + Character.toUpperCase(t.charAt(0));
                    // letras en minúscula
                    else
                        temp = temp + Character.toLowerCase(t.charAt(j));
                }
    
                System.out.println(temp);
                t = "";
                temp = "";
            }
        }

        if (!t.isEmpty()) {
            System.out.print(Character.toUpperCase(t.charAt(0)) + ". ");
    
            for (int j = 0; j < t.length(); j++) {
                if (j == 0)
                    temp = temp + Character.toUpperCase(t.charAt(0));
                else
                    temp = temp + Character.toLowerCase(t.charAt(j));
            }
    
            System.out.println(temp);
        }
    
        return "";
    }
    
   
}

