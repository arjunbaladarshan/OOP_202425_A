/*
	WAP in java to get distance from current point
	 to the object and angle to top of the object 
	 from the user and print the height of the object

*/


import java.util.Scanner;
public class MathDemoExample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance");
		double distance = sc.nextDouble();

		System.out.println("Enter Angle");
		double theta = sc.nextDouble();

		theta = Math.toRadians(theta);

		double height = distance * Math.sin(theta) / Math.cos(theta);


		System.out.println("Height = "+height);
	}
}