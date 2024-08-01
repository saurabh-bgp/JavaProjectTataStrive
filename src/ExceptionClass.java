
class FileNameInvalid extends Exception{
    FileNameInvalid(){
        super("Invalid File Name. nahi mila file name yaha per koi. ");
    }
}

public class ExceptionClass {
    static boolean checkEmail(String str){
        int ln = str.length();
        if (str.contains("@gmail.com")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a =9;
        int b = 6;
        if (a<b){
            System.out.println("File Created");
        }else {
            try {
                throw new FileNameInvalid();
            }catch (FileNameInvalid e){
                System.out.println("File nahi maila hai yaha per.\n"+e.getMessage());
            }
        }
    }
}
