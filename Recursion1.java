public class Recursion1 {
    // Print all natural numbers between 1 to n using recursion.
    static void nat(int x){
        if(x>0){
            System.out.println(x);
            nat(x+1);
        }
    }
    public static void main(String[] args) {
       nat(1);
    }
}
