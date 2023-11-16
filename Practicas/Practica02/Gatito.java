/**
 * Representa la clase Gatito
 * la cual implementa la interaz InterfazGatito
 */
public class Gatito{
    private String nombre;
    private int edad;
    private int energia;
    private boolean vacunado;
    private Juguete juguete;

    /**
     * Completa el metodo constructor
     * con los atributos de nombre y edad
     * @param nombre el nombre del gatito
     * @param edad la edad del gatito
     */
    public Gatito(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.energia = 100;
        this.vacunado = false;
        this.juguete = null;
    }

    /**
     * Agrega los métodos getters y setters 
     * de todos los atributos de la clase Gatito
     * nombre, edad, energia, vacunado y juguete
     */

     //Getters y setters del nombre
    public String getNombre() {
      return this.nombre;
    }

    public void setNombre(String name){
      this.nombre = name;
    }

    //Getters y setters de la edad
    public int getEdad(){
        return this.edad;
    }
  
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


    /**
     * Regresa el juguete del gatito
     * @return el juguete del gatito
     */ 
    public Juguete getJuguete(){
        return juguete;
    }

    /**
     * Cambia el juguete del gatito
     * @param juguete el nuevo juguete del gatito
     */
    public void setJuguete(Juguete juguete){
        this.juguete = juguete;
    }

    /** 
     * Hace que el gatito maulle gastando 10 puntos de energia
     * @return el maullido del gatito
     */
    public String maullar() {
        this.energia = energia - 10;
        return "Miau!";
    }


    /**
     * Hace al gatito jugar con el juguete gastando 20 puntos de energia
     * Ademas desgasta el juguete que tenga con un metodo apropiado para desgastar un juguete
     * @return algun mensaje de que el gatito juega con el juguete
     */
    public String jugar() {
        this.energia = energia - 20;
        this.juguete.desgastar();
        return "El gatito juega con el juguete "+juguete.getNombre();
    }

    /**
     * Hace que el gatito escale gastando 30 puntos de energia
     * @return un mensaje de confirmacion de que el gatito ha escalado
     */
    public String escalar() {
        this.energia = energia - 30;
        return "El gatito ha escalado";
    }

    /**
     * Hace que el gatito descanse recuperando 40 puntos de energia
     * @return un mensaje de confirmacion de que el gatito ha descansado
     */
    public String descansar(){
        this.energia = energia + 40;
        return "El gatito ha descansado";
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
