import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employe {
    private int id;
    private String name;
    private String deg;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", name='" + name + '\'' + ", deg='" + deg + '\'' + ", salary=" + salary + '}';
    }
}

class EmpUtil {


    static void addRec(int id, String name, String deg, long salary,List<Employe> employeList) {
        for (Employe e : employeList) {
            if (e.getId() == id) {
                System.out.println("Employee with ID " + id + " already exists. Cannot add duplicate.");
                return;
            }
        }
        Employe e = new Employe();
        e.setId(id);
        e.setName(name);
        e.setDeg(deg);
        e.setSalary(salary);
        employeList.add(e);
        System.out.println("Employee added: " + e);
    }

    static void printAllRec(List<Employe> employeList) {
        if (employeList.isEmpty()) {
            System.out.println("No records to display.");
        } else {
            for (Employe e : employeList) {
                System.out.println(e);
            }
        }
    }

    static void updateEmp(int id, String name, String deg, long salary,List<Employe> employeList) {
        for (Employe e : employeList) {
            if (e.getId() == id) {
                e.setName(name);
                e.setDeg(deg);
                e.setSalary(salary);
                System.out.println("Employee updated: " + e);
                break;
            }
        }
    }

    static void deleteWithId(int id, List<Employe> employeList) {
        Iterator<Employe> iterator = employeList.iterator();

        while (iterator.hasNext()) {
            Employe e = iterator.next();
            if (e.getId() == id) {
                iterator.remove();
                System.out.println("Employee with ID " + id + " deleted.");
                break;
            }else {
                System.out.println("ID not present.");
            }
        }
    }
}

public class EmpApp {
    public static void main(String[] args) {
       List<Employe> employeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String ch;

        do {
            try {
                System.out.println("Enter 1 for Add/Update Records, 2 for Print All Records, 3 for Update Employee Data, 4 for Delete With Id.");
                int inp = sc.nextInt();

                switch (inp) {
                    case 1: {
                        System.out.println("Id");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Name");
                        String name = sc.nextLine();
                        if (name.isEmpty()) {
                            System.out.println("Name cannot be empty.");
                            break;
                        }
                        System.out.println("Deg");
                        String deg = sc.nextLine();
                        if (deg.isEmpty()) {
                            System.out.println("Degree cannot be empty.");
                            break;
                        }
                        System.out.println("Salary");
                        long salary = sc.nextLong();
                        if (salary <= 0) {
                            System.out.println("Salary must be positive.");
                            break;
                        }
                        EmpUtil.addRec(id, name, deg, salary,employeList);
                        break;
                    }
                    case 2: {
                        System.out.println("\nAll Employees:");
                        EmpUtil.printAllRec(employeList);
                        break;
                    }
                    case 3: {
                        System.out.println("ID");
                        int id = sc.nextInt();
                        sc.nextLine();
                        if (id != employeList.getFirst().getId()) {
                            System.out.println("Id not found");
                            break;
                        } else {
                            System.out.println("Name");
                            String name = sc.nextLine();
                            if (name.isEmpty()) {
                                System.out.println("Name cannot be empty.");
                                break;
                            }
                            System.out.println("Deg");
                            String deg = sc.nextLine();
                            if (deg.isEmpty()) {
                                System.out.println("Degree cannot be empty.");
                                break;
                            }
                            System.out.println("Salary");
                            long salary = sc.nextLong();
                            if (salary <= 0) {
                                System.out.println("Salary must be positive.");
                                break;
                            }
                            EmpUtil.updateEmp(id, name, deg, salary, employeList);
                            System.out.println("\nAll Employees after update:");
                            EmpUtil.printAllRec(employeList);
                            break;
                        }
                    }
                    case 4: {
                        System.out.println("ID");
                        int id = sc.nextInt();
                        if (id != employeList.getFirst().getId()){
                            System.out.println("Id is not present");
                        }else {
                            EmpUtil.deleteWithId(id, employeList);
                            System.out.println("\nAll Employees after deletion:");
                            EmpUtil.printAllRec(employeList);
                            break;
                        }
                    }
                    default: {
                        System.out.println("Invalid option, please try again.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
                sc.nextLine();
            }

            System.out.println("Enter 'y' to continue with more operations or any other key to exit");
            ch = sc.next();
            sc.nextLine();

        } while (ch.charAt(0) == 'y' || ch.charAt(0) == 'Y');

        sc.close();
    }
}
