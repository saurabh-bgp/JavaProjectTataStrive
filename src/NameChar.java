public class NameChar {
    public static void main(String[] args) {
        String[] names = {"yadvendra", "gautam", "utkarsh", "ayush", "abhishek", "bhavya", "ansu", "yadav", "saurabh", "aman", "aruneet", "sarthak", "sourabh", "sanchit"};
        char start = 'a';
        char end = 'z';
        int len = names.length;

        while (start <= end) {
            String[] printArr = new String[len];
            int j = 0;

            for (int i = 0; i < len; i++) {
                String ch = names[i];
                char ft = ch.charAt(0);
                char ftC = Character.toUpperCase(ft);
                if (ft == start) {

                    String str = ftC + ch.substring(2);
                    printArr[j] = str;
                    j++;
                }
            }

            if (j > 0) {
                for (int k = 0; k < j - 1; k++) {
                    System.out.print(printArr[k] + ", ");
                }
                System.out.println(printArr[j - 1]);
            }

            start++;
        }

    }
}
