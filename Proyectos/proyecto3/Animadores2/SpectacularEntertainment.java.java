import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Entertainer {
    private String role;
    private int amount;
    private double payPerHour;

    public Entertainer(String role, int amount, double payPerHour) {
        this.role = role;
        this.amount = amount;
        this.payPerHour = payPerHour;
    }

    public String getRole() {
        return role;
    }

    public int getAmount() {
        return amount;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public void display() {
        System.out.printf("%-15s %-8d $%-5.2f%n", role, amount, payPerHour);
    }
}

class Catalog {
    private List<Entertainer> entertainers;

    public Catalog() {
        this.entertainers = new ArrayList<>();
    }

    public void addEntertainer(Entertainer entertainer) {
        entertainers.add(entertainer);
    }

    public void deleteEntertainer(String role) {
        entertainers.removeIf(e -> e.getRole().equalsIgnoreCase(role));
    }

    public void editEntertainer(String role, double newPayPerHour) {
        for (Entertainer e : entertainers) {
            if (e.getRole().equalsIgnoreCase(role)) {
                e.setPayPerHour(newPayPerHour);
            }
        }
    }

    public void displayCatalog() {
        System.out.println("Catalog:");
        for (Entertainer e : entertainers) {
            e.display();
        }
        System.out.println();
    }

    public List<Entertainer> getEntertainers() {
        return entertainers;
    }
}

class Event {
    private int eventDuration;
    private Map<String, Integer> requiredEntertainers;

    public Event(int eventDuration) {
        this.eventDuration = eventDuration;
        this.requiredEntertainers = new HashMap<>();
    }

    public int getEventDuration() {
        return eventDuration;
    }

    public Map<String, Integer> getRequiredEntertainers() {
        return requiredEntertainers;
    }

    public void display() {
        System.out.println("Event:");
        System.out.println("Duration: " + eventDuration + " hours");
        System.out.println("Required Entertainers:");
        for (Map.Entry<String, Integer> entry : requiredEntertainers.entrySet()) {
            System.out.printf("%-15s %-8d%n", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }
}

class Reservation {
    private Event event;
    private double commissionPercentage;

    public Reservation(Event event, double commissionPercentage) {
        this.event = event;
        this.commissionPercentage = commissionPercentage;
    }

    public double calculatePayment(Catalog catalog) {
        double totalPayment = 0;
        for (Map.Entry<String, Integer> entry : event.getRequiredEntertainers().entrySet()) {
            String role = entry.getKey();
            int amount = entry.getValue();
            for (Entertainer e : catalog.getEntertainers()) {
                if (e.getRole().equalsIgnoreCase(role)) {
                    totalPayment += e.getPayPerHour() * amount * event.getEventDuration();
                }
            }
        }
        return totalPayment * (1 + commissionPercentage / 100);
    }
}

