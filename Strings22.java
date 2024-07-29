import java.util.Scanner;

public class Strings22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String x=input.nextLine();
        char y='a';
        int count=0;
        for(int i=0;i<=x.length()-1;i++){
            if(y==x.charAt(i)){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
