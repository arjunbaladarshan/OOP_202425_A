import java.util.*;
class Stu{
    String name;
    double spi;
    public Stu(String name, double spi){
        this.name = name;
        this.spi = spi;
    }
}
public class DemoCollection{
    public static void main(String[] args){
        LinkedList<String> al = new LinkedList<String>();
        Scanner scString = new Scanner(System.in);
        Scanner scOther = new Scanner(System.in);
        while(true){
            System.out.println("Enter quit or Enter Name");
            String temp = scString.nextLine();
            if(temp.equals("quit")){
                break;
            }
            
            al.add(temp);
            
        }
        while(true){
            System.out.println(al);

            System.out.println("Enter 1 for ok\nEnter 2 for edit");
            int choice = scOther.nextInt();
            if(choice==1){
                System.out.println("======== Final Data ======== ");
                Iterator<String> i = al.iterator();
                while(i.hasNext()){
                    System.out.println(i.next());
                }
                break;
            }
            else{
                System.out.println("Enter 1 to add\nEnter 2 for edit\nEnter 3 for delete\nEnter 4 to sort");
                int choiceInner = scOther.nextInt();
                if(choiceInner==1){
                    System.out.println("Enter name to add");
                    String nameToDelete = scString.nextLine();
                    al.add(nameToDelete);
                }
                else if(choiceInner==3){
                    System.out.println("Enter name to delete");
                    String nameToDelete = scString.nextLine();
                    al.remove(nameToDelete);
                }
                else if(choiceInner==4){
                    Collections.sort(al);
                }
            }
        }
    }
}