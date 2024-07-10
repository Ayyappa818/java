public class Exam3 {
// Given an array of integers, find two numbers such that they add up to a specific target.
// Array Elements: 20, 10, 5, 15, 25, 30
// Target : 35
// Output:20,15
// 	10,25
// 	5,30

    public static void main(String[] args) {
        int[] ar={20,10,5,15,25,30};
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar.length-2;j++){
                if(ar[i]+ar[j+1]==35){
                    System.err.println(ar[i]+" , "+ar[j+1]);
                }
            }
        }
    }
}
