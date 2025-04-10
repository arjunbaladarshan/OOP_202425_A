import java.util.*;
class Stu{
    String name;
    double spi;
    public Stu(String name, double spi){
        this.name = name;
        this.spi = spi;
    }
    public String toString(){
        return("Name = "+this.name+" # SPI = "+this.spi);
    }
}
class SpiComparator implements Comparator<Stu>{
    public int compare(Stu s1, Stu s2){
        if(s1.spi>s2.spi){
            return 1;
        }
        else{
            return -1;
        }
    }
}
class NameComparator implements Comparator<Stu>{
    public int compare(Stu s1, Stu s2){
        return s1.name.compareTo(s2.name);
    }
}
public class DemoPriority{
    public static void main(String[] args){
        PriorityQueue<Stu> al = new PriorityQueue<Stu>(new SpiComparator());
        al.add(new Stu("arjun",5.3));
        al.add(new Stu("darshan",6.3));
        al.add(new Stu("zibra",2.5));
        al.add(new Stu("bala",1.8));
        al.add(new Stu("rajkot",7.9));

        while(!al.isEmpty()){
            System.out.println(al.poll());
            // System.out.println(al);
        }
    }
}