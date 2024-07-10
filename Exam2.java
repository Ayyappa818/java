import java.util.Scanner;
// Find the given number is a Strongest number or not?

public class Exam2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int sum=0;
        int temp=x;
        while (x>0) {
            int facto=1;
            int rem=x%10;
            for(int i=1;i<=rem;i++){
                facto=facto*i;
            }
            x=x/10;
            sum=sum+facto;
        }
        if(sum==temp){
            System.err.println("it is a Strongest nummber");
        }
        else{
            System.err.println(" it is not a Strongest nnumber");
        }
    }
}
