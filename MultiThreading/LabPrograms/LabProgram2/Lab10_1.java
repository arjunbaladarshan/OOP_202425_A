import java.util.Scanner;
public class Lab10_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = sc.nextInt();

        int[] marks = new int[5];

        int total = 0;
        try{
            for(int i=0;i<n;i++){
                System.out.println("Enter marks of stu "+i);
                marks[i] = sc.nextInt();
                total+=marks[i];
            }

            int average = total / n ;
            System.out.println("Average = "+average);
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception occured, please provide students");
        }catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Max 5 students are allowed");
        }

        System.out.println("Byeeee   ....");
    }

}