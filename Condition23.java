import java.util.Scanner;

public class Condition23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        if(a<=31){
            System.err.println("The Date is Correct");
        }
        else{
            System.err.println("The Date is not correct");
        }
    }
}
