public class DemoTest{
    public static void main(String[] args){
        int i=0;
        for(;;){
            System.out.println(i);
            i++;
            if(i==3){
                break;
            }
        }
        System.out.println("Ans after loop = "+i);
    }
}