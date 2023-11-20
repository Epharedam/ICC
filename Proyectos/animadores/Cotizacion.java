import java.util.Scanner;

class Product {
    private String id;
    private String animador;
    private int cantidad;
    private double precio;
    private double precioTotal;

    Product(String id, String animador, int cantidad, double precio, double precioTotal) {
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

    public double getTotalPrice() {
        return precioTotal;
    }

    public static void formatoServicios() {
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Precio\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void display() {
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n", id, animador, cantidad, precio, precioTotal);
    }
}
public class Cotizacion {
    public static void main(String[] args) {
        String id, productName;
        int quantity;
        double precio, precioTotal, overAllPrice = 0.0, cgst, sgst, subtotal = 0.0, comision = 0.0;
        char choice = '\0';
        final int MAX_PRODUCTS = 10; // Set the maximum number of products

        System.out.println("\t\t\t\t--------------------Factura-----------------");
        System.out.println("\t\t\t\t\t " + "  " + "Metro Mart Grocery Shop");
        System.out.println("\t\t\t\t\t3/98 Mecrobertganj New Mumbai");
        System.out.println("\t\t\t\t\t" + "    " + "Opposite Metro Walk");
        System.out.println("Gracias por usar nuestros servicios" + "\t\t\t\t\t\t\t");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");

        Product[] products = new Product[MAX_PRODUCTS];
        int productCount = 0;

        do {
            System.out.println("Enter the product details: ");
            System.out.print("Product ID: ");
            id = scan.nextLine();
            System.out.print("Product Name: ");
            productName = scan.nextLine();
            System.out.print("Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Precio (per unit): ");
            precio = scan.nextDouble();

            precioTotal = precio * quantity;
            overAllPrice += precioTotal;

            products[productCount++] = new Product(id, productName, quantity, precio, precioTotal);

            System.out.print("Want to add more items? (y or n): ");
            choice = scan.next().charAt(0);
            scan.nextLine(); // consume remaining characters

        } while ((choice == 'y' || choice == 'Y') && productCount < MAX_PRODUCTS);

        Product.formatoServicios();
        for (int i = 0; i < productCount; i++) {
            products[i].display();
        }

        System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overAllPrice);

        comision = overAllPrice * 2 / 100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Comision (Rs.) " + comision);

        subtotal = overAllPrice - comision;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal " + subtotal);

        sgst = overAllPrice * 12 / 100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) " + sgst);

        cgst = overAllPrice * 12 / 100;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) " + cgst);

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + (subtotal + cgst + sgst));
        System.out.println("\t\t\t\t----------------Gracias por contratar a Evento espectacular -----------------");
    

        scan.close();
    }
}