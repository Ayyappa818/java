import java.util.Scanner;

public class Condition18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char x= input.next().charAt(0);
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
            System.err.println("it contain a Vowels");
        }
        else{
            System.err.println("it is not contain a Vowels");
        }
    }
}