import java.util.Scanner;
// Write a program to find the LCM of given two numbers

public class Iteration28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int  min=0,max=0;
        if(x>y){
            max=x;
            min=y;
        }    
        else{
            max=y;
            min=x;
        }
        for(int i=1;i<=min;i++){
            if((max*i)%min==0){
                System.err.println(max*i);
                break;
            }
        }
    }
}
