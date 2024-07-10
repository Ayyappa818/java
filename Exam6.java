import java.util.Arrays;

public class Exam6 {
    public static void main(String[] args) {
            int[] ar={10,15,24,29,12,18,5,9,2,58,44,55};
            for(int j=1;j<=5;j++){
                for(int i=ar.length-1;i>0;i--){
                    int temp=ar[i];
                    ar[i]=ar[i-1];
                    ar[i-1]=temp;
                }
                System.err.println(Arrays.toString(ar));

            }
    }
}
