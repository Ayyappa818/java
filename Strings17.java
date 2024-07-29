public class Strings17 {
    // Print the reverse of a given string in the console.
    public static void main(String[] args) {
        String x="ayyappa";
        String reveString="";
        char a;
        for(int i=0;i<=x.length()-1;i++){
            a=x.charAt(i);
            reveString=a+reveString;
        }
        System.out.println(reveString);
    }
}
