import java.util.concurrent.*;
class MyThread implements Runnable{
    String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread "+name+" is running, i = "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
        System.out.println("Thread "+name+" completed");
    }
}
public class DemoExecutor{
    public static void main(String[] args){
        Runnable r1 = new MyThread("T1");
        Runnable r2 = new MyThread("T2");
        Runnable r3 = new MyThread("T3");
        Runnable r4 = new MyThread("T4");
        Runnable r5 = new MyThread("T5");
        Runnable r6 = new MyThread("T6");
        Runnable r7 = new MyThread("T7");

        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);
        pool.execute(r7);

        pool.shutdown();
    }
}