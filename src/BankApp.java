import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        BankAccount account = new BankAccount(1001, "Rahul", 1234, 5000.0);
        System.out.println(" Welcome to our Bank Application ");
        System.out.println();

        System.out.print("Enter PIN: ");
        int userPin = sc.nextInt();

        if (account.login(userPin)) {

            while (true) {
                System.out.println("\n MENU ");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Amount");
                System.out.println("3. Withdraw Amount");
                System.out.println("4. Display Account Details");
                System.out.println("5. Exit");
                System.out.println();

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        account.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 4:
                        account.displayAccountDetails();
                        break;

                    case 5:
                        System.out.println("Thank you for using the Bank Application.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice. Please try again.");
                }
            }

        } else {
            System.out.println("Access Denied. Incorrect PIN.");
        }

        sc.close();
    }
}