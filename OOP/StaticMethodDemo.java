class Abc{
    static String name = "darshan";

    public static void printName()
    {
        System.out.println("Name = "+name);
    }
}
public class StaticMethodDemo{
    public static void main(String[] args)
    {
        System.out.println("1");
    }

    static{
        System.out.println("2");
    }
    
    static{
        System.out.println("3");
    }
}