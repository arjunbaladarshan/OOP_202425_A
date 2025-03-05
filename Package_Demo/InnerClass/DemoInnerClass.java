public class DemoInnerClass{
    public static void main(String[] args){
        Outer objOuter = new Outer();
        Outer.Inner objInner = objOuter.new Inner(); 
        objInner.printA();
    }
}

class Outer{
    private int a = 15;
    class Inner{
        public void printA(){
            System.out.println(a);
        }
    }
}