public class Advancednestedloop17 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=7;j>=i;j--){
                System.err.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.err.print(" "+k);
            }
            System.err.println("");
        }
    }
}
