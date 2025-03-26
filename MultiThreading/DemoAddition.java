import java.util.Date;

class AddTillMinMaxThread extends Thread
{
    long startNo,endNo;
    public AddTillMinMaxThread(long startNo, long endNo){
        this.startNo = startNo;
        this.endNo = endNo;
    }
    public void run(){
        long ans = 0;
        Date dStart = new Date();
        for(long i =startNo;i<endNo;i++){
            ans +=i;
        }
        Date dEnd = new Date();
        long diffTime = dEnd.getTime() - dStart.getTime();
        System.out.println("Total ans = "+ans +" in "+diffTime+" ms");
    }

}
public class DemoAddition{
    public static void main(String[] args){
        AddTillMinMaxThread t1 = new AddTillMinMaxThread(0,5000000000l);
        AddTillMinMaxThread t2 = new AddTillMinMaxThread(5000000001l,10000000000l);
        AddTillMinMaxThread t3 = new AddTillMinMaxThread(10000000001l,15000000000l);
        AddTillMinMaxThread t4 = new AddTillMinMaxThread(15000000001l,20000000000l);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}