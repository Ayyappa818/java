import java.util.Scanner;

public class Operators23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%10==4){
            System.out.println("it is at unit place");
        }
        else{
            System.err.println("it is not at unit place");
        }
    }
}
