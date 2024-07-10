public class Boubleshort {
    public static void main(String[] args) {
        int[] ar={12,6,87,4,3,11};
        for(int k=0;k<=ar.length-1;k++){
            for(int i=0;i<=ar.length-2;i++){
                if(ar[i]>=ar[i+1]){
                    int temp=ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;
                }
            }
        }
        for(int j=0;j<=ar.length-1;j++){
            System.err.println(ar[j]);
        }
    }
}
