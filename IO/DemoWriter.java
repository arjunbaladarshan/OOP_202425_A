
import java.io.File;
import java.io.PrintWriter;

public class DemoWriter {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("myfile.txt"));
            pw.println("Hello world");
            pw.println("New file data");
            pw.println("This is third line");
            pw.print("This is the line line from the code");
            pw.close();
        } catch (Exception e) {
        }
    }
}
