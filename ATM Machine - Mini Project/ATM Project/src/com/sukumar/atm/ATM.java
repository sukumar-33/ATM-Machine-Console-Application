package com.sukumar.atm;


import java.util.Scanner;

public class ATM {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("ATM Machine Project By Sukumar");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.print("Enter ATM Number : ");
        int ATM_Number = in.nextInt();
        System.out.print("Enter PIN Number : ");
        int pin_Number = in.nextInt();
        int choice;
        double balance = 20.0;
        if(ATM_Number == 234 && pin_Number == 234){
        do{
            System.out.println("Welcome to Our ATM Machine !!!");
            System.out.println("1.  Check Available balance ");
            System.out.println("2.  Withdraw Amount  ");
            System.out.println("3.  Deposit Amount ");
            System.out.println("4.  View Mini Statement ");
            System.out.println("5.  Exit ");
            System.out.println("Enter your choice : ");
            choice = in.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Available Balance is : $"+balance);
                        break;
                    case 2:
                        System.out.println("How much do you want to Withdraw : ");
                        double withdraw = in.nextDouble();
                        if(balance > withdraw){
                            balance = balance - withdraw;
                            System.out.println("Withdraw Successful");
                            System.out.println("Available Balance is "+balance);
                        }
                        else{
                            System.out.println("Insufficient Balance ");
                        }
                        break;
                    case 3:
                        System.out.println("How much amount do you want to deposit :");
                        double deposit = in.nextDouble();
                        balance += deposit;
                        System.out.println("Successfully deposited ");
                        System.out.println("Your Current Balance is "+balance);
                        break;
                    case 4:
                        System.out.println("Available balance is : "+balance );
                        System.out.println("ATM Number :" +ATM_Number);
                        System.out.println("PIN Number : "+pin_Number);
                        break;
                    case 5:
                        System.out.println("THANK YOU !");
                        break;
                }
                if(choice != 5) {
                    System.out.print("To continue Press 1");
                    System.out.println("To exit Press 2");
                    choice = in.nextInt();
                }

            }while(choice == 1 ) ;
        }
        else {
            System.out.println("Sorry you entered the Wrong ATM or PIN Number :)");
        }




    }
}
