public class Functions2 {
    static void sortNums(int a, int b,int c){
        // if(a<b)
        //         {
        //             if(a<c)
        //             {
        //             if(b<c)
        //             {
        //                 System.err.println(a+""+b+""+c);
        //             }
        //             else
        //             {
        //                 System.err.println(a+""+c+""+b);
        //             }
        //             }
        //         }
        //         if(b<a)
        //         {
        //             if(c<a)
        //             {
        //                 System.err.println(b+""+c+""+a);
        //             }
        //             else{
        //                 System.err.println(b+""+a+""+c);
        //             }
        //         }
        //         if(c<b)
        //         {
        //             if(a<b)
        //             {
        //             System.err.println(c+""+a+""+b);
        //             }
        //             else
        //             {
        //                 System.err.println(c+""+b+""+a);
        //             }
        //         }
        if(a<b && a<c){
            if(b<c){
                System.err.println(a+","+b+","+c);
            }
            else{
                System.err.println(a+","+c+","+b);
            }
        }
        if(b<a && b<c){
            if(c<a){
                System.err.println(b+","+c+","+a);
            }
            else{
                System.err.println(b+","+a+","+c);
            }
        }
        
        if(c<b && c<a){
            if(a<b){
                System.err.println(c+","+a+","+b);
            }
            else{
                System.err.println(c+","+b+","+a);
            }
        }
        
    }
    public static void main(String[] args) {
        sortNums(45,7,68);
    }
}
