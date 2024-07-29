public class Strings14 {
    // Take a string and print the position(index) at which a given character occurs. Given string: "edupoly", given character:"p", Expected output: 3
    public static void main(String[] args) {
        String x="edupoly";
        char y='p';
        for(int i=0;i<=x.length()-1;i++){
            if(y==x.charAt(i)){
                System.err.println(i);
            }
        }
    }
}
