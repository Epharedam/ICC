/**
 * Representa una clase Persona
 * Tiene multiples metodos constructores asi como los
 * getters y setters
 */
public class Persona {
    private String nombre;
    private int edad;
    private int ajolopesos;
    private Perrito perrito;
    private Gatito gatito;

    /**
     * Completa los metodos constructores de acuerdo a lo pedido
     */


    /**
     * @param nombre el nombre de la persona
     * @param edad la edad de la persona
     * @param ajolopesos la cantidad de ajolopesos de la persona.
     */
    public Persona(String nombre, int edad, int ajolopesos){
        this.nombre = nombre;
        this.edad = edad;
        this.ajolopesos = ajolopesos;
    }

    /**
     * Completa el metodo constructor donde solo reciba un perrito
     * pero no un gatito
     * @param nombre el nombre de la persona
     * @param edad la edad de la persona
     * @param ajolopesos la cantidad de ajolopesos de la persona.
     * @param perrito el perrito de la persona
     */
    public Persona(String nombre, int edad, int ajolopesos, 
                   Perrito perrito){
        this.nombre = nombre;
        this.edad = edad;
        this.ajolopesos = ajolopesos;
        this.perrito = perrito;
    }

    /**
     * Completa el metodo constructor donde solo reciba un gatito
     * pero no un perrito
     * @param nombre el nombre de la persona
     * @param edad la edad de la persona
     * @param ajolopesos la cantidad de ajolopesos de la persona.
     * @param gatito el gatito de la persona
     */
    public Persona(String nombre, int edad, int ajolopesos, 
                   Gatito gatito){
        this.nombre = nombre;
        this.edad = edad;
        this.ajolopesos = ajolopesos;
        this.gatito = gatito;
    }

    /**
     * @param nombre el nombre de la persona
     * @param edad la edad de la persona
     * @param ajolopesos la cantidad de ajolopesos de la persona. 
     * @param perrito el perrito de la persona
     * @param gatito el gatito de la person
     */
    public Persona(String nombre, int edad, int ajolopesos,
                   Perrito perrito, Gatito gatito){
        this.nombre = nombre;
        this.edad = edad;
        this.ajolopesos = ajolopesos;
        this.perrito = perrito;
        this.gatito = gatito;
    }


    /**
     * Agrega los metodos getters y setters 
     * de todos los atributos de la clase Persona
     * nombre, edad, dinero, perrito y gatito
     */

    /**
     * Regresa el nombre de la persona
     * @return el nombre de la persona
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Cambia el nombre de la persona
     * @param nombre el nuevo nombre de la persona
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Getters y setters de Edad
    public int getEdad(){
      return this.edad;
    }
    
    public void setEdad(int age){
      this.edad = age;
    }

    //Getters y setters de los ajolopesos
    public int getDinero(){
      return this.ajolopesos;
    }
    
    public void setDinero(int ajolo){
      this.ajolopesos = ajolo;
    }

    //Getters y setters de perrito
    public Perrito getPerrito(){
      return this.perrito;
    }
    
    public void setPerrito(Perrito dog){
      this.perrito = dog;
    }

    //Getters y setters de gatito
    public Gatito getGatito() {
      return this.gatito;
    }

    public void setGatito(Gatito cat) {
      this.gatito = cat;
    }

    /**
     * Recibe un perrito para adoptarlo
     * @param perrillo el perrito a adoptar
     * @return un mensaje de confirmacion de la adopcion del perrito
     */
    public String adoptarPerrito(Perrito perrillo){
        this.perrito = perrillo;
        return "Perrito adoptado!";
    }


    /**
     * Recibe un gatito para adoptarlo
     * @param gatillo el gatito a adoptar
     * @return un mensaje de confirmacion de la adopcion del gatito
     */
    public String adoptarGatito(Gatito gatillo){
        this.gatito = gatillo;
        return "Gatito adoptado!";
    }

