   @FunctionalInterface
interface CheckGreater{
    int checkNum(int a, int b, int c);
}
public class Lambdaex {
    public static void main(String[] args) {
        CheckGreater cg = (a, b, c)-> {
            if(a>b && a>c) return a;
            else if (b>c ) return b;
            else return c;
        };
        System.out.println( cg.checkNum(6,5,7)+" is greater.");
    }
}
