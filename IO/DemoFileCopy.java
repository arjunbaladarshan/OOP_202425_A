import java.io.FileInputStream;
import java.io.FileOutputStream;
public class DemoFileCopy{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("NMG.jpg");
            FileOutputStream fos = new FileOutputStream("NMG_Updated.jpg");
            int temp; 
            String msg = "secret msg";
            byte[] data = msg.getBytes();
            int counter = 0;
            while((temp = fis.read())!=-1){
                counter++;
                if(counter==1500){
                    fos.write(data);
                    fis.skip(data.length);
                }
                else{
                    fos.write(temp);
                }
                
            }            
            


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}