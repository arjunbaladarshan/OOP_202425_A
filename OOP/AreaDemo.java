// create methods to find area of circle, square, rect, triangle

class Shapes{
    public void area(int length){
        double ans = length * length;
        System.out.println("Area of Square = "+ans);
    }
    public void area(double radius){
        double ans = Math.PI * radius * radius ;
        System.out.println("Area of Circle = "+ans);
    }
    public void area(int length, int width){
        double ans = length * width;
        System.out.println("Area of Rectangle = "+ans);
    }

    public void area(int height, double base){
        double ans = 1/2.0*height * base;
        System.out.println("Area of Triangle = "+ans);
    }

    // public void area(double height, int base){
    //     double ans = 1/2.0*height * base;
    //     System.out.println("Area of Triangle = "+ans);
    // }


    public int max(int n1, int n2){
        if(n1>n2){
            return n1;
        }
        else{
            return n2;
        }
    }

    public int max(int n1, int n2, int n3){
        if(n1>n2){
            if(n1>n3){
                return n1;
            }
            else{
                return n3;
            }
        }
        else{
            if(n2>n3){
                return n2;
            }
            else{
                return n3;
            }
        }
    }
}
public class AreaDemo{
    public static void main(String[] argrs){
        Shapes s1 = new Shapes();
        s1.area(10);
        s1.area(11,12);
        s1.area(10.0);
        s1.area(10,10.0);

        int max1 = s1.max(5,8);
        int max2 = s1.max(5,8,9);
    }
}