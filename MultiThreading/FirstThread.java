class MyThread extends Thread{
    String name = "Darshan College - Rajkot";
    public MyThread(String name){
        this.name = name;
        start();
    }
    public void run(){
        int i = 0;
        while(i<name.length()){
            System.out.print(name.charAt(i));
            i++;
            try{
                sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    
    }
}
public class FirstThread{
    public static void main(String[] args){
        MyThread mt1 = new MyThread("ARJUN BALA");
        
        MyThread mt2 = new MyThread("darshan uni - rajkot");
    
    }
}