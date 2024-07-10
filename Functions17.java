import java.util.Scanner;

public class Functions17 {
    static void pap(int y){
        int count=0;
        int sum=0;
        int temp=y;
        int z=0;
        int rem=0;
        int res=y;
        int nc=y;
        if(y>0){
            for(int i=1;i<=y;i++){
                if(y%i==0){
                    count=count+1;
                }
            }
            if(count==2){
                System.out.println("it is prime");
            }
            else{
                System.out.println("it is not a prime");
            }
        
        while(y>0){
             rem=y%10;
            z=rem*rem*rem;
            sum=sum+z;
            y=y/10;
        }
        if(temp==sum){
            System.out.println("it is Armstrong number");
        }
        else{
            System.out.println("it is not a Armstrong number");
        }
        for(int i=1;i<nc;i++){
            if(nc%i==0){
                sum=sum+i;
            }
        }
        if(sum==res){
            System.out.println("it is a Perfect number");
        }
        else{
            System.err.println(" it is not a Perfect number");
        }
     }
 }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        pap(x);
    }
}
