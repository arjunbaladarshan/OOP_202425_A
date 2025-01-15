public class SearchDemo{
    public static void main(String[] args){
        int[] data = {10,25,36,28,29,3,6,978,24,65,35,68,92,65,26};
        
        for(int i=0;i<data.length;i++){
            int temp = i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]<data[temp]){
                    temp = j;
                }
            }
            int swapVariable = data[temp];
            data[temp] = data[i];
            data[i] = swapVariable;
        }

        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}