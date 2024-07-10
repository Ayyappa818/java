public class Arrays9 {
    public static void main(String[] args) {
        int[] ar={23,34,54,10,4,7};
        int max=0;
        for(int i=0;i<=ar.length-1;i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }
        System.err.println(max);
    }
}
