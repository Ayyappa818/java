import java.util.Scanner;

public class Condition15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a<b && a<c){
            System.err.println(a);
        }
        else{
            if(b<c){
                System.err.println(b);
            }
            else{
                System.err.println(c);
            }
        }
    }
}
