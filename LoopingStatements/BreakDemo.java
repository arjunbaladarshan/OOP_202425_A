import java.util.Scanner;

public class BreakDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(true){
            System.out.println("Enter Number = ");
            int temp = sc.nextInt();
            if(temp<0){
                break;
            }
            total = total + temp;
        }

        System.out.println("Total = "+total);
    }
}