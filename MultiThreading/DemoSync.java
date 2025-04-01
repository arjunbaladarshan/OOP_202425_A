class Table{
    public void printTable(int n){
        for(int i=1;i<11;i++){
            System.out.println(n+" X " +i+ "= "+ (n*i));
            try{
                Thread.sleep(200);
            }catch(Exception e){}
        }
    }
}
class PrintTableThread extends Thread{
    Table t;
    int n;
    public PrintTableThread(Table t, int n){
        this.t = t;
        this.n = n;
    }
    public void run(){
        if(n==5){
            try{
                sleep(100);
            }catch(Exception e){}
        }
        t.printTable(n);
        
    }
}
public class DemoSync{
    public static void main(String[] args){
        Table t = new Table();
        PrintTableThread ptt1 = new PrintTableThread(t,5);
        ptt1.start();

        PrintTableThread ptt2 = new PrintTableThread(t,6);
        ptt2.start();
    }
}