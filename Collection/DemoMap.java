import java.util.*;
class Stu{
    String name;
    double spi;
    int rollNo;
    public Stu(String name, double spi, int rollNo){
        this.name = name;
        this.spi = spi;
        this.rollNo = rollNo;
    }
    public String toString(){
        return("RollNo = "+rollNo+" # Name = "+this.name+" # SPI = "+this.spi);
    }
}
public class DemoMap{
    public static void main(String[] args){
        HashMap<Integer, Stu> al = new HashMap<Integer, Stu>();
        al.put(101,new Stu("arjun",5.3,101));
        al.put(102,new Stu("darshan",6.3,102));
        al.put(103,new Stu("zibra",2.5,103));
        al.put(104,new Stu("bala",1.8,104));
        al.put(105,new Stu("rajkot",7.9,105));

        for(int i=101;i<10000000;i++){
            String name = (char)((int)((Math.random()*26)+97))+""+(char)((int)((Math.random()*26)+97))+""+(char)((int)((Math.random()*26)+97))+""+(char)((int)((Math.random()*26)+97));
            al.put(i,new Stu(name,Math.random()*10,i));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no ");
        int r = sc.nextInt();

        System.out.println(al.get(r));
        
    }
}