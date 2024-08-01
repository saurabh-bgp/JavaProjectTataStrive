//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.OutputStream;

public class FileIOClas {
//    static OutputStream obj;
    public static void main(String[] args) {
        OutputStream obj = null;
        try {
          obj = new FileOutputStream("D:\\demoFil.txt");
            System.out.println("File Created");
            obj.write("Hello how are you ?".getBytes());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }finally {
                try {
                        obj.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
        }
    }
}
