package OOPS;

import java.util.Scanner;
public class ATM {

	   public static void main(String[] args) {
	        int balance = 10000, withdraw, deposit;
	        Scanner sc = new Scanner(System.in);

	        while(true){
	            System.out.println("----------------------- Welcome to SWIS Bank -----------------------");
	            System.out.println("Press 1: Withdraw Balance");
	            System.out.println("Press 2: Deposit");
	            System.out.println("Press 3: Check Balance");
	            System.out.println("Press 4: Exit");

	            System.out.println("Chosse any optioin to perform: ");
	            int choice = sc.nextInt();
	            switch (choice){
	                case 1:
	                    System.out.println("Enter amount you want to withdraw: ");
	                    withdraw = sc.nextInt();
	                    if (balance >= withdraw){
	                        balance = balance - withdraw;
	                        System.out.println("Please collect your money.");
	                    }
	                    else{
	                        System.out.println("Insufficient Balance.");
	                    }
	                    System.out.println("");
	                    break;

	                case 2:
	                    System.out.println("Enter the amount you want to deposit: ");
	                    deposit = sc.nextInt();
	                    balance = balance + deposit;
	                    System.out.println("Your money has been successifully deposited.");
	                    System.out.println("");
	                    break;

	                case 3:
	                    System.out.println("Balance: "+ balance);
	                    System.out.println("");
	                    break;

	                case 4:
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice.");
	                    System.out.println("");

	            }
	        }
	    }
	}