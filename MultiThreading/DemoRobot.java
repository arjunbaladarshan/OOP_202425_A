import java.awt.*;
import java.awt.event.*;

public class DemoRobot{
    public static void main(String[] args){
        try{
            Robot r = new Robot();
            Thread.sleep(2000);
            r.mouseMove(766,1056);
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(500);

            r.mouseMove(769,697);
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(2000);

            r.mouseMove(345,109);
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        }catch(Exception e){}
        

    }
}