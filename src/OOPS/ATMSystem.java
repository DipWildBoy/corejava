package OOPS;

import java.util.Scanner;

public class ATMSystem {


    private String name;
    private int pin, amount, total_balance, available_balance, account_number;

    public ATMSystem(String name, int pin, int total_balance){
        this.name = name;
        this.pin = pin;
        this.total_balance = total_balance;
    }

    public int balanceInquery(){
        return total_balance;
    }
    public  void withdraw(int amt){
        total_balance = total_balance - amt;

    }
    public void deposit(int amt){
        total_balance = total_balance + amt;
    }
    public static void main(String[] args) {
        ATMSystem a = new ATMSystem("Jyoti Sardar", 1122, 10000);

//        int account_number, pin=1122, balance, available_balance, total_balance;
        int balance;
            Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SWISS Bank");
        System.out.println("Enter your pin: ");
        int enter_pin = sc.nextInt();
        if(enter_pin == a.pin){
            while(true){
                System.out.println("Press 1: Deposit");
                System.out.println("Press 2: Withdraw");
                System.out.println("Press 3: Available Balanec");
                System.out.println("Press 4: Exit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Amount: ");
                        balance = sc.nextInt();
                        a.deposit(balance);
                        System.out.println("Deposit successful.");
                        break;

                    case 2:
                        System.out.println("Amount: ");
                        balance = sc.nextInt();
                        a.withdraw(balance);
                        System.out.println("Take cash");
                        break;

                    case 3:
                        System.out.println(a.balanceInquery());
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }
        }
        else{
            System.out.println("Invalid Pin.");
        }
    }
}


