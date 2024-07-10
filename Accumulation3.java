import java.util.Scanner;
// Write a program to print the sum of the numbers between the given two numbers

public class Accumulation3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int sum=0;
        for(int i=x;i<=y;i++){
            sum=sum+i;
        }
        System.err.println(sum);
    }
}
