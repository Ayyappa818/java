import java.util.Scanner;

public class Condition27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        if(x==0){
            System.err.println("Sunday");
        }
        else{
            if(x==1){
                System.err.println("Monday");
            }
            else{
                if(x==2){
                    System.err.println("tuesday");
                }
                else{
                    if(x==3){
                        System.err.println("Wednesday");
                    }
                    else{
                        if(x==4){
                            System.err.println("Thursday");
                        }
                        else{
                            if(x==5){
                                System.err.println("Friday");
                            }
                            else{
                                System.err.println("Saturday");
                            }
                        }
                    }
                }
            }
        }
    }
}
