import java.util.Scanner;

class Account{
    int PIN;
    String name;
    long acc_number;
    float balance;

    Scanner sc = new Scanner(System.in);

    /*1-> deposit
      2-> withdraw
      3-> balance enquiry
      (other than these numbers) ->close transaction
     */

    //constructor
    public Account(String name, long acc_number, int pin) {
        this.name = name;
        this.acc_number = acc_number;
        this.PIN = pin;
        System.out.println("1 deposit");
        System.out.println("2 withdraw");
        System.out.println("3 balance enquiry");
        System.out.println("4 close transaction");
    }

    public void transaction(){
        System.out.print("Enter Action: ");
        int input = sc.nextInt();
        if (input==1)
            deposit();
        else if (input==2)
            withdraw();
        else if (input==3)
            getBalance();
        else
            exit();
    }

    //adding money into the bank - deposit
    public void deposit(){
//        this.balance = balance+money;
//        System.out.println("deposited "+money+", Total balance: "+balance);
        System.out.print("Enter Amount to Deposit: ");
        int money = sc.nextInt();
        this.balance = balance+money;
        transaction();
    }

    //taking money out of the bank - withdrawal
    public void withdraw(){
        System.out.print("Enter Amount to Deposit: ");
        int money = sc.nextInt();
        if (balance-money >= 0) {
            this.balance = balance - money;
            System.out.println("withdrawal " + money + ", Total balance: " + balance);
        }
        else
            System.out.println("Insufficient balance");
        transaction();
    }

    //to check balance
    public void getBalance(){
        System.out.print("Enter 4-digit PIN: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (pin == this.PIN)
            System.out.println("Current balance: "+balance);
        else
            System.out.println("Incorrect PIN entered");
        transaction();
    }

    public void exit(){
        System.out.println("Exit");
    }
}

public class Main {
    public static void main(String[] args) {
        //Enter Name, Acc_number and your PIN inside the parameters

        //creating a customer, lets say mahesh
        Account mahesh = new Account("Mahesh", 123456789L, 1436);

        //mahesh depositing money into the bank
//        mahesh.deposit(1000);
//        mahesh.deposit(500);
//
//        //mahesh, withdrawal of money
//        mahesh.withdraw(500);
//        mahesh.withdraw(1000);
//
//        //mahesh, depositing
        mahesh.transaction();

//        //if you want to check balance, you should enter your 4-digit PIN
//        mahesh.getBalance();
    }
}