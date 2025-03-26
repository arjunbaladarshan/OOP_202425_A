/*

	Declare a class called student having following
	 data members:id_no	
	no_of_subjects_registered	
	
	 subject_code	
	subject_credits	
	grade_obtained 
	 and spi. Define constructor and calculate_spi 
	 methods. Define main to instantiate an array 
	 for objects of class student to process data 
	 of n students.

*/
import java.util.Scanner;
class Student{
	int id_no;	
	int no_of_subjects_registered	;
	String[] subject_codes	;
	int[] subject_credits;	
	String[] grade_obtained	;
	double spi;

	public Student(int id_no, int no_of_subjects_registered,String[] subject_codes){
		this.id_no = id_no;
		this.no_of_subjects_registered = no_of_subjects_registered;
		this.subject_codes = subject_codes;
	}

	public void calculate_spi(){
		this.spi = 10;//sets value using equation;
	}
}
public class FinalExample2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("This is called any how");
		}
		System.out.println("this is end");
	}
}