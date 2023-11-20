import java.util.Scanner;
public class EntretenimientoEspectacular{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalog catalog = new Catalog();

        // Example: Adding initial entertainers to the catalog
        catalog.addEntertainer(new Entertainer("Juggler", 5, 800));
        catalog.addEntertainer(new Entertainer("Saxophonist", 1, 2000));

        // Example: Displaying the initial catalog
        catalog.displayCatalog();

        // Example: Adding a new entertainer to the catalog
        System.out.print("Enter the role of the new entertainer: ");
        String newRole = scanner.next();
        System.out.print("Enter the hourly payment for the new entertainer: ");
        double newPayment = scanner.nextDouble();
        catalog.addEntertainer(new Entertainer(newRole, 1, newPayment));

        // Example: Displaying the updated catalog
        catalog.displayCatalog();

        // Example: Creating an event
        Event event = new Event(3);
        event.getRequiredEntertainers().put("Juggler", 2);

        // Example: Creating a reservation
        Reservation reservation = new Reservation(event, 10); // 10% commission

        // Example: Calculating payment for the reservation
        double payment = reservation.calculatePayment(catalog);
        System.out.println("Total payment for the reservation: $" + payment);
    }
}
