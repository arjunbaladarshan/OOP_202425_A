import java.io.File;
import java.util.Date;
public class DemoFile{
    public static void main(String[] args){
        File f = new File("arjun");
        String[] files = f.list();
        for(int i=0;i<files.length;i++){
            File temp = new File("arjun",files[i]);
            if(temp.isDirectory()){
                System.out.println(files[i]);
                temp.delete();
            }
        }
    }
}