class MyThread extends Thread{
    String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        int i=0;
        while(true){
            i++;
            System.out.println("Thread "+name+", i = "+i);
        }
    }
}
public class DemoPriority{
    public static void main(String[] args){
        MyThread mt1 = new MyThread("Lect");
        MyThread mt2 = new MyThread("Call");

        mt1.setPriority(1);
        mt2.setPriority(10);

        mt1.start();
        mt2.start();
    }
}