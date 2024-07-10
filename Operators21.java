import java.util.Scanner;

public class Operators21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(96%x==0){
            System.out.println("it is a factor");
        }
        else{
            System.out.println("it is not a factor");
        }
    }

}