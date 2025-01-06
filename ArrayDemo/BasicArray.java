public class BasicArray{
    public static void main(String[] args){
        int[] a = new int[4];

        a[0] = 10;
        a[1] = 5;
        a[2] = 7;
        a[3] = 9;

        int total = 0;
        for(int i=0;i<a.length;i++){
            total += a[i];
        }

        System.out.println("total = "+total);
    }
}