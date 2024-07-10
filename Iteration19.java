import java.util.Scanner;

public class Iteration19 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int min=9999;
        int max=0;
        for(int x=1;x<=5;x++){
        int i=s1.nextInt();
        if(i>max){
            max=i;
        }
        if(i<min){
            min=i;
        }
        }
        System.err.println(max);
        System.err.println(min);
    }
}
