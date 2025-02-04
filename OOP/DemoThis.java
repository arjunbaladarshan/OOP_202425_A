import java.util.Scanner;

public class DemoThis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String absents = "";
		for(int i=101;i<287;i++) {
			System.out.print("Is "+i+" Present =");
			int present = sc.nextInt();
			System.out.println("");
			if(present==0) {
				absents += i +", ";
			}
		}
		System.out.println(absents);
	}
}
