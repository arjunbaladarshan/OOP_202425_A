import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        int[] data = {10,25,36,28,29,3,6,978,24,65,35,68,92,65,26};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to search = ");
        int n = sc.nextInt();

        boolean isFound = false;

        for(int i=0;i<data.length;i++){
            if(data[i]==n){
                System.out.println("Match found at index "+i);
                isFound = true;
                System.out.println("Do you want to continue search??\n Enter 1 to continue and any other key to end");
                int temp = sc.nextInt();
                if(temp!=1){
                    break;
                }

            }
        }

        if(!isFound){
            System.out.println("Not found");
        }
    }
}