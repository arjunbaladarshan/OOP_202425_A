class BankAccount{
    int balance;
    int accountNo;
    String name;

    public BankAccount(int balance, int accountNo, String name){
        this.balance = balance;
        this.accountNo = accountNo;
        this.name = name;
    }

    public void setPrefixMutable(String prefix){
        this.name = prefix + this.name;
    }

    public String setPrefixImmutable(String prefix){
        return prefix + this.name;
    }
    
}

public class BankingDemo{
    public static void main(String[] args){
        BankAccount ba1 = new BankAccount(15000,101,"Arjun Bala");
        BankAccount ba2 = new BankAccount(15000,102,"Darshan Uni");
       

        ba2.name = ba2.setPrefixImmutable("Dr. ");

        System.out.println(ba2.name);
        
    }
}