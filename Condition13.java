import java.util.Scanner;

public class Condition13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if(x>y){
            System.err.println(x);
            System.err.println(y);
        }
        else{
            System.err.println(y);
            System.err.println(x);
        }
    }
}
