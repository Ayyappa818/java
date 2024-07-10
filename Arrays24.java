public class Arrays24 {
    // Print only the 2 digit numbers from an array
    public static void main(String[] args) {
        int[] ar={233,34,546,10,4,7,12,999,6,64};
        for(int i=1;i<=ar.length-1;i++){
            if(ar[i]>=10 && ar[i]<=99){
                System.err.println(ar[i]);
            }
        }
    }
}
