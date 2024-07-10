import java.util.Scanner;

public class Accumulation11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int cou=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                cou=cou+1;
            }
        }
        System.err.println(cou);
    }
}
