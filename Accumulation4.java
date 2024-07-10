public class Accumulation4 {
    // Write a program to print the sum of even numbers between the given two numbers

    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.err.println(sum);
    }
}
