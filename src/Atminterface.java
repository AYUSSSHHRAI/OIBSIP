import java.util.Scanner;

    public class Atminterface {
        private static double accountBalance = 1000.0; // Initial account balance

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nATM Interface");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        withdrawMoney(scanner);
                        break;
                    case 3:
                        depositMoney(scanner);
                        break;
                    case 4:
                        System.out.println("Exiting... Thank you for using ATM Interface.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        private static void checkBalance() {
            System.out.println("Your account balance is: $" + accountBalance);
        }

        private static void withdrawMoney(Scanner scanner) {
            System.out.print("Enter the amount to withdraw: $");
            double amount = scanner.nextDouble();

            if (amount > 0 && amount <= accountBalance) {
                accountBalance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: $" + accountBalance);
            } else {
                System.out.println("Invalid amount or insufficient funds.");
            }
        }

        private static void depositMoney(Scanner scanner) {
            System.out.print("Enter the amount to deposit: $");
            double amount = scanner.nextDouble();

            if (amount > 0) {
                accountBalance += amount;
                System.out.println("Deposit successful. Updated balance: $" + accountBalance);
            } else {
                System.out.println("Invalid amount.");
            }
        }
    }
