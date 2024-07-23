public class Encryption {
    static String cipher(String str, byte key, byte encr){
        char[] ch = str.toCharArray();
        for (int i = 0; i < encr; i++) {
            for (int j = 0; j < ch.length; j++) {
                char tempc = ch[j];
                if (tempc >= 'A' && tempc <= 'Z'){
                    tempc+=key;
                    if (tempc>'Z'){
                        tempc-=26;
                    }
                }
                else if (tempc >= 'a' && tempc <= 'z'){
                    tempc+=key;
                    if (tempc>'z'){
                        tempc-=26;
                    }
                }
                ch[j] = tempc;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "yz";
        byte key = 2;
        byte encrRod = 2;

        System.out.println(cipher(str,key,encrRod));

    }
}
