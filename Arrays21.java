public class Arrays21 {
    public static void main(String[] args) {
        int[] ar={23,34,54,10,4,7};
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar.length-2;j++){
                if(ar[j]>=ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int k=0;k<=ar.length-1;k++){
            System.err.println(ar[k]);
        }
    }
}
