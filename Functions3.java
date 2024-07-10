public class Functions3 {
    static int fact(int a){
        int facto=1;
        for(int i=a;i>=1;i--){
            facto=facto*i;
        }
        return facto;
    }
    public static void main(String[] args) {
        int factorial = fact(4);
        System.err.println(factorial);
        int factorial1 = fact(5);
        System.out.println(factorial1);
    }
}
