import java.util.Scanner;

public class Iteration26 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int i=4;
        int j=1;
        int a=0;
        while (j<=i) {
            a=n%10;
            n=n/10;
            j++;
        }
        System.err.println(a);
    }
}
