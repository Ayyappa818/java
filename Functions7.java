public class Functions7 {
    static int dgt(int x){
        int count=0;
        while (x>0) {
            int rem=x%10;
            count=count+1;
            x=x/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int digit=dgt(987234);
        System.err.println(digit);
    }
}
