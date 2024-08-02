import java.io.*;
import java.util.Scanner;

public class BufferedOutStr {

    static void writeFileBuff(String str, String filePath) {
        try (OutputStream os = new FileOutputStream(filePath);
             BufferedOutputStream bos = new BufferedOutputStream(os)) {
            bos.write(str.getBytes());
            System.out.println("Write operation ho gya hai.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFileBuff(String filePath) {
        try (InputStream is = new FileInputStream(filePath);
             BufferedInputStream bis = new BufferedInputStream(is)) {
            if (bis.available() > 0) {
                int i = bis.read();
                while (i != -1) {
                    System.out.print((char) i);
                    i = bis.read();
                }
            } else {
                System.out.println("File Khali hia bhai.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to read a file and 2 to write to a file.");
        int inp = sc.nextInt();
        sc.nextLine();
        if (inp == 1) {
            readFileBuff("D:\\demoFil.txt");
        } else if (inp == 2) {
            System.out.println("Enter the string to write to the file:");
            String str = sc.nextLine();
            writeFileBuff(str, "D:\\demoFil.txt");
        } else {
            System.out.println("Wrong entered please check.");
        }

        sc.close();
    }
}
