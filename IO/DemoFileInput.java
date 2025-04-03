import java.io.FileInputStream;
public class DemoFileInput{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("NMG.jpg");
            int temp; 

            while((temp = fis.read())!=-1){
                System.out.print(temp);
            }            
            


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}