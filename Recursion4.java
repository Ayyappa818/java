public class Recursion4 {
    static void evenodd(int a){
        if(a>=1){
         evenodd(a-1);
     }
     System.out.println(a);
 }
     public static void main(String[] args) {
         evenodd(60);
    
     }
}
