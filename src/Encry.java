public class Encry {
    static void cipher(String str, byte key, byte encrRod){
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i)-0;
            for (int j = 0; j < (encrRod*key); j++) {
                a++;
                if (a>122){
                    a=97;
                } else if (a>90 && a<65) {
                    a=65;
                }
            }
            char c = (char) a;
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        String str = "yz";
        byte key = 2;
        byte encrRod = 2;
        cipher(str, key, encrRod);

    }
}
