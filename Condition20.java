import java.util.Scanner;

public class Condition20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char x=input.next().charAt(0);
        if((x>='a' && x<='z') || (x>='A' && x<='Z')){
            System.err.println("it is a Alphabet");
        }
        else{
            System.err.println("it is not a Alphabet");
        }
    }
}
