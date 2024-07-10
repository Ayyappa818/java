public class Accumulation2 {
    public static void main(String[] args) {
        int sum=0;
        int avg=0;
        for (int i=1;i<=10;i++){
            sum=sum+i;
        }
        avg=sum/10;
        System.err.println(avg);
    }
}
