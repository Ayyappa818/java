public class Arrays26 {
    // Print only multiples of 2 AND 3 from an array
    public static void main(String[] args) {
        int[] ar={23,34,54,10,4,7,12,64,99};
        for(int i=0;i<=ar.length-1;i++){
            if(ar[i]%2==0 && ar[i]%3==0){
                System.err.println(ar[i]);
            }
        }
    }
}
