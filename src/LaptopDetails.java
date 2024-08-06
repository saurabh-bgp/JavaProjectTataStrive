import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;

class SearchByName implements Comparator<Laptop>{
    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class SearchByNameRev implements Comparator<Laptop>{
    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class SearchById implements Comparator<Laptop>{
    public int compare(Laptop o1, Laptop o2){
        return o1.getId()-o2.getId();
    }
}
class SearchByIdRev implements Comparator<Laptop>{
    public int compare(Laptop o1, Laptop o2){
        return o2.getId()-o1.getId();
    }
}

class Laptop implements Comparable<Laptop>{
    private String name;
    private String processor;
    private int id;
    private int rom;
    private int ram;
    private String sizeRatio;

    public Laptop(String name, String processor, int id, int rom, int ram, String sizeRatio) {
        this.name=name;
        this.processor=processor;
        this.id=id;
        this.rom=rom;
        this.ram=ram;
        this.sizeRatio=sizeRatio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSizeRatio() {
        return sizeRatio;
    }

    public void setSizeRatio(String sizeRatio) {
        this.sizeRatio = sizeRatio;
    }

    @Override
    public String toString() {
        return "LaptopDetails{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", id=" + id +
                ", rom=" + rom +
                ", ram=" + ram +
                ", sizeRatio='" + sizeRatio + '\'' +
                '}'+"\n";
    }

    @Override
    public int compareTo(Laptop o) {
//        if (ram<o.getRam()){
//            return -1;
//        } else if (ram > getRam()) {
//            return 1;
//        }
        return ram-o.getRam();
    }
}
public class LaptopDetails {
    public static void main(String[] args) {
        LinkedList<Laptop> laptopList = new LinkedList<>();
        Collections.addAll(laptopList,
                new Laptop("asus","intel",6454654,1000,4,"13inch"),
                new Laptop("vivo","corei5",216461852,5,12,"14inch"),
                new Laptop("HP","corei7",2457554,8,8,"14inch")
                );


//        Collections.sort(laptopList,new SearchByName());
        Collections.sort(laptopList,new SearchById());
        Collections.sort(laptopList,new SearchByNameRev());
        Collections.sort(laptopList, new SearchByIdRev());
        System.out.println(laptopList);
        Collections.sort(laptopList);
        System.out.println(laptopList);
    }

}
