
import java.util.Scanner;
class bankaccount{
    private int pin;
    private double balance;
    public bankaccount(int pin,double balance){
        this.pin=pin;
        this.balance=balance;
    }
    public boolean verifypin(int enteredpin){
        return pin==balance;
    }
    public void checkbalance(){
        System.out.println("Balance:"+balance);
    }
    public void deposite(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("insufficant amount");
        }
        else{
            balance-=amount;
        }
    }


}

public class main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        bankaccount user=new bankaccount(1234, 100000);
        System.out.println("enter pin:");
        int enteredpin=sc.nextInt();
        int choice;
        do { 
            System.err.println("\n===ATM VIEW===");
            System.out.println("1.checkbalance");
            System.out.println("2.deposite");
            System.out.println("3.withdraw");
            System.out.println("4.exit");
            System.out.println("enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    user.checkbalance();
                    break;
                    default:
                case 2:
                System.out.println(" enter amount to deposite");
                    double amount=sc.nextDouble();
                    user.deposite(amount);
                    System.out.println("amount deposite successfully!");
                    break;
                case 3:
                System.out.println("enter withdram amount");
                    double withdrawAmount=sc.nextDouble();
                    user.withdraw(withdrawAmount);
                    System.out.println("amount succfully withdraw ");
                    break;
                    case 4:
                    System.out.println("thank you for using our service");
                    break;
                    
            }
        } while (choice!=5);
        sc.close();
    }

}