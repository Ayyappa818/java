public class Arrays23 {
    public static void main(String[] args) {
        int[] ar={23,3,54,10,4,7,1,34,5,9};
        int[] br={};
        int[] cr={};
        for(int i=0;i<=ar.length-1;i++){
         if(ar[i]%2==0){
         br=ar;
         System.err.println(br[i]);
         }
         if(ar[i]%2!=0){
            cr=ar;
            System.err.println(cr[i]);
         }
        }
     }
}
