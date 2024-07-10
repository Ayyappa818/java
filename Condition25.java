import java.util.Scanner;

public class Condition25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x>0){
            System.err.println("it is a Positive number");
        }
        else{
            if(x==0){
                System.err.println("it is a Zero");
            }
            else{
            System.err.println("It is Negitive number");
            }
        }
    }
}
