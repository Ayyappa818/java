import java.util.Scanner;
// Take 5 string values from the user and print them in the console.

public class Strings4 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            Scanner input=new Scanner(System.in);
            String x=input.nextLine();
            System.err.println(x);
        }
    }
}
