import java.util.*;
public class ExceptionFinallyDemo{
    public static void main(String[] args) throws Exception{
        justTest();
    }
    public static void justTest() throws Exception{
        getPercentage();
    }
    public static int getPercentage() throws Exception{
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                throw new Exception("aaa");
            }
            int c = a / b;
            return c;
            
        }catch(InputMismatchException ime){
            ime.printStackTrace();
            return 0;
        }
        finally{
            sc.close();
            System.out.println("SC Closed");
        }
        
    }
}