public class Exam5 {
    public static void main(String[] args) {
        // int[] ar={72,23,89,52,64,10,6,96};
        // int max=ar[0];
        // int smax=ar[0];
        // for(int i=0;i<=ar.length-1;i++){
        //     if(max<ar[i]){
        //         smax=max;
        //         max=ar[i];

        //     }
        //     else{
        //         if(smax==max || smax<ar[i]){
        //             smax=ar[i];
        //         }
        //     }
        // }
        // System.err.println(max);
        // System.err.println(smax);





        // for(int i=0;i<=ar.length-1;i++){
        //     if(max<ar[i]){
        //         max=ar[i];
        //     }
        //     if(smax<ar[i]){
        //         smax=ar[i];
        //     }
        // }
        // System.out.println(max);
        // System.err.println(smax);

        int[] ar={4,9,1,3,7,6,8,2,5};
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar.length-2;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
                System.err.println(ar[ar.length-2]);
    }
}
