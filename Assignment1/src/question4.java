import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

class Account {
    String Name;
    double Balance=1000;

    void setBalance(double balance){
        this.Balance=balance;
    }
    void setName(String name){
        this.Name=name;
    }
    public Account(){
        this.Balance=1500;
    }
    double getBalance(){
        return Balance;
    }
    String getName(){
         return Name;
    }
};

class AcccountOverdrawDemo extends Thread{
    private Scanner sc=new Scanner(System.in);
    private Account ac=new Account();

    public void run(){
        double total,amount;

            amount=200;
            total=ac.getBalance()-amount;
            if (total >= 1000){
                withdraw(amount);
                System.out.println("Amount withdrawn "+amount+"\nBalance Left is "+ac.getBalance());
            }else
                System.out.println("Insufficient Balance");
        }
    void withdraw(double amount){
        ac.Balance= ac.Balance-amount;
    }
}
class AccountOverdrawSafeDemo extends Thread{
    private Scanner sc=new Scanner(System.in);
    private Account ac=new Account();

    public void run()  {
        double total,amount;

        amount=300;
        total=ac.getBalance()-amount;
        if (total >= 1000){
            withdraw(amount);
            System.out.println("Amount withdrawn "+amount+"\nBalance Left is "+ac.getBalance());
        }else
            System.out.println("Insufficient Balance");
    }
    synchronized void withdraw(double amount){
        ac.Balance= ac.Balance-amount;
    }
}


public class question4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("1. Account Operation without Thread safe");
        System.out.println("2. Account Operation wit Thread safe");
        int choice = input.nextInt();

        switch (choice){

            case 1:
                    System.out.println("Selected Account Operation without Thread safe");
                    AcccountOverdrawDemo AOD=new AcccountOverdrawDemo();
                    Thread p1=new Thread(AOD);
                    Thread p2=new Thread(AOD);

                    p1.start();
                    p2.start();
                    break;
            case 2 :
                    System.out.println("Selected Account Operation with Thread safe");
                    AccountOverdrawSafeDemo AOSD=new AccountOverdrawSafeDemo();
                    Thread q1=new Thread(AOSD);
                    Thread q2=new Thread(AOSD);

                    q1.start();
                    q2.start();

                    break;
            default:
                    System.out.println("Invalid Choice ");
        }
    }
}

