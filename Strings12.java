import java.util.Scanner;
// Take a string value from the user and print all the characters in reverse order in the console. Given string: "abcdef", Expected output:"f" "e" "d" "c" "b" "a"
public class Strings12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String x=input.nextLine();
        for(int i=x.length()-1;i>=0;i--){
            System.out.println(x.charAt(i));
        }
    }
}
