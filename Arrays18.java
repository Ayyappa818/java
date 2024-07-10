import java.util.Scanner;

public class Arrays18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int[] ar={23,34,54,10,4,7};
        for(int i=0;i<=ar.length-1;i++){
            if(x==ar[i]){
            System.err.println(i);
            }
        }
    }
}
