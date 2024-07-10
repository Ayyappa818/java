public class Accumulation10 {
    // Write a program to print the number of factors of 24 using while loop (number of factors for 24 is 8)

    public static void main(String[] args) {
        int x=24;
        int cou=0;
        for(int i=1;i<=24;i++){
            if(x%i==0){
                cou=cou+1;
            }
        }
        System.err.println(cou);
    }
}
