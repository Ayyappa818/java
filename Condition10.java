import java.util.Scanner;

public class Condition10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            System.err.println("it is a Greatest number");
        }
        else{
            System.err.println("it is not a Greatest number");
        }
    }
}
