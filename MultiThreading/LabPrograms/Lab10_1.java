import java.util.Scanner;
public class Lab10_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of students");
        int n = sc.nextInt();
        try{
            int[] marks = new int[5];
            int total = 0;
            for(int i=0;i<n;i++){
                System.out.println("Enter mark of student "+i);
                marks[i] = sc.nextInt();
                total += marks[i];
            }

            int average = total/n;
            System.out.println("Average marks = "+average);
        }catch(ArithmeticException ae){
            System.err.println("Student count cannot be zero");
        }catch(ArrayIndexOutOfBoundsException aie){
            System.err.println("Student cannot more than 5");
        }
        System.out.println("Byee");
    }
}