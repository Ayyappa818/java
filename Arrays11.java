public class Arrays11 {
    public static void main(String[] args) {
        int[] ar={23,34,54,10,4,7};
        int sum=0;
        int avg=0;
        for(int i=0;i<=ar.length-1;i++){
            sum=sum+ar[i];
        }
        avg=sum/ar.length;
        System.err.println(avg);
    }
}
