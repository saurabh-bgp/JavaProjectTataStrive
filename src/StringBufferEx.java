import java.util.Scanner;
public class StringBufferEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to compare palindrome : ");
        String str = sc.nextLine();
        StringBuffer sb =  new StringBuffer(str);
        StringBuffer repCr = new StringBuffer();
        StringBuffer noRep = new StringBuffer();
        int s=0;
        int e=sb.length()-1;
        for (int i=0;i<sb.length()-1;i++){
            char ch = sb.charAt(i);
            for (int j=i+1;j<sb.length();j++){
                if (ch == sb.charAt(j)){
                    repCr.append(ch);
                    sb.delete(j,j+1);
                } else if (ch != sb.charAt(j)) {
                    noRep.append(sb.charAt(j));
                }
            }


        }
        String notR = noRep.toString();
        System.out.println("Repet Character is : "+ repCr);
        System.out.println("No Repet Character is : "+ sb);

    }
}
