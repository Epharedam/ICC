public class Pajarito {
    private String nombre;
    private int edad;
    private int energia;
    private String colorcitos;
    private static int nidos = 0;
    private boolean cantando;

    // Constructores
    
    public Pajarito(String nombre, int edad, String colorcitos) {
        this.nombre = nombre;
        this.edad = edad;
        this.energia = 100;
        this.colorcitos = colorcitos;
        this.cantando = true;
        nidos++;
    }

    // 
    public void cantar() {
        System.out.println(nombre + " está cantando una cancion linda.");
    }

    public void volar() {
        cantando = true;
        System.out.println(nombre + " esta volando ");
    }

    public void aterrizar() {
        cantando = false;
        System.out.println(nombre + " ha aterrizado");
    }

    public void cambiarcolorcitos(String nuevoColor) {
        colorcitos = nuevoColor;
        System.out.println(nombre + " ha cambiado su plumaje a " + nuevoColor + ".");
    }

    public void crecer() {
        edad++;
        System.out.println(nombre + " ha cumplido un año .");
    }

    // Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public int getedad() {
        return this.edad;
    }

    public void setEdad(int ed) {
        this.edad = ed;
    }

    public String getcolorcitos() {
        return colorcitos;
    }

    public int getEnergia(){
        return this.energia;
      }


    public void setcolorcitos(String colorcitos) {
        this.colorcitos = colorcitos;
    }

    public boolean setsing(){
        return this.cantando;
      }

    public void setcantando(boolean sing){
        this.cantando = sing;
      }

    public static int getnidos() {
        return nidos;
    }

    // Método toString
    public String toString(){
        return nombre+
        ",\tEdad: "+edad+
        ",\tEnergia: "+energia+
        ",\tCantando: "+cantando+
        ",\tColores: "+colorcitos;
        
    
    }
}
