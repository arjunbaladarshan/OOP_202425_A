class MyThread extends Thread{
    public void run(){
        System.out.println("Hello world from thread");
        
    }
}
public class DemoParallel{
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();
        System.out.println("Hello world from Main Method 1");
        System.out.println("Hello world from Main Method 2");
        System.out.println("Hello world from Main Method 3");
        System.out.println("Hello world from Main Method 4");
        System.out.println("Hello world from Main Method 5");
        System.out.println("Hello world from Main Method 6");
        System.out.println("Hello world from Main Method 7");
        System.out.println("Hello world from Main Method 8");
        System.out.println("Hello world from Main Method 9");
        
    }
}