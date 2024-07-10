import java.util.Scanner;

public class Iteration22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        while(x!=0){
            int rem=x%10;
            if(rem%2==0){
                System.err.println(rem);
            }
            x=x/10;
        }
    }
}
