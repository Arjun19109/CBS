import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000];
        String[] accountName = new String[1000];
        int option, size = 0; 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Welcome to the Bank ");
        while (infiniteLoop) { 

            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            if (option == 1) {
                System.out.println("\n add customer menu "); 

                System.out.println("Enter your name: ");
                accountName[size] = scanner.nextLine();
                System.out.println("Enter your initial balance: ");
                accountBalance[size] = scanner.nextDouble();
                scanner.nextLine(); 
                size++;
                System.out.println("Account created successfully!");
                System.out.println("Your account number is: " + (size - 1));
                System.out.println("Your account balance is: " + accountBalance[size - 1]);
                System.out.println("Your account name is: " + accountName[size - 1]);
                System.out.println("Press enter to continue...");
                scanner.nextLine();
            } else if (option == 2) {
                System.out.println("\n deposit menu ");
                System.out.println("Enter your account number: ");
                int accountNumber = scanner.nextInt();
                scanner.nextLine(); 
                if (accountNumber >= 0 && accountNumber < size) { 
                    System.out.println("Enter the amount to deposit: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    accountBalance[accountNumber] += amount; 
                    System.out.println("Deposit successful!");
                    System.out.println("Your new balance is: " + accountBalance[accountNumber]);
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                } else {
                    System.out.println("Invalid account number.");
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                }

            } else if (option == 3) {
                System.out.println("\n withdraw menu ");
                System.out.println("Enter your account number: ");
                int accountNumber = scanner.nextInt();
                scanner.nextLine(); 
                if (accountNumber >= 0 && accountNumber < size) { 
                    System.out.println("Enter the amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    if (amount <= accountBalance[accountNumber]) {
                        accountBalance[accountNumber] -= amount; 
                        System.out.println("Withdraw successful!");
                        System.out.println("Your new balance is: " + accountBalance[accountNumber]);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                } else {
                    System.out.println("Invalid account number.");
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                }

}