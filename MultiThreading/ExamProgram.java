/*
    WAP in java to print Hello world every 10 seconds and
    print current time after every 25 minutes 
*/
import java.util.Date;
class HelloWorldThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello world from thread");
            try{
                sleep(100);
            }catch(Exception e){}
        }
    }
}

class CurrentTimeThread extends Thread{
    public void run(){
        while(true){
            Date dNow = new Date();
            System.out.println(dNow);
            try{
                sleep(300);
            }catch(Exception e){}
        }
    }
}

public class ExamProgram{
    public static void main(String[] args){
        CurrentTimeThread ctt = new CurrentTimeThread();
        ctt.start();

        HelloWorldThread hwt = new HelloWorldThread();
        hwt.start();
    }
}