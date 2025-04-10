import java.util.*;
public class DemoSet{
    public static void main(String[] args){
        HashSet<String> obj = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        while(true){
            String temp = sc.nextLine();
            if(temp.equals("quit")){
                break;
            }
            obj.add(temp);
        }
        System.out.println(obj);
    }
}