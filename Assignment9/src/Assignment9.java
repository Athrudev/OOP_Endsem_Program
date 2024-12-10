import java.util.*;

class BankingSystem {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int i;
    int n = 14;
    String name, ac="", aadhaarNumber;
    static int W_LIMIT = 10000;
    static double MIN_INITIAL_DEPOSIT = 500.0;
    private int pin;
    private double balance;

    public void CreateAccount() {
        System.out.println("Enter Your Name:");
        this.name = sc.next();
        
        // Aadhaar card validation
        while (true) {
            System.out.println("Enter your 12-digit Aadhaar card number:");
            this.aadhaarNumber = sc.next();
            if (this.aadhaarNumber.length() == 12 && this.aadhaarNumber.matches("\\d+")) {
                break;
            } else {
                System.out.println("Invalid Aadhaar number. Please enter a 12-digit number.");
            }
        }

        for (i = 0; i <= n; i++) {
            this.ac += rand.nextInt(10);
        }
        
        System.out.println("Enter a Pin(4 Digit)");
        this.pin = sc.nextInt();

        // Initial deposit validation
        while (true) {
            System.out.println("Enter initial deposit amount (minimum Rs. " + MIN_INITIAL_DEPOSIT + "):");
            double initialDeposit = sc.nextDouble();
            if (initialDeposit >= MIN_INITIAL_DEPOSIT) {
                this.balance = initialDeposit;
                System.out.println("Account created successfully with initial deposit of Rs. " + initialDeposit);
                break;
            } else {
                System.out.println("Initial deposit must be at least Rs. " + MIN_INITIAL_DEPOSIT);
            }
        }
    }

    public void DepositMoney() {
        if (verifyPin()) {
            System.out.println("Enter the amount you want to Deposit:");
            this.balance += sc.nextDouble();
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void WithdrawMoney() {
        if (verifyPin()) {
            System.out.println("Enter the amount you want to Withdraw:");
            double num = sc.nextDouble();
            if (num > W_LIMIT) {
                System.out.println("Exceeds the daily limit for Withdrawal");
            } else if (num > this.balance) {
                System.out.println("Insufficient Balance in the Account");
                System.out.println("Your current Balance is: Rs. " + this.balance);
            } else {
                this.balance -= num;
                System.out.println("Withdrawal successful!");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void CheckBalance() {
        if (verifyPin()) {
            System.out.println("Your current balance is: Rs. " + this.balance);
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void DisplayInfo() {
        if (verifyPin()) {
            System.out.println("Account Name: " + this.name);
            System.out.println("Account Number: " + this.ac);
            System.out.println("Aadhaar Number: " + this.aadhaarNumber);
            System.out.println("Current Balance: Rs. " + this.balance);
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    private boolean verifyPin() {
        System.out.println("Enter your PIN:");
        int enteredPin = sc.nextInt();
        return enteredPin == this.pin;
    }
}

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        BankingSystem user = null;

        while (true) {
            System.out.println("\n----------|BANKING SYSTEM|----------");
            System.out.println("1.Create New Account");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw money");
            System.out.println("4. Check the balance");
            System.out.println("5. Display Account information");
            System.out.println("6. Exit");
            System.out.println("\nEnter Your Choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    user = new BankingSystem();
                    user.CreateAccount();
                    break;
                case 2:
                    if (user != null) {
                        user.DepositMoney();
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;
                case 3:
                    if (user != null) {
                        user.WithdrawMoney();
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;
                case 4:
                    if (user != null) {
                        user.CheckBalance();
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;
                case 5:
                    if (user != null) {
                        user.DisplayInfo();
                    } else {
                        System.out.println("Please create an account first.");
                    }
                    break;
                case 6:
                    System.out.println("Exited Successfully...!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}