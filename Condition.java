import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x>100 && x<999){
            System.err.println("it is a 3 digit number");
        }
        else{
            System.err.println("it is not a 3 digit number");
        }
    }
}
