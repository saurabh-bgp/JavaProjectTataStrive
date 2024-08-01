import java.util.Arrays;

public class IsAnagram {
    static boolean anaGram(String a, String b){
        boolean bl = false;
        if (a.length() != b.length()){
            bl=false;
        }else {
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1,ch2)){
                bl=true;
            }else{
                bl= false;
            }
        }
        return bl;
    }
    public static void main(String[] args) {
        String a = "hello";
        
        String b = "llohe";
        System.out.println(anaGram(a,b));
    }
}
