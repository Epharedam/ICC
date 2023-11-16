/**
 * Representa la clase Juguete para que lo usen
 * como un juguete tanto para perritos y gatitos
 */
public class Juguete {
    private static int cantidad;
    private int precio;
    private String nombre;
    private int desgaste;

    public Juguete(String nombre, int precio){
        this.precio = precio;
        this.nombre = nombre;
        this.desgaste = 100;
        this.cantidad = this.cantidad + 1;
    }

    /**
     * Agrega los metodos getters y setters 
     * de todos los atributos de la clase Juguete
     * cantidad, precio, nombre y desgaste
     */

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        Juguete.cantidad = cantidad;
    }

    //getters y setters del nombre
    public String getNombre(){
      return this.nombre;
    }

    public void setNombre(String name){
      this.nombre = name;
    }

    //Getter y setters del desgaste
    public int getDesgaste() {
      return this.desgaste;
    }

    public void setDesgaste(int desg) {
      this.desgaste = desg;
    }

    /**
     * Obtiene el precio del juguete
     * @return el precio del juguete 
     */
    public int getPrecio(){
        return precio;
    }

    /**
     * Cambia el precio del juguete
     * @param precio el nuevo precio del juguete
     */
    public void setPrecio(int precio){
        this.precio=precio;
    }

    /**
     * Desgasta el juguete con 35 puntos
     */
    public void desgastar(){
        this.desgaste = desgaste - 35;
    }

    /**
     * Repara el juguete en 15 puntos
     */
    public void reparar(){
        this.desgaste = desgaste + 15;
    }

    /**
     * Representacion en cadena de la clase Juguete 
     */
    public String toString(){
        return ""+nombre+
               "\n\t\t\t\t\t\t\t\t\tPrecio: "+precio+
               "\n\t\t\t\t\t\t\t\t\tDesgaste: "+desgaste+
               "\n\t\t\t\t\t\t\t\t\tCantidad total de juguetes hechos: "+cantidad+"\n";
    }

}
