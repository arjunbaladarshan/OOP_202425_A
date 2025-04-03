class ProducerConsumer{
    int current = 5;
    int capacity = 10;
    public synchronized void produce(){
        if(current>capacity-2){
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        current++;
        try{
            notify();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("New Item Produced, current = "+current);
    }
    public synchronized void consume(){
        if(current<2){
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        current--;
        try{
            notify();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("New Item Consumed, current = "+current);
    }
}
class MyProducerThread extends Thread{
    ProducerConsumer pc;
    public MyProducerThread(ProducerConsumer pc){
        this.pc = pc;
    }
    public void run(){
        while(true){
            pc.produce();
            try{
                sleep((int)(Math.random()*1000));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class MyConsumerThread extends Thread{
    ProducerConsumer pc;
    public MyConsumerThread(ProducerConsumer pc){
        this.pc = pc;
    }
    public void run(){
        while(true){
            pc.consume();
            try{
                sleep((int)(Math.random()*1000));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class DemoProducerConsumer{
    public static void main(String[] args){
        ProducerConsumer pc = new ProducerConsumer();
        MyProducerThread mpt = new MyProducerThread(pc);
        MyConsumerThread mct = new MyConsumerThread(pc);

        mpt.start();
        mct.start();
    }
}