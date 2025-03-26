import java.util.Scanner;
class SmartPhone{
    public void setAlarm(){
        System.out.println("Goto Clock App");
        System.out.println("Goto Alarm");
        System.out.println("Set Time");
        System.out.println("Set Repeat Mode");
        System.out.println("Save");
    }
}
class SamsungS23 extends SmartPhone{
    
}
class IPhone extends SmartPhone{
    public void setAlarm(){
       System.out.println("Tell Siri to set Alarm"); 
    }
}
class VivoV16 extends SmartPhone{

}
public class DemoOverride{
    public static void main(String[] args){
        SmartPhone obj = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please\n Enter 1 for SamsungS23\n Enter 2 for IPhone\n Enter 3 for Vivo");
        int op = sc.nextInt();
        if(op==1){
            obj = new SamsungS23();
        }
        else if(op==2){
            obj = new IPhone();
        }
        else if(op==3){
            obj = new VivoV16();
        }

        if(obj instanceof IPhone){
            System.out.println("Its an Iphone instance");
        }

        obj.setAlarm();
    }
}