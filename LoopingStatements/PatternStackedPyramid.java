import java.util.Scanner;

public class PatternStackedPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value = ");
        int n = sc.nextInt();
        for(int i=n-1 ; i>=0 ; i--){
            for(int k=0 ; k<n-1-i ; k++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0 ; i<n ; i++){
            for(int k=0 ; k<n-1-i ; k++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}