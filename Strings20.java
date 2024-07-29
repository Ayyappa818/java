import java.util.Scanner;
// Take a string value and print the first occurence(index) of a given character in the string. Given string: "banana", given character:'a', Expected output:1
public class Strings20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String x=input.nextLine();
        char y='a';
        int z=x.indexOf(y);
        System.err.println(z);
    }
}
