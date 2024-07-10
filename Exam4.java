public class Exam4 {
//     Take an array of integers and store the even number in one array and odd numbers in another array from the given array.
// 	Array Element: 10,15,24,29,12,18,5,9,2,58,44,55
// 	Output:10,24,12,18,2,58,44
// 15,29,5,9,55


    public static void main(String[] args) {
        int[] ar={10,15,24,29,12,18,5,9,2,58,44,55};
        int[] br=new int[ar.length];
        int[] cr=new int[ar.length];
        int even=0;
        int odd=0;
        for(int i=0;i<=ar.length-1;i++){
            if(ar[i]%2==0){
                br[even]=ar[i];
                even++;
            }
            if(ar[i]%2!=0){
                cr[odd]=ar[i];
                odd++;
            }
        }
        for(int j=0;j<=ar.length-1;j++){
            System.err.print("["+br[j]+"]");
        }
        System.err.println("");
        for(int k=0;k<=ar.length-1;k++){
            System.err.print("["+cr[k]+"]");
        }
    }
}
