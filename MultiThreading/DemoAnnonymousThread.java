import java.util.Date;

public class DemoAnnonymousThread{
    public static void main(String[] args){
        Thread t = new Thread(new Runnable(){
            public void run(){
                while(true){
                    System.out.println(new Date());
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }
}