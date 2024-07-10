import java.util.Scanner;

public class Accumulation12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x=input.nextInt();
        int cou=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                cou=cou+1;
            }
        }
        if(cou==2){
            System.err.println("it is a prime");
        }
        else{
            System.err.println("it is not a prime");
        }
    }
}
