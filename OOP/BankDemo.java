import java.util.Scanner;
class BankAccount{
    int accountNo;
    String accountHolderName;
    private int balance;

    void setData(int accNo, String ahn, int bal){
        accountNo = accNo;
        accountHolderName = ahn;
        balance = bal;
    }

    void setBalance(int bal){
        if(bal<5000){
            System.out.println("Insufficient Balance, Your transation failed");
        }
        else{
            balance = bal;
        }
        
    }

    int getBalance(){
        return balance;
    }

}
public class BankDemo{
    public static void main(String[] args){
        BankAccount acc = new BankAccount();
        acc.setData(1234,"arjun",12);

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Select Operation\n Enter 1 for deposite \n Enter 2 for withdraw \n Enter 3 to check balance \n Enter 4 to Exit");
            int op = sc.nextInt();
            if(op==1){
                System.out.println("Enter Amount to deposite");
                int amount = sc.nextInt();
                acc.setBalance(acc.getBalance() + amount);
            }
            else if(op==2){
                System.out.println("Enter Amount to withdraw");
                int amount = sc.nextInt();
                acc.setBalance(acc.getBalance() - amount);
            }
            else if(op==3){
                System.out.println("Your account balance = "+acc.getBalance());
            }
            else{
                break;
            }
        }

    }
}