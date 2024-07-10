public class Arrays28 {
    public static void main(String[] args) {
        int[] ar={6,5,2,1,8,7,4,3};
        int temp;
        int j;
        for(int i=1;i<=ar.length-1;i++){
            temp=ar[i];
            for(j=i;j>0;j--){
                if(temp<ar[j-1]){
                    ar[j]=ar[j-1];
                }
                else{
                    break;
                }
            }
            ar[j]=temp;
        }
        for(int k=0;k<=ar.length-1;k++){
            System.err.println(ar[k]);
        }
    }
}
