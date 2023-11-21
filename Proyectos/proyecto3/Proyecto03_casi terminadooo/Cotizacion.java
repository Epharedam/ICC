class Cotizacion {
    private String id;
    private String animador;
    private int cantidad;
    private double precio;
    private double precioTotal;

    public Cotizacion(String id, String animador, int cantidad, double precio, double precioTotal) {
        this.id = id;
        this.animador = animador;
        this.cantidad = cantidad;
        this.precio = precio;
        this.precioTotal = precioTotal;
    }

    public String getId() {
        return id;
    }

    public String getAnimador() {
        return animador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getprecioTotal() {
        return precioTotal;
    }

    public static void formatoServicios() {
        System.out.format(
                "-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nID \t\tNombre\t\tNum. de animadores\t\tcomisión \t\t\t\tPrecio Total\n");
        System.out.format(
                "-----------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void display() {
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n", id,
                animador, cantidad, precio, precioTotal);
    }
}
