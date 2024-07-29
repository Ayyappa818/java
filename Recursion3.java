public class Recursion3 {
    static int nat(int x,int y){
    
         if(x==y){
             return 10;
        }
        else{
            return x+nat(x+1,y);
        }
    }
    public static void main(String[] args) {
       int z = nat(1,10);
       System.out.println(z);
    }
}
