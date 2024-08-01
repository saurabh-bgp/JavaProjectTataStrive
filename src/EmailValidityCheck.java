import java.util.Scanner;
class EmptyEmail extends Exception{
    EmptyEmail(){
        super("Empty Email Exception");
        System.out.println("Enter Email.");
    }
}
class EmailExecption extends Exception{
    EmailExecption(){
        super("Wrong Email Error.");
    }
}
public class EmailValidityCheck {
    static boolean checkEmail(String str){
        if (str.contains("@gmail.com")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws EmptyEmail{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() == 0){
            throw new EmptyEmail();
        } else if (checkEmail(str)){
            System.out.println(str);
        }else {
            try {
                throw new EmailExecption();
            }catch (EmailExecption e){
                System.out.println("Worng Email Check again\n"+e.getMessage());
            }
        }
    }
}
