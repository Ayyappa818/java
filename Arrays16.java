import java.util.Scanner;

public class Arrays16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int[] ar={23,34,54,10,4,7};
        int c=0;
        for(int i=0;i<=ar.length-1;i++){
            if(x==ar[i]){
                c=c+1;
                break;
                
            }  
        }
        if(c>0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
