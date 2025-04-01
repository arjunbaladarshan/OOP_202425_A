public class DemoRunnableAnnonymous{
    public static void main(String[] args){
        // Thread t1 = new Thread(new MyThread());
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                while(true){
                    System.out.println("Hello world from thread");
                    try{
                        Thread.sleep(100);
                    }catch(Exception e){}
                    
                }
            }
        });
        t1.start();
    }
}