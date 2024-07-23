    public class MobileToString {
    String mobileName;
    int modelNumber;
    int mobileStorage;
    byte ram;
    float screenSize;
    String processar;
    int camera;
    String color;
    String brandModel;
    String oS;
    String chargingPort;
    int batteryCap;
    public String toString(){
        return "Mobile Name : "+mobileName+"\nModel Number : "+modelNumber+"\nMobile Storage : "+mobileStorage+" GB"+"\nRam : "+ram+" GB"
                +"\nScreen Size : "+screenSize+" inch"+"\nProcessor : "+processar+"\nCamera : "+camera+" MP"+"\nColor : "
                +color+"\nBrand Model : "+brandModel+"\nOS : "+oS+"\nCharging Port"+chargingPort+"\nBattery Cap : "+batteryCap+" mah"+"\n";
    }

}
