// interface Shape with the getArea() method
interface Shape{
    void getArea();
}

class Rectangle implements Shape
{
    public void getArea(){
        System.out.println("Get Area of rect called");
    }
}

class Circle implements Shape
{
    public void getArea(){
        System.out.println("Get Area of circle called");
    }
}

class Triangle implements Shape
{
    public void getArea(){
        System.out.println("Get Area of triangle called");
    }
}

public class Lab9_5{
    public static void main(String[] args){

    }
}