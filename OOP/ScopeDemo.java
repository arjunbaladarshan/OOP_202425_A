class Abc{
    String name = "arjun";
    public void printName(String name){
        this.name = "bala";
        System.out.println("Name in the function = "+this.name);
    }
    public void something(){
        System.out.println("Name in the something = "+name);
    }
}
public class ScopeDemo{
    public static void main(String[] args){
        Abc a = new Abc();
        a.printName("asdf");
        a.something();
        
    }
}