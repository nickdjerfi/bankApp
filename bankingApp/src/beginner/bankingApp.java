package beginner;

import java.util.Scanner;

public class bankingApp {
    public static void main(String[] args) {


    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) //constructor
    {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount != 0);{
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: "+previousTransaction);
        } else if(previousTransaction < 0){
            System.out.println("Withdrawn: "+Math.abs(previousTransaction)); //+Math.abs for changing - to + (can't withdraw a -)
        }else {
            System.out.println("No transaction occurred.");
        }
    }

    void showMenu(){

    }
}