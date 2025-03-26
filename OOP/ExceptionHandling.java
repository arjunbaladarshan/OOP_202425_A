import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;
public class ExceptionHandling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter N1");
            double markObtained = sc.nextDouble();
            System.out.println("Enter N2");
            double totalMarks = sc.nextDouble();   
            if(markObtained>totalMarks){
                throw new Exception("Mark obtained can not be grater than total marks");
            }

            double ans = (markObtained/totalMarks)*100;
            System.out.println("Answer = "+ans);
        }catch(Exception e){
            if(e instanceof InputMismatchException){
                throw e;
            }
        }
        System.out.println("Byyyeeeeee");
    }

}