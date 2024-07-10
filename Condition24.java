import java.util.Scanner;

public class Condition24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a>=18){
            System.err.println("You are Eligibility for Voting");
        }
        else{
            System.err.println("You are not Eligibility for voting");
        }
    }
}
