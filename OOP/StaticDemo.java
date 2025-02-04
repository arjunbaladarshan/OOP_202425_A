class Student{
    int rollNo;
    static int noOfChoc;
    static int noOfStudents = 0;
    public Student(){
        System.out.println("Student created");
        noOfStudents++;
    }
}

public class StaticDemo{
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.rollNo = 126;
        stu1.noOfChoc++;
        stu1.noOfChoc++;

        Student stu2 = new Student();
        stu2.rollNo = 153;
        stu2.noOfChoc++;
        stu2.noOfChoc++;

        Student.noOfChoc--;

        System.out.println("No Of choc @ stu1 = "+stu1.noOfChoc);
        System.out.println("No Of choc @ stu2 = "+stu2.noOfChoc);

        System.out.println("Total No of students = "+stu1.noOfStudents);

    }
}