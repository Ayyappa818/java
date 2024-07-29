import java.util.Scanner;
// Take 5 string values from the user and print the first characters in the console.

public class Strings6 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            Scanner input=new Scanner(System.in);
            String x=input.nextLine();
            System.err.println(x.charAt(0));
        }
    }
}
