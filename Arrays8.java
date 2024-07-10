public class Arrays8 {
    public static void main(String[] args) {
        int[] ar={23,34,54,0,4,7};
        int min=9999;
        for(int i=0;i<=ar.length-1;i++){
            if(min>ar[i]){
                min=ar[i];
            }
        }
        System.err.println(min);
    }
}
