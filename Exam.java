public class Exam {
// Write a program to find all integer between 100 and 500 whose sum of digits is 5 
// Ex: 104,113,122,131,140,203,212,221,230,302,311,320,401,410,500
    public static void main(String[] args) {
        for(int i=100;i<=500;i++){
            int sum=0;
            int num=i;
            while (num>0) {
                int rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            if(sum==5){
            System.err.println(i);
            }
        }
    }
}
