class MyThread implements Runnable{
     public void run(){
        while(true){
            System.out.println("Hello world from thread");
            try{
                Thread.sleep(100);
            }catch(Exception e){}
            
        }
    }
}
public class DemoRunnable{
    public static void main(String[] args){
        // Thread t1 = new Thread(new MyThread());
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}