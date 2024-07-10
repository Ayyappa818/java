public class Functions6 {
    static boolean ispalin(int a){
        int sum=0;
        int temp=a;
    while(a>0){
        int rem=a%10;
        sum=sum*10+rem;
        a=a/10;
    }
    if(sum==temp){
       return true;     
    }
    else{
        return false;
    }
    }
    public static void main(String[] args) {
        boolean palindrome=ispalin(343);
        System.err.println(palindrome);
    }
}
