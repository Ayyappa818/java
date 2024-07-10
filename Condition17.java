import java.util.Scanner;

public class Condition17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        double d=a+b+c%3;
        if(d>=177.55 && d<=203){
            System.err.println("A");
        }
        else{
            if(d>=102.1 && d<=136.95){
                System.err.println("B");
            }
            else{
                System.err.println("C");
            }
        }
    }
}
