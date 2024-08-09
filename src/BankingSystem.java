import java.util.Scanner;
class Account {
    private float amount;

    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    synchronized void debitAmount(float rupee) {
        if (amount >= rupee) {
            amount -= rupee;
            System.out.println(rupee + " INR/- debited successfully.");
            System.out.println(amount + " INR/- left in your account.");
        } else {
            System.out.println(amount + " is available only.");
        }
    }
    synchronized void creditAmount(float rupee) {
        amount += rupee;
        System.out.println(rupee + " INR/- credited successfully.");
        System.out.println("Available in your account is : "+amount+" INR/-");
    }
}
public class BankingSystem extends Thread {
    static Account ac;
    private float a;
    private boolean isDebit;
    public BankingSystem(float a, boolean isDebit) {
        this.a = a;
        this.isDebit = isDebit;
    }
    public void run() {
        if (isDebit) {
            ac.debitAmount(a);
        } else {
            ac.creditAmount(a);
        }
    }
    public static void main(String[] args) {
        ac = new Account();
        Scanner sc = new Scanner(System.in);
        String ch;

        do {
            System.out.println("Enter 1 to check balance, 2 to credit, or 3 to debit.");
            int val = sc.nextInt();
            if (val == 1) {
                System.out.println("Available balance in your account is: " + ac.getAmount() + " INR/-");
            } else if (val == 2) {
                System.out.println("Enter amount to credit: ");
                float ca = sc.nextFloat();
                BankingSystem bs = new BankingSystem(ca, false);
                bs.start();
            } else if (val == 3) {
                if (ac.getAmount() == 0) {
                    System.out.println("Your account balance is : "+ac.getAmount()+ " INR/- please credit some amount.");
                }else {
                    System.out.println("Enter amount to debit: ");
                    float stNm = sc.nextFloat();
                    BankingSystem bs = new BankingSystem(stNm, true);
                    bs.start();
                }
            }else {
                System.out.println("Wrong input! try again with y.");
            }
            System.out.println("Enter Y for more operations or any other key to exit.");
            ch = sc.next();
        }while (ch.charAt(0) == 'Y' || ch.charAt(0) == 'y');
        sc.close();
    }
}