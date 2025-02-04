import java.util.Scanner;
public class MathDemo{
    public static void main(String[] agrs){

        // int[] dist = {0,150,350,450,550};
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please Enter start point \n   Please Enter 1 for porbandar\n   Please Enter 2 for rajkot\n   Please Enter 3 for ahemdabad\n   Please Enter 4 for baroda\n   Please Enter 5 for surat\n");
        // int startPoint = sc.nextInt();

        // System.out.println("Please Enter end point \n   Please Enter 1 for porbandar\n   Please Enter 2 for rajkot\n   Please Enter 3 for ahemdabad\n   Please Enter 4 for baroda\n   Please Enter 5 for surat\n");
        // int endPoint = sc.nextInt();

        
        // double ans = dist[endPoint-1] - dist[startPoint-1];
        // ans = Math.abs(ans);
        // System.out.println("Ans = "+ans);

        double ans = Math.random();
        ans *= 5;
        ans += 1;
        ans = Math.round(ans);
        System.out.println(ans);

    }
}