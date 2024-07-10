import java.util.Scanner;

public class Iteration21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while(n!=0){
            int rem = n%10;
            System.err.println(rem);
            n=n/10;
        }
    }
}
