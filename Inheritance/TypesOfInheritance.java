class Vehicle{
    Vehicle(){
        System.out.println("Default Vehicle Created");
    }
    Vehicle(int a){
        this();
        System.out.println("Parameterized Vehicle Created");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("Default Car Created");
    }
    Car(int a){
        super(a);
        System.out.println("Parameterzied Car Created");
    }
}
public class TypesOfInheritance{
    public static void main(String[] args){
        Car obj = new Car(6);
    }
}