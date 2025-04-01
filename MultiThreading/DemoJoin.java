class MyThread extends Thread{
    long startPoint, endPoint;
    long total = 0;
    public MyThread(long startPoint, long endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public void run(){ 
        for(long i=startPoint;i<endPoint;i++){
            total += i;
        }
        System.out.println("Total in thread = "+total);
    }
}
public class DemoJoin{
    public static void main(String[] args){
        MyThread mt1 = new MyThread(0,100000000);
        mt1.start();
        MyThread mt2 = new MyThread(100000000,200000000);
        mt2.start();
        try{
            mt1.join(); 
            mt2.join();
        }catch(Exception e){}
        System.out.println("Final Total = "+(mt1.total+mt2.total));
    }
}