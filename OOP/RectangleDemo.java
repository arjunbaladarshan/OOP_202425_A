import java.util.Scanner;
class Rectangle{
    int height;
    int width;
}

class Human{
    int noOfSwas;

    public void takeSwas(){
        noOfSwas--;
        if(noOfSwas<0){
            die();
        }
    }

    public void die(){
        
    }
}

public class RectangleDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Human arjun = new Human();
        arjun.noOfSwas = 10000000;



        for(int i=0;i<r1.height;i++){
            for(int j=0;j<r1.width;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}