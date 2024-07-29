import java.util.Scanner;
// Take a string value from the user and print the last character in the console.


public class Strings7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String x=input.nextLine();
        System.err.println(x.charAt(x.length()-1));
    }
}
