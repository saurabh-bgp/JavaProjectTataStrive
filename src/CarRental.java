import java.util.Scanner;
abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public abstract int calculateRentalCost(int days);
  
    public void displayDetails() {
        System.out.println(brand);
        System.out.println( model);
        System.out.println( year);
    }
}
class Car extends Vehicle {
    private int numberOfSeats;
    public void setnumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    @Override
    public int calculateRentalCost(int days) {
        return days * 100;
    }
}
class SUV extends Vehicle{
    private int bootCapacity;
    public void setbootCapacity(int bootCapacity) {
        this.bootCapacity = bootCapacity;
    }
    public int getBootCapacity() {
        return bootCapacity;
    }
    @Override
    public int calculateRentalCost(int days){
        return days*200;
    }
}
public class CarRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car=new Car();
        SUV suv =new SUV();
        System.out.println("Enter the number of days");
        int n=sc.nextInt();
        System.out.print("The Rental cost of Car for 5 days : ");
        int c=car.calculateRentalCost(n);
        System.out.println(c);
        System.out.print("The Rental cost of SUV for 5 days : ");
        int s=suv.calculateRentalCost(n);
        System.out.println(s);
    }
}