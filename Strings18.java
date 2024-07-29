public class Strings18 {
    // Check whether a string is palindrome or not.
    public static void main(String[] args) {
        String x="anna";
        String y="";
        for(int i=x.length()-1;i>=0;i--){ 
            y=y+x.charAt(i);
        }
        if(x.equals(y)){
            System.err.println("it is a palindrome");
        }
        else{
            System.err.println("it is not a palindrome");
        }
    }
}
