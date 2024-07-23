import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets check you eye site.");
        System.out.println("Enter between 1 to 6 numbers ");
        int input = sc.nextInt();
        if (input < 3){
            System.out.println("Your Eyes are very week take care of your eyes.");
        } else if (input >2 && input < 5) {
            System.out.println("Your Eyes are good take care of your eyes.");
        } else if (input <1 || input>6) {
            System.out.println("Enter a valid Number.");
        } else {
            System.out.println("Wow! Your Eyes are very good.");
        }
    }
}
