import java.util.Scanner;
// Write a program to convert a binary number into a decimal number

public class Accumulation {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int x=s1.nextInt();
        int sum=0;
        int s=0;
        int v=0;
        while (x!=0) {
            int rem=x%2;
            sum = sum*10+rem;
            x=x/2;
        }
        while(sum!=0){
            s=sum%10;
            v=v*10+s;
            sum=sum/10;

        }
        System.err.println(v);
    }
}
