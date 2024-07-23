public class Mobile {
    static String mobileName;
    static int modelNumber;
    static int mobileStorage;
    static byte ram;
    static float screenSize;
    static String processar;
    static int camera;
    static String color;
    static String brandModel;
    static String oS;
    static String chargingPort;
    static int batteryCap;


    public static void main(String[] args) {
        Mobile Realme = new Mobile();
        Realme.mobileName = "Realme";
        Realme.modelNumber = 233542354;
        Realme.mobileStorage=128;
        Realme.ram=8;
        Realme.screenSize=6.5f;
        Realme.processar = "Snapdragon 855";
        Realme.camera=28;
        Realme.color = "Blue";
        Realme.brandModel = "Realme X";
        Realme.oS = "Android";
        Realme.chargingPort="Type C";
        Realme.batteryCap = 4500;



        System.out.println("Mobile Name : "+Realme.mobileName);
        System.out.println("Model Number : "+Realme.modelNumber);
        System.out.println("Mobile Storage : "+Realme.mobileStorage +" GB");
        System.out.println("Ram : "+Realme.ram+" GB");
        System.out.println("Screen Size : "+Realme.screenSize+" inch");
        System.out.println("Processor : "+Realme.processar);
        System.out.println("Camera : "+Realme.camera+" MP");
        System.out.println("Color : "+Realme.color);
        System.out.println("Modle : "+Realme.brandModel);
        System.out.println("OS : "+Realme.oS);
        System.out.println("Charging Port : "+Realme.chargingPort);
        System.out.println("Battery Cap : "+Realme.batteryCap+" mah");

    }
}
