import java.util.*;
public class DemoMapBasic{
    public static void main(String[] args){
        HashMap<Integer, String> obj = new HashMap<Integer,String>();

        obj.put(101,"vibhu");
        obj.put(102,"priyanshi");
        obj.put(103,"absent");
        obj.put(104,"jeel");

        for(Integer temp:obj.keySet()){
            System.out.println(obj.get(temp));
        }
    }
}