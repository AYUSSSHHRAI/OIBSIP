
import java.util.Scanner;

public class Railwayreservationsystem {
    public static int availableSeats = 50; // Total number of available seats

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nRailway Reservation System");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Seat Availability");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTicket(scanner);
                    break;
                case 2:
                    checkSeatAvailability();
                    break;
                case 3:
                    System.out.println("Exiting... Thank you for using Railway Reservation System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void bookTicket(Scanner scanner) {
        if (availableSeats > 0) {
            System.out.println("Enter number of tickets to book:");
            int numTickets = scanner.nextInt();

            if (numTickets <= availableSeats) {
                System.out.println(numTickets + " ticket(s) booked successfully.");
                availableSeats -= numTickets;
            } else {
                System.out.println("Insufficient seats available.");
            }
        } else {
            System.out.println("No seats available.");
        }
    }

    public static void checkSeatAvailability() {
        System.out.println("Number of available seats: " + availableSeats);
    }
}