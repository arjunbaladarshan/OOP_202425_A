import java.util.*;
import java.io.FileOutputStream;
import java.awt.Robot;
import java.awt.event.*;
class AutoInput extends Thread{
	Robot r = null;
	public AutoInput(){
		try{
			r = new Robot();
		}catch(Exception e){}
	}
	public void run(){
		try{
			while(true){
				if(DemoThis.isStop){
					break;
				}
				sleep(1000);
				if(new Date().getTime() - DemoThis.waitingSince.getTime()>1000){
					r.keyPress(KeyEvent.VK_0);
					sleep(5);
					r.keyRelease(KeyEvent.VK_0);
					r.keyPress(KeyEvent.VK_ENTER);
					sleep(5);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
			}
		}catch(Exception e){
		
		}
	}
}
public class DemoThis {
	public static boolean isStop = false;
	public static Date waitingSince;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> absents = new ArrayList<Integer>();
		waitingSince = new Date();
		AutoInput at = new AutoInput();
		at.start();
		for(int i=101;i<287;i++) {
			System.out.print("Is "+i+" Present =");
			try{
				int present = sc.nextInt();
				waitingSince = new Date();
				if(present<0 || present>1){
					throw new Exception("Please Enter 0 or 1");
				}
				System.out.println("");
				if(present==0) {
					absents.add(i);
				}
			}catch(Exception e){
				i--;
				sc = new Scanner(System.in);
			}
		}
		isStop = true;
		try{
			while(true){
				System.out.println(absents);
				System.out.println("Enter 1 if ok\n Enter 2 to change");
				int choice = sc.nextInt();
				if(choice==1){
					FileOutputStream fos = new FileOutputStream("absetstudent.txt");
					fos.write(absents.toString().getBytes());
					fos.close();
					break;
				}
				else{
					System.out.println("Enter 1 to mark absent\n Enter 2 to mark present");
					int choiceInner = sc.nextInt();
					System.out.println("Enter roll number");
					Integer rollNo = sc.nextInt();
					if(choiceInner==1){
						absents.add(rollNo);
					}
					else if(choiceInner==2){
						absents.remove(rollNo);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
