import java.util.Scanner;

public class MobileStore {
    private String brand;
    private String modelNumber;
    private String color;
    private String price;
    private String ram;
    private String rom;

    public String getBrand() {
        return brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + modelNumber + ", Color: " + color +
                ", Price: " + price + ", RAM: " + ram + ", ROM: " + rom;
    }

    public static void searchMobiles(MobileStore[] mobiles, String searchValue, int searchType) {

        for (MobileStore mobile : mobiles) {
            switch (searchType) {
                case 1:
                    if (mobile.getBrand().equalsIgnoreCase(searchValue)) {
                        System.out.println(mobile);

                    }
                    break;
                case 2:
                    if (mobile.getColor().equalsIgnoreCase(searchValue)) {
                        System.out.println(mobile);

                    }
                    break;
                case 3:
                    if (mobile.getModelNumber().equalsIgnoreCase(searchValue)) {
                        System.out.println(mobile);

                    }
                    break;
                case 4:
                    if (mobile.getPrice().equalsIgnoreCase(searchValue)) {
                        System.out.println(mobile);

                    }
                    break;
                default:
                    System.out.println("Invalid search type");
                    return;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MobileStore[] catMob = new MobileStore[3];
        catMob[0] = new MobileStore();
        catMob[0].setBrand("Nokia");
        catMob[0].setModelNumber("Nokia 8");
        catMob[0].setColor("black");
        catMob[0].setPrice("32000");
        catMob[0].setRam("8GB");
        catMob[0].setRom("128GB");

        catMob[1] = new MobileStore();
        catMob[1].setBrand("Vivo");
        catMob[1].setModelNumber("v19");
        catMob[1].setColor("blue");
        catMob[1].setPrice("24999");
        catMob[1].setRam("8GB");
        catMob[1].setRom("128GB");

        catMob[2] = new MobileStore();
        catMob[2].setBrand("Sony");
        catMob[2].setModelNumber("Xperia");
        catMob[2].setColor("white");
        catMob[2].setPrice("43000");
        catMob[2].setRam("8GB");
        catMob[2].setRom("64GB");

        System.out.println("1. Search by Brand Name\n" + "2. Search by Color\n" + "3. Search by Model Number\n" + "4. Search by Price\n");
        System.out.println("Enter your choice:");
        int srcNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter search value:");
        String searchValue = sc.nextLine();

        searchMobiles(catMob, searchValue, srcNo);

        sc.close();
    }
}
