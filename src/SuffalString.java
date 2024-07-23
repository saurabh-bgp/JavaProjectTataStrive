import java.util.Random;

public class SuffalString {
    public static void main(String[] args) {
        String str = "Java Full Stack";
        StringBuilder sb = new StringBuilder();

        String[] words = str.split(" ");
        for (String word : words) {
            sb.append(shuffleWord(word)).append(' ');
        }

        sb.setLength(sb.length() - 1);

        System.out.println(sb.toString());

    }

    private static String shuffleWord(String word) {
        char[] characters = word.toCharArray();
        Random random = new Random();
        for (int i = characters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }

        return new String(characters);
    }
}
