import java.util.Scanner;

public class Arrays17 {
    public static void main(String[] args) {
        int[] ar={23,34,54,10,34,7,23,10,34};
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int cou=0;
        for(int i=0;i<=ar.length-1;i++){
            if(ar[i]==x){
                cou=cou+1;
            }
        }
        System.err.println(cou);
    }
}
