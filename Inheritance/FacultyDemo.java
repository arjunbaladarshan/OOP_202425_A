final class Human{
    public void abc(){
        System.out.println("Human ABC");
    }
}
class Faculty{
    String name;
    int exp;
    public Faculty(String name, int exp){
        this.name = name;
        this.exp = exp;
    }

    public void abc(){
        System.out.println("Faculty ABC");
    }

    public String toString(){
        return this.name;
    }

}
public class FacultyDemo{
    public static void main(String[] args){
        Faculty facObj1 = new Faculty("arjun",13);
        Faculty facObj2 = new Faculty("darshan",25);
        Faculty facObj3 = new Faculty("XYZ",8);


        System.out.println(facObj1);
        System.out.println(facObj2);
        System.out.println(facObj3);
    }
}