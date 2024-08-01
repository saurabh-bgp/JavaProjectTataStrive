import java.util.Scanner;

public class Employs {
    private int id;
    private String name;
    private String destination;
    private byte age;
    private String contactNumber;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public byte getAge() {
        return age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String toString() {
        return "Id : " + id + "\nName : " + name + "\nDestination : " + destination + "\nAge: " + age + "\nContact Number : " + contactNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int empNo = sc.nextInt();
        sc.nextLine();

        Employs[] employees = new Employs[empNo];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employs();

            System.out.println("Enter ID:");
            employees[i].setId(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter Name:");
            String empName = sc.nextLine();
            if (empName.length() > 3 && empName.length() < 15) {
                employees[i].setName(empName);
            } else {
                System.out.println("Enter a valid name (4-14 characters).");
                break;
            }

            System.out.println("Enter Destination (Manager/HR/IT):");
            String empDes = sc.nextLine();
            if (empDes.equals("Manager") || empDes.equals("HR") || empDes.equals("IT")) {
                employees[i].setDestination(empDes);
            } else {
                System.out.println("Enter a valid Destination (Manager/HR/IT).");
                break;
            }

            System.out.println("Enter Age:");
            int empAge = sc.nextByte();
            if (empAge > 18 && empAge < 60) {
                employees[i].setAge((byte) empAge);
            } else {
                System.out.println("Enter a valid Age (19-59).");
                break;
            }

            sc.nextLine();

            System.out.println("Enter Contact Number:");
            String empCon = sc.nextLine();
            if (empCon.length() == 10 && (empCon.charAt(0) == '9' || empCon.charAt(0) == '8' || empCon.charAt(0) == '7' || empCon.charAt(0) == '6')) {
                employees[i].setContactNumber(empCon);
            } else {
                System.out.println("Enter a valid Contact Number (10 digits starting with 9, 8, 7, or 6).");
                break;
            }
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        sc.close();
    }
}
