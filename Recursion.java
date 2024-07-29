// Find the power of any number using recursion.
public class Recursion {
    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        else{
            return a*pow(a,b-1);
        }
    }
    public static void main(String[] args) {
        int x=pow(6,2);
        System.out.println(x);
    }
}