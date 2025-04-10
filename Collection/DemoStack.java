import java.util.*;
public class DemoStack{
    public static void main(String[] args){
        Stack<String> obj = new Stack<String>();

        obj.push("arjun");
        obj.push("bala");
        obj.push("zibra");
        obj.push("darshan");

        while(!obj.empty()){
            System.out.println(obj.pop());
            System.out.println(obj);
        }
        
    }
}