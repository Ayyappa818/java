// Print all even or odd numbers in a given range using recursion.
public class Recursion2 {
    static void evenodd(int x){
        if(x>1){
            evenodd(x-1);
        }
        if(x%2==0){
            System.out.println("even"+x);
        }
        if(x%2!=0){
            System.out.println("odd::"+x);
        }
    }
    public static void main(String[] args) {
        evenodd(60);
    }
}
