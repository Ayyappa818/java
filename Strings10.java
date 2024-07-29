import java.util.Scanner;
// Take a string value from the user and print all the characters in the console.
public class Strings10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String x=input.nextLine();
        for(int i=0;i<=x.length()-1;i++){
           System.err.println(x.charAt(i));
        }
    }
}
