import java.util.Scanner;
public class ContinueDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<10 ; i++){
            if(i!=n){
                System.out.println("i = "+i);
            }
        }
    }
}