import java.util.Scanner;

public class DemoThis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String absents = "";
		for(int i=101;i<287;i++) {
			System.out.print("Is "+i+" Present =");
			try{
				int present = sc.nextInt();
				if(present<0 || present>1){
					throw new Exception("Please Enter 0 or 1");
				}
				System.out.println("");
				if(present==0) {
					absents += i +", ";
				}
			}catch(Exception e){
				i--;
				sc = new Scanner(System.in);
			}
		}
		System.out.println(absents);
	}
}
