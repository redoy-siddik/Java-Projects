import java.util.*;

public class Banking_program {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0.0;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("Welcome to the Banking Program!");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the Banking Program!");
        sc.close();
    }
    static void showBalance(double balance) {
        System.out.printf("Your balance is: %.2f$\n", balance);
    }
    static double deposit() {
        double amount;
        System.out.print("Enter the amount to deposit: ");
        amount = sc.nextDouble();
        if(amount < 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return deposit();
        }
        return amount;
    }
    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter the amount to withdraw: ");
        amount = sc.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient funds.");
            return withdraw(balance);
        }
        else if(amount < 0){
            System.out.println("Invalid amount.");
            return withdraw(balance);
        }
        return amount;

    }
}
