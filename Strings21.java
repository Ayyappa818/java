import java.util.Scanner;
// Take a string value and print the last occurence(index) of a given character in the string. Given string: "banana", given character:'a', Expected output:5
public class Strings21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);;
        String x=input.nextLine();
        char y='a';
        int z=x.lastIndexOf(y);
        System.out.println(z);
    }
}
