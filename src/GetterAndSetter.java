import java.util.Arrays;

public class GetterAndSetter {
    private String brand;
    private byte ram;
    private String[] addFeatures;


    public void setBrand(String b) {
        brand = b;
    }

    public String getBrand() {
        return brand;
    }

    public void setRam(byte r) {
        ram = r;
    }

    public byte getRam() {
        return ram;
    }
    public void setAddFeatures(String[] arr){
        addFeatures = arr;
    }
    public String[] getAddFeatures(){
        return addFeatures;
    }
}
   class Maint{
       public static void main(String[] args) {
            GetterAndSetter xt= new GetterAndSetter();
//           xt.brand = "Vivo";
//           xt.ram=8;
            xt.setBrand("Realme");
            xt.setRam((byte)8);

            String arr[] ={"Ram", "Shyam", "Geeta","Saurabh", "Sohan"};
            xt.setAddFeatures(arr);

            System.out.println(xt.getBrand() + "\n"+xt.getRam()+"\n");
//            for (int i=0;i<arr.length;i++){
//               System.out.println(xt.getAddFeatures()[i]);
//           }

          System.out.println( Arrays.toString(xt.getAddFeatures()));


       }
   }


