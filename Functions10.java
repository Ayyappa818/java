public class Functions10 {
    // Write a function which can check a given number is armstrong number or not
    static boolean arm(int x){
        int sum=0;
        int y=0;
        int temp=x;
        while (x>0) {
            int rem=x%10;
            y=rem*rem*rem;
            sum=sum+y;
            x=x/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean armstrong=arm(153);
        System.err.println(armstrong);
    }
}
