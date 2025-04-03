import java.io.FileInputStream;
import java.io.FileOutputStream;
public class DemoFileCopy{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("NMG.jpg");
            FileOutputStream fos = new FileOutputStream("NMG_Updated.jpg");
            int temp; 
            String msg = "secret";
            int counter = 0;
            while((temp = fis.read())!=-1){
                counter++;
                if(counter==1000){
                    fos.write(msg.getBytes());
                }
                fos.write(temp);
            }            
            


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}