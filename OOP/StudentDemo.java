class Student{
    String name;
    int rollNo;
    double spi;

    public Student(){
        name = "No name specified";
        rollNo = -2;
    }

    public Student(String name){
        this();
        this.name = name;
    }

    public Student(String name, int rollNo){
        this(name);
        this.rollNo = rollNo;
    }

    public Student(String name, int rollNo, double spi){
        this(name,rollNo);
        this.spi = spi;
    }

    public void printStudent(){
        System.out.println("Name = "+name + " and rollNo = "+rollNo);
    }
}

public class StudentDemo{
    public static void main(String[] agrs){
        Student stu1 = new Student();
        stu1.printStudent();

        Student stu2 = new Student("arjun");
        stu2.printStudent();
    }
}