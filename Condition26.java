import java.util.Scanner;

public class Condition26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x= input.nextInt();
        if(x%5==0 && x%11==0){
            System.err.println("it is Divisible by Both 5&11");
        }
        else{
            System.err.println("it is not Divisible by both 5&11");
        }
    }
}
