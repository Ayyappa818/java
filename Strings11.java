import java.util.Scanner;

public class Strings11 {
    // Take a string value from the user and print only alternate characters in the console. Given string: "abcdef", Expected output: "a" "c" "e"
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String x=input.nextLine();
        for(int i=0;i<=x.length()-1;i=i+2){
            System.err.println(x.charAt(i));
        }
    }
}
