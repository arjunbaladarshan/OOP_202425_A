class Faculty{
    String name;
    void printName(){
        System.out.println("Faculty Name = "+name);
    }
}

public class FacultyDemo{
    public static void main(String[] args){
        Faculty fac1 = new Faculty();
        fac1.name = "arjun";

        Faculty fac2 = new Faculty();
        fac2.name = "dharmiksir";

        Faculty fac3 = new Faculty();
        fac3.name = "gopi mam";

        fac1.printName();
        fac2.printName();
        fac3.printName();
    }
}