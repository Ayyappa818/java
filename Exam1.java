import java.util.Scanner;
// To find the given number is a Perfect number or not.

public class Exam1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=1;
        int sum=0;
        while (y<x) {
            if(x%y==0){
                sum=sum+y;
            }
            y++;
        } 
        if(sum==x){
            System.err.println("it is a Perfect number");
        }
        else{
            System.err.println("it is not a perfect number ");
        }
    }
}
