import java.util.Scanner;
interface Vehicle{
    int a=10;
    void turnLeft();
    void turnRight();
    void moveForward();
    void breaking();
}
interface FourWheel extends Vehicle{
    void noOfAirBag();
}
class Car implements FourWheel{ 
    public void turnLeft(){
       
        System.out.println("Car is Turn Left");
    }

    public void noOfAirBag(){

    }

    public void turnRight(){
        System.out.println("Car is Turn Right");
    }

    public void moveForward(){
        System.out.println("Car is Move Forward");
    }

    public void breaking(){
        System.out.println("Car is Stopping");
    }
}
class Bike implements Vehicle{
    public void turnLeft(){
        System.out.println("Bike is Turn Left");
    }

    public void turnRight(){
        System.out.println("Bike is Turn Right");
    }

    public void moveForward(){
        System.out.println("Bike is Move Forward");
    }

    public void breaking(){
        System.out.println("Bike is Stopping");
    }
}
public class DemoAbstractClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Car\n Enter 2 for Bike");
        int temp = sc.nextInt();
        Vehicle obj = null;
        if(temp==1){
            obj = new Car();
        }
        else{
            obj = new Bike();
        }
        obj.moveForward();
        try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
        obj.turnLeft();
        try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
        obj.moveForward();
        try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
        obj.turnRight();
        try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
        obj.moveForward();
        try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
        obj.breaking();
        try{
            Thread.sleep(500);
        }catch(Exception e){
            e.printStackTrace();
        }
        // Vehicle.a = 11;
        System.out.println("Vehicle.a = "+Vehicle.a);
    }
}