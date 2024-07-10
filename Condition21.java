import java.util.Scanner;

public class Condition21 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char a = input.next().charAt(0);
        if(a>=65 && a<=99){
            System.err.println("It is an Upper case");
        }
        else{
            System.err.println("it is an Lowercase");
        }
    }
}
