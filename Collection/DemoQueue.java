import java.util.*;
public class DemoQueue{
    public static void main(String[] args){
        Queue<String> obj = new LinkedList<String>();

        obj.add("arjun");
        obj.add("bala");
        obj.add("zibra");
        obj.add("darshan");

        while(!obj.isEmpty()){
            System.out.println(obj.poll());
            System.out.println(obj);
        }
    }
}