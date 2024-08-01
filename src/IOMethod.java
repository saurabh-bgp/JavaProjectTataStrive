import java.io.*;
import java.util.Scanner;

public class IOMethod {

    static void readFile(String filePath) throws IOException {
        try (FileInputStream file = new FileInputStream(filePath)) {
            if (file.available() > 0) {
                int ch = file.read();
                while (ch  != -1) {
                    System.out.print((char) ch);
                    ch = file.read();
                }
            } else {
                throw new IOException("File khali hai");
            }
        }
    }

    static void writeFile(String str) {
        try (OutputStream obj = new FileOutputStream("D:\\demoFil.txt")) {
            obj.write(str.getBytes());
            System.out.println("File created ThankYou.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to read a file and 2 to write to a file.");
        int inp = sc.nextInt();
        sc.nextLine();

        if (inp == 1) {
            readFile("D:\\demoFil.txt");
        } else if (inp == 2) {
            System.out.println("Enter the string to write to the file:");
            String str = sc.nextLine();
            writeFile(str);
        } else {
            System.out.println("Invalid input");
        }
    }
}
