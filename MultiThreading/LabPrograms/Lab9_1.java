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

// create KeyListener interface which inherits EventListener along 
// with keyPressed(), keyReleased() methods

interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}

// WAP to create EventDemo class which implements MouseListener 
// and KeyListener and demonstrate all the methods of the interfaces.
class EventDemo implements MouseListener, KeyListener{
    public void performEvent(){
        System.out.println("Perform Event Called");
    }
}

public class Lab9_1{
    public static void main(String[] args){

    }
}