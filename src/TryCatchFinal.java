import java.util.*;
public class TryCatchFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
