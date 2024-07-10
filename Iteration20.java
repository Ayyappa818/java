import java.util.Scanner;

public class Iteration20 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            int x=s1.nextInt();
            if(x%2==0){
                System.err.println(x);
            }
        }
    }
}
