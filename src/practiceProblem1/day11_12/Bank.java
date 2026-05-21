package practiceProblem1.day11_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to bank");
        BankRecords records=new BankRecords();
        boolean flag=true;
        while (flag) {
            System.out.println("Input 1 for account opening 2 for deposit 3 for withdraw and 4 for mini-statement");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    String customerName=sc.nextLine();
                    System.out.println("Enter Initial Amount you want to deposit");
                    int initialAmount=sc.nextInt();
                    sc.nextLine();
                    records.createAccount(customerName,initialAmount

                    );
                    break;
                case 2:
                    System.out.println("enter your name");
                    String name=sc.nextLine();
                    System.out.println("Enter  Amount you want to deposit");
                    int depositAmount=sc.nextInt();
                    sc.nextLine();
                    records.depositAmount(name, depositAmount);
                    break;
                case 3 :
                    System.out.println("enter your name");
                    String CustomerName=sc.nextLine();
                    System.out.println("Enter  Amount you want to withdraw");
                    int withdrawAmount=sc.nextInt();
                    sc.nextLine();
                    records.withdrawAmount(CustomerName, withdrawAmount);
                    break;
                case 4:
                    System.out.println("enter your name");
                    String CustomerName1=sc.nextLine();
                    records.getBalance(CustomerName1);
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
            System.out.println("if still want to perform some actions type true or else false");
            flag=sc.nextBoolean();
            sc.nextLine();
        }
    }
}
class BankRecords{
    List<BankAccount> list=new ArrayList<>();
    public void createAccount(String name,int deposit){
        list.add(new BankAccount(name, deposit));
        System.out.println(list.get(0));
    }
    public void depositAmount(String name,int amount){
        boolean flag=true;
        for(BankAccount account:list){
            if(account.getAccountHolder().equalsIgnoreCase(name)){
                flag=false;
                System.out.println("Your Pervious Balance "+account.getAccountBalance());
                account.setAccountBalance(amount+account.getAccountBalance());
                System.out.println("Your new Balance "+account.getAccountBalance());
                break;
            }
        }
        if(flag){
            System.out.println("No User Found With That Name");
        }
    }
    public void withdrawAmount(String name,int amount){
        boolean flag=true;
        for(BankAccount account:list){
            if(account.getAccountHolder().equalsIgnoreCase(name)){
                flag=false;
                if(account.getAccountBalance()<amount){
                    System.out.println("Debit amount exceeded account balance.");
                }
                else{
                    System.out.println("Your Pervious Balance "+account.getAccountBalance());
                    account.setAccountBalance(account.getAccountBalance()-amount);
                    System.out.println("Your new Balance "+account.getAccountBalance());
                }
            }
        }
        if(flag){
            System.out.println("No User Found With That Name");
        }
    }
    public void getBalance(String name){
        boolean flag=true;
        for(BankAccount account:list){
            if(account.getAccountHolder().equalsIgnoreCase(name)){
                flag=false;
                System.out.println("Your Account Balance is : "+account.getAccountBalance());
                break;
            }
        }

        if(flag){
            System.out.println("No User Found With That Name");
        }
    }
}
class BankAccount{
    private String accountHolder;
    private int accountBalance;
    public BankAccount(String accountHolder, int accountBalance) {
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    @Override
    public String toString() {
        return "BankAccount [accountHolder=" + accountHolder + ", accountBalance=" + accountBalance + "]";
    }
}






