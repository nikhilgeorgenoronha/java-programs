import java.util.Scanner;

public class BankingSystem {

    static double balance = 1000;

    static void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount Deposited Successfully.");
        System.out.println("Current Balance = ₹" + balance);
    }

    static void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawal Successful.");
            System.out.println("Current Balance = ₹" + balance);
        }
        else {

            System.out.println("Insufficient Balance.");
        }
    }

    static void displayBalance() {

        System.out.println("Current Balance = ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK MENU =====");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance Enquiry");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Deposit Amount: ");
                double depositAmount = sc.nextDouble();
                deposit(depositAmount);
                break;

            case 2:
                System.out.print("Enter Withdrawal Amount: ");
                double withdrawAmount = sc.nextDouble();
                withdraw(withdrawAmount);
                break;

            case 3:
                displayBalance();
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}