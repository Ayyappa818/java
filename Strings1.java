public class Strings1 {
    public static void main(String[] args) {
        String x="ayyappaswamygopisetti";
        int[] ar=new int[21];
        int b=0;
        for(byte i=0;i<=ar.length-1;i++){
            int y=x.charAt(i);
            b=(int)y;
            // System.out.println(b);
            for(int a=0;a<=20;a++){
                ar[i]=b;
            }
        }
        for(int j=0;j<=ar.length-1;j++){
            for(int k=0;k<=ar.length-2;k++){
                if(ar[k]>ar[k+1]){
                    int temp=ar[k];
                    ar[k]=ar[k+1];
                    ar[k+1]=temp;
                }
            }
        }
        for(int l=0;l<=ar.length-1;l++){
            System.err.println(ar[l]);
        }
    }
}
