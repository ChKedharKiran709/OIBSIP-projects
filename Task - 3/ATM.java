import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        while (true) {
            System.out.println("Welcome to the ATM.");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your balance is $%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if (amount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= amount;
                        System.out.printf("Withdrawal successful. Your new balance is $%.2f%n", balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    balance += amount;
                    System.out.printf("Deposit successful. Your new balance is $%.2f%n", balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}

