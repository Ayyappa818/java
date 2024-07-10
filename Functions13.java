public class Functions13 {
    static void mxmn(int a,int b){
        if(a>b){
            System.err.println("max::"+a);
            System.err.println("min::"+b);
        }
        else{
            System.err.println("min::"+b);
            System.err.println("max::"+a);
        }
    }
    public static void main(String[] args) {
        mxmn(64,24);
    }
}
