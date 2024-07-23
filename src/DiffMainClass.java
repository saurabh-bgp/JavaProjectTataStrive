public class DiffMainClass {
    public static void main(String[] args) {
        MobileToString realme = new MobileToString();
        realme.mobileName = "Realme";
        realme.modelNumber = 2332334;
        realme.mobileStorage=128;
        realme.ram=8;
        realme.screenSize=6.5f;
        realme.processar = "Snapdragon 855";
        realme.camera=28;
        realme.color = "Blue";
        realme.brandModel = "Realme X";
        realme.oS = "Android";
        realme.chargingPort="Type C";
        realme.batteryCap = 4500;
        System.out.println(realme);

        MobileToString vivo = new MobileToString();
        vivo.mobileName = "Vivo";
        vivo.modelNumber = 2333334;
        vivo.mobileStorage=64;
        vivo.ram=4;
        vivo.screenSize=5.4f;
        vivo.processar = "Snapdragon 555";
        vivo.camera=16;
        vivo.color = "White";
        vivo.brandModel = "Vivo Y 55l";
        vivo.oS = "Android";
        vivo.chargingPort="Type b";
        vivo.batteryCap = 5500;
        System.out.println(vivo);
    }
}
