// Create interface EventListener with performEvent() method.

interface EventListener{
    void performEvent();
}

// Create MouseListener interface which inherits EventListener 
// along with mouseClicked(), mousePressed(),
// mouseReleased(), mouseMoved(), mouseDragged() methods

interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

//KeyListener interface which inherits EventListener along 
// with keyPressed(), keyReleased() methods
interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener{
    public void performEvent(){
        System.out.println("performEvent called");
    }
    public void mouseClicked(){
        System.out.println("mouseClicked called");
    }
    public void mousePressed(){
        System.out.println("mousePressed called");
    }
    public void mouseReleased(){
        System.out.println("mouseReleased called");
    }
    public void mouseMoved(){
        System.out.println("mouseMoved called");
    }
    public void mouseDragged(){
        System.out.println("mouseDragged called");
    }
    public void keyPressed(){
        System.out.println("keyPressed called");
    }
    public void keyReleased(){
        System.out.println("keyReleased called");
    }
}
public class Lab9_4{
    public static void main(String[] args){
        EventDemo ed = new EventDemo();
        ed.keyReleased();
    }
}