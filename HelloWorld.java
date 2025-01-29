class Student{
    String name;
    int rollNo;
    int enrollmentNo;
    int semester;
    String batchNo;
    public void walk(int n){
        System.out.println(name + " is walking");
        for(int i=0;i<n;i++){
            System.out.print("#");
        }
        System.out.println("");
    }
}
public class HelloWorld{
    public static void main(String[] args){
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student stu4 = new Student();


        stu1.name = "vasani dishita";
        stu1.rollNo = 130;
        stu1.enrollmentNo=1298;
        stu1.batchNo = "A-2";

        stu2.name = "Nandita Mori";
        stu2.rollNo = 140;
        stu2.enrollmentNo = 1183;
        stu2.batchNo = "A-2";

        stu3.name = "Lunagariya Greshi";
        stu3.rollNo= 240;
        stu3.enrollmentNo = 1058;
        stu3.batchNo = "A-1";

        stu4.name = "Marvaniya Jenish";
        stu4.rollNo = 150;
        stu4.enrollmentNo = 1169;
        stu4.batchNo = "A-2";

        stu1.walk(3);
        stu2.walk(2);
        stu3.walk(4);
        stu4.walk(1);
    }
}