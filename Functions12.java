public class Functions12 {
    static int c(int a){
        int cubes=(int)Math.pow(a,3);
        return cubes;
    }
    public static void main(String[] args) {
        int cube=c(24);
        System.err.println(cube);
    }
}
