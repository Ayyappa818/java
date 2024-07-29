public class Exam7 {
    public static void main(String[] args) {
        int[] ar={200,300,55,43,6,9,202,6,99,200,55,300,62,1,300,200};
        // int i,j;
        for(int i=0;i<=ar.length-1;i++){
            int count=0;
            for(int j=i;j>0;j--){
                if(ar[i]==ar[j-1]){
                    // break;
                    count=count+1;
                }
            }
            if(count==0){
                System.out.println(ar[i]);
            }
        }
    }
}
