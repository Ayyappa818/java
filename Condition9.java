import java.util.Scanner;

public class Condition9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();
        if(a%2==0){
            System.err.println("it is a even number");
        }
        else{
            System.err.println("it is a Odd number");
        }
    }
}
