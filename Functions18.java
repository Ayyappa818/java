// Find all prime numbers between the given interval using functions.
public class Functions18 {
    static void prime(int a,int b){
        for(int i=a;i<=b;i++){
            int count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count =count+1;
            }
        } 
        if(count==2){
            System.out.println(i);
        }
        }
    }
    public static void main(String[] args) {
        prime(1,100);
    }
}
