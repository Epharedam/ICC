/**
 * Representa la clase Perrito
 */
public class Perrito{
    private String nombre;
    private int edad;
    private int energia;
    private boolean vacunado;
    private Juguete juguete;

    /**
     * Completa el metodo constructor
     * con los atributos nombre y edad
     * @param nombre el nombre del perrito
     * @param edad la edad del perrito
     */
    public Perrito(String nombre, int edad){
        //Se añaden los parámetros a los atributos objeto
        this.nombre = nombre;
        this.edad = edad;

        this.energia = 100;
        this.vacunado = false;
        this.juguete = null;
    }

    /**
     * Agrega los metodos getters y setters 
     * de todos los atributos de la clase Perrito
     * nombre, edad, energia, vacunado y juguete
     */

    //Getters y setters del nombre
    public String getNombre() {
      return this.nombre;
    }

    public void setNombre(String name){
      this.nombre = name;
    }

     /**
      * Regresa la edad del perrito
      * @return la edad del perrito
      */
    public int getEdad(){
        return this.edad;
    }
    
    /**
     * Cambia la edad del perrito
     * @param edad la nueva edad del perrito
     */
    public void setEdad(int ed){
        this.edad = ed;
    }

    //Getters y setters de energia
    public int getEnergia(){
      return this.energia;
    }

    public void setEnergia(int energy){
      this.energia = energy;
    }

    //Getters y setters de vacunado
    public boolean getVacunado(){
      return this.vacunado;
    }

    public void setVacunado(boolean vacc){
      this.vacunado = vacc;
    }

    //Getters y setters de juguete
    public Juguete getJuguete(){
      return this.juguete;
    }

    public void setJuguete(Juguete toy){
      this.juguete = toy;
    }

    /** Hace que el perrito ladre gastando 10 puntos de energia
     * @return el ladrido del perrito
     */
    public String ladrar() {
        this.energia = energia - 10;
        return "Guau!";
    }

    /**
     * Hace al perrito jugar con el juguete gastando 30 puntos de energia
     * Ademas desgasta el juguete que tenga con el metodo apropiado para desgastar juguete
     * @return algun mensaje de que el perrito juega con el juguete
     */
    public String jugar() {
      this.energia = energia - 30;
      this.juguete.desgastar();
      return "El perrito está jugando con el juguete "+juguete.getNombre();
    }

    /**
     * Hace que el perrito salte gastando 40 puntos de energia
     * @return mensaje del gasto de eneria
     */
    public String saltar() {
      this.energia = energia - 40;
      return "Se gastaron 40 puntos de energia";
    }
    
    /**
     * Hace que el perrito corra por un rato gastando 60 puntos energia
     * @return un mensaje de confirmacion de que el perrito ha corrido
     */
    public String correr(){
        this.energia = energia - 60;
        return "El perro ha corrido";
    }

    /**
     * Hace que el perrito descanse recuperando 30 puntos de energia
     * @return un mensaje de confirmacion de que el perrito ha descansado
     */
    public String descansar(){
      this.energia = energia + 30;
      return "El perrito ha descansado";
    }
    
    /**
     * Representacion en cadena de la clase Perrito
     */
    public String toString(){
        return nombre+
        ",\tEdad: "+edad+
        ",\tEnergia: "+energia+
        ",\tVacunado: "+vacunado+
        ",\tJuguete: "+juguete;
    }
}
