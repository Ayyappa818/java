public class Functions1 {
    static int compare(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static void main(String[] args) {
        int greatest = compare(45,67,23);
        System.err.println(greatest);
    }
}
