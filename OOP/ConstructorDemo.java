class Laptop{
    String modelName;
    double price;
    int ramSize;
    boolean isTouchScreen;
    
    public Laptop(String modelName, double price, int ramSize, boolean isTouchScreen){
        modelName = modelName;
        price = price;
        ramSize = ramSize;
        isTouchScreen = isTouchScreen;
        System.out.println("Parameterized COnstructor Called");
    }


}

public class ConstructorDemo{
    public static void main(String[] args){
        Laptop lapy1 = new Laptop("HP OMEN",123.321,16,false);
        Laptop lapy2 = new Laptop("ASUS Vivobook",23.21,8,true);
        Laptop lapy3 = new Laptop("ASUS Vivobook",23.21,16,true);

        System.out.println("Lapy1 name = "+lapy1.modelName);
        System.out.println("Lapy2 isTouch = "+lapy2.isTouchScreen);
        System.out.println("Lapy3 price = "+lapy3.price);
    }
}