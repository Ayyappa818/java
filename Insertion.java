public class Insertion {
    public static void main(String[] args) {
        int[] ar={6,5,3,1,8,7,2,4};
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
