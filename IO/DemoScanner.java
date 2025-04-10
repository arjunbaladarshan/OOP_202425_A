
import java.io.File;
import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("StudentData.csv"));
            String temp = sc.nextLine();
            System.out.println(temp);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
