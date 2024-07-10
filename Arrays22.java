public class Arrays22 {
    // Reduce the each element of the array by 25% and store in a separate array.
    public static void main(String[] args) {
       int[] ar={23,3,54,10,4,7,1,34,5,9};
       int[] br={};
       for(int i=0;i<=ar.length-1;i++){
        br=ar[i]*0.75;
        System.err.println(br[i]);
       }
    }
}
