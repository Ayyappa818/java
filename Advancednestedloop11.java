public class Advancednestedloop11 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.err.print(j);
            }
            System.err.println("");
        }
    }
}
