import java.util.Scanner;

public class Condition12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a<b){
            System.err.println(a);
            System.err.println(b);
        }
        else{
            System.err.println(b);
            System.err.println(a);
    
        }
    }
}
