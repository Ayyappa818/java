public class Functions4 {
    static int rev(int a){
        int sum=0;
        while (a>0) {
            int rem=a%10;
            sum=sum*10+rem;
            a=a/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int reverse = rev(459);
        System.out.println(reverse);
    }
}
