// Take a string and check whether a given character is present in the string or not. Given string: "edupoly", given character: 'p', Expected output: true
public class Strings13 {
    public static void main(String[] args) {
      String x="edupoly";
      char y='p';
      for(int i=0;i<=x.length()-1;i++){
        if(y==x.charAt(i)){
            System.out.println(true);
          }
          else{
            System.out.println(false);
          }
      }
    }
}