    /**
     * Pone a la persona a trabajar y gana 30 ajolopesos
     * @return un mensaje de confirmacion de la chamba
     */
    public String chambear(){
        ajolopesos = ajolopesos + 30;
        return "Si se sabe la de chambear";
    }

    /**
     * La persona se pone a gastar y le resta 50 ajolopesos
     * @return un mensaje de confirmacion de lo gastado
     */
    public String gastar(){
        ajolopesos = ajolopesos - 50;
        return "Se gastaron 50 pesos";
    }

    /**
     * Compra un juguete para el perrito y lo agrega a su atributo
     * @param juguete el nuevo juguete del perrito
     * No olvides restar el precio del juguete a los ajolopesos de la persona
     * Utiliza juguete.getPrecio() para saber la cantidad a restar
     * Y setJuguete() para cambiar el juguete del perrito
     * @return un mensaje de confirmacion de la compra
     */

    public String comprarJuguetePerrito(Juguete juguete){
        ajolopesos = ajolopesos - juguete.getPrecio();
        perrito.setJuguete(juguete);
        return "Se compró el juguete "+perrito.getJuguete().getNombre()+" al perrito "+perrito.getNombre();
    }

    /**
     * Compra un juguete para el gatito y lo agrega a su atributo
     * @param juguete el nuevo juguete del gatito
     * No olvides restar el precio del juguete a los ajolopesos de la persona
     * Utiliza juguete.getPrecio() para saber la cantidad a restar
     * Y setJuguete() para cambiar el juguete del gatito
     * @return un mensaje de confirmacion de la compra
     */
    public String comprarJugueteGatito(Juguete juguete){
        ajolopesos = ajolopesos - juguete.getPrecio();
        gatito.setJuguete(juguete);
        return "Se compró el juguete "+gatito.getJuguete().getNombre()+" al gatito "+gatito.getNombre();
    }

    /**
     * Repara el juguete del perrito
     * @return un mensaje de confirmacion de la reparacion del juguete
     */
    public String repararJuguetePerrito(){
        perrito.getJuguete().reparar();
        return "Se reparó el juguete "+perrito.getJuguete().getNombre()+ " del perrito "+perrito.getNombre();
        //Pista: obten el juguete del perrito con get y usa el metodo reparar
    }

    /**
     * Repara el juguete del gatito
     * @return un mensaje de confirmacion de la reparacion del juguete
     */
    public String repararJugueteGatito(){
        gatito.getJuguete().reparar();
        return "Se reparó el juguete "+gatito.getJuguete().getNombre()+ " del gatito "+gatito.getNombre();

    }

    /**
     * Vacuna al perrito
     * Cambia el atributo de vacunado del perrito con setVacunado(true)
     * El precio de la vacuna es de 75 ajolopesos
     * No olvides restar el precio de la vacuna a los ajolopesos
     * @return un mensaje de confirmacion de la vacuna del perrito
     */
    public String vacunarPerrito(){
        perrito.setVacunado(true);
        ajolopesos = ajolopesos - 75;
        return "Se vacunó al perrito"+perrito.getNombre();
    }

    /**
     * Vacuna al gatito
     * Cambia el atributo de vacunado del gatito con setVacunado(true)
     * El precio de la vacuna es de 75 ajolopesos
     * No olvides restar el precio de la vacuna a los ajolopesos
     * @return un mensaje de confirmacion de la vacuna del gatito
     */
    public String vacunarGatito(){
        gatito.setVacunado(true);
        ajolopesos = ajolopesos - 75;
        return "Se vacunó al gatito"+gatito.getNombre();
    }

    
    /**
     * Representacion en cadena de la clase Persona
     */
    public String toString(){
        return "Nombre: "+nombre+
                "\nEdad: "+edad+
                "\nAjolopesos: "+ajolopesos+
                "\nPerrito: "+perrito+
                "\n\nGatito: "+gatito;
    }
    
}
