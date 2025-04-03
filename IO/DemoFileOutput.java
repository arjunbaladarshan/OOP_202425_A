import java.io.FileOutputStream;
public class DemoFileOutput{
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("xyz.avb");
            String name = "arjun";
            byte[] data = name.getBytes();
            fos.write(data);
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        

    }
}