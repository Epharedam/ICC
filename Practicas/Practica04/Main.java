public class Main implements AnalizadorCadenas {
    
    public static void main(String[] args) {
        Main mainInstance = new Main();
        String ejemplo = "ciencias";
        char primeraVocal = mainInstance.encuentraVocal(ejemplo);
        System.out.println("Primera vocal en '" + ejemplo + "' es: " + primeraVocal);
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cuadrado'");
    }
    @Override
    public void rombosNumericos(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rombosNumericos'");
    }
    @Override
    public String nombreAbreviado(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nombreAbreviado'");
    }

    
}
