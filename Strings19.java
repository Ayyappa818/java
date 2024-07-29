import java.util.Scanner;
// Take a string value and print all the positions(index) of a given character in the string. Given string: "banana", given character:'a', Expected output:1,3,5
public class Strings19 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String x=input.nextLine();
        char a='a';
        for(int i=0;i<=x.length()-1;i++){
            if(a==x.charAt(i)){
            System.out.println(i);
            }
        }
    }
}
