import java.util.Scanner;

public class Account {

    int balance;
    int previousTransction;
    String customerName;
    String customerId;

    Account(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount!= 0) {
            balance = balance = amount;
            previousTransction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransction > 0) {
            System.out.println("Deposited: " + previousTransction);
        } else if (previousTransction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransction));
        } else {
            System.out.println("No Transaction");
        }
    }

    Void calculateInterest (int years) {
        double interestRate = .0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The Current Intrest rate is " + (100 * interestRate));

        return null;
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("your ID is " + customerId);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate intreset");
        System.out.println("F. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option) {

                case 'A' :
                    System.out.println("================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("================");
                    System.out.println();
                    break;

                case 'B' :
                    System.out.println("Enter an amount to deposit");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("======================");
                    getPreviousTransaction();
                    System.out.println("======================");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("Enter how many years of accrued interest: ");
                    int years = scanner.nextInt();
                    calculateInterest(years);
                    break;

                case 'F':
                    System.out.println("======================");
                    break;

                default:
                    System.out.println("error");
                    break;
            }
        } while (option != 'F');
        System.out.println("Thanks for banking");

    }



}
