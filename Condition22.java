import java.util.Scanner;

public class Condition22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x = input.nextInt();
        if(x%4==0){
            System.err.println("it is Leap Year");
        }
        else{
            System.err.println("it is not a Leap year");
        }
    }
}
