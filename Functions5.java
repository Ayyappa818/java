public class Functions5 {
    static boolean isprime(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){   
            count = count+1;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean prime = isprime(4);
        System.out.println(prime);
    }
}
