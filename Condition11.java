import java.util.Scanner;

public class Condition11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if(a<b){
            System.err.println("it is a least number");
        }
        else{
            System.err.println("it is a greatest number");
        }
    }
}
