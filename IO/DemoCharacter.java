
import java.io.BufferedReader;
import java.io.FileReader;



public class DemoCharacter {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("StudentData.csv"));
            String temp;

            while((temp=br.readLine())!=null){
                String[] data = temp.split(",");
                if(Double.parseDouble(data[3]) > 6){
                    System.out.println(data[0]);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
