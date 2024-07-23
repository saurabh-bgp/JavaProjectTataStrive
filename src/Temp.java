import java.util.StringTokenizer;

public class Temp {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        StringTokenizer stringTokenizer = new StringTokenizer(s, ".");
        int ctn = stringTokenizer.countTokens();
        String[] str = new String[ctn];
        int i = 0;


        while (stringTokenizer.hasMoreTokens()) {
            str[i] = stringTokenizer.nextToken();
            i++;
        }
        int st = 0;
        int ed = str.length - 1;
        while (st < ed) {
            String temp = str[st];
            str[st] = str[ed];
            str[ed] = temp;
            st++;
            ed--;
        }

        StringBuilder ret = new StringBuilder();
        for (i = 0; i < str.length; i++) {
            ret.append(str[i]);
            if (i < str.length - 1) {
                ret.append(".");
            }
        }

        System.out.print(ret.toString());
    }
}
