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

        String str = "Hilda Carbajal";
        printInitials(nombre);

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rombosNumericos'");
    }
    @Override
    public String nombreAbreviado(String nombre) {
        int len = nombre.length();
 
        // to remove any leading or trailing spaces
        nombre = nombre.trim();
 
        // to store extracted words
        String t = "";
        for (int i = 0; i < len; i++) {
            char ch = nombre.charAt(i);
 
            if (ch != ' ') {
                // forma la palabra
                t = t + ch;
            }

                // primera letra del nombre en mayuscula
                System.out.print(Character.toUpperCase(t.charAt(0))
                                 + ". ");
                t = "";
            }
        }
 
        String temp = "";{
 
        for (int j = 0; j < t.length(); j++) {
 
            // primera letrra apellido en mayuscula
            if (j == 0)
                temp = temp + Character.toUpperCase(t.charAt(0));
            // letras en minuscula
            else
                temp = temp + Character.toLowerCase(t.charAt(j));
        }

        System.out.println(temp);
    }
   
}

