import java.util.Scanner;

class Account{
    int PIN;
    String name;
    long acc_number;
    float balance;

    //constructor
    public Account(String name, long acc_number, int pin) {
        this.name = name;
        this.acc_number = acc_number;
        this.PIN = pin;
    }

    //adding money into the bank - deposit
    public void deposit(int money){
        this.balance = balance+money;
        System.out.println("deposited "+money+", Total balance: "+balance);
    }

    //taking money out of the bank - withdrawal
    public void withdraw(int money){
        if (balance-money >= 0) {
            this.balance = balance - money;
            System.out.println("withdrawal " + money + ", Total balance: " + balance);
        }
        else
            System.out.println("Insufficient balance");
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
    }
}

public class Main {
    public static void main(String[] args) {
        //Enter Name, Acc_number and your PIN inside the parameters

        //creating a customer, lets say mahesh
        Account mahesh = new Account("Mahesh", 123456789L, 1436);

        //mahesh depositing money into the bank
        mahesh.deposit(1000);
        mahesh.deposit(500);

        //mahesh, withdrawal of money
        mahesh.withdraw(500);
        mahesh.withdraw(1000);

        //mahesh, depositing
        mahesh.deposit(1000);

        //if you want to check balance, you should enter your 4-digit PIN
        mahesh.getBalance();
    }
}