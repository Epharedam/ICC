/**
 * Interfaz que define los metodos de
 * un analizador de cadenas.
 */
public interface AnalizadorCadenas{

    /**
     * Metodo que regresa la primera vocal de una palabra.
     * @param palabra la cadena donde buscar la primer vocal.
     * @return regresa la primera vocal encontrada en mayusculas
     */
    public char encuentraVocal(String palabra);
    
    /**
     * Metodo que realiza la figura de dos triángulos que forman a un cuadrado de asteriscos y cruces
     * @param nivel el entero que corresponde al numero de niveles comenzando desde el nivel cero
     */
    public void cuadrado(int nivel);

    /**
     * Metodo que realiza la estructura de rombos numéricos
     * @param n el entero que corresponde al número con el que va ascendiendo y descendiendo del rombo
     * por ejemplo si el numero es 3 , entonces se dibuja desde el primer nivel el número 1
     * en el segundo nivel la línea sería 212 y en el tercero 32123
     *       1                                      
            212                                                
           32123
            212 
             1
     */
    public void rombosNumericos(int n);

    /**
     * Metodo que recibe como entrada  el nombre completo de una persona 
     * y muestra las abreviaturas en mayúsculas del primer y segundo nombre (en caso de que tenga),
     * los apeliidos comenzarán con mayúscula y solo se concatenaran con el nombre abreviado. 
     * @param nombre el nombre completo de una persona
     * @return el nombre(s) abreviado concatenado con los apellidos (sin abreviar)
     */
    public String nombreAbreviado(String nombre);
}