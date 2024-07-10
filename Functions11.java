public class Functions11 {
    static void evenORodd(int[] br){
        for(int i=0;i<=br.length-1;i++){
            if(br[i]%2==0){
                System.err.println(br[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        evenORodd(ar);
    }
}
