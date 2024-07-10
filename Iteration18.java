import java.util.Scanner;

public class Iteration18 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x=input.nextInt();
        for(int y=1;y<=x;y++){
            if(x%y==0){
            System.err.println(y);
            }
        }
    }
}
