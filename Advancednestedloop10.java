public class Advancednestedloop10 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.err.print(i);
            }
            System.err.println(" ");
        }
    }
}
