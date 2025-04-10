import java.util.Scanner;
public class DemoFirst {
    public static void main(String[] args){
        String[] a = new String[10];
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while(true){
            System.out.println("Enter exit to exit the loop or type name");
            a[index] = new String();
            a[index] = sc.nextLine();
            
            if(a[index].equals("exit")){
                break;
            }
            System.out.println(a[index]);
            index++;
        }
        System.out.println("Thank you");
    }
}
