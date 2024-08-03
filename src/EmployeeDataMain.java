import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee {
    private byte empId;
    private String empName;
    private String gender;
    private byte age;
    private String jobRole;

    public Employee(byte empId, String name, String gender, byte age, String branch) {
        super();
        this.empId = empId;
        this.empName = name;
        this.gender = gender;
        this.age = age;
        this.jobRole = branch;
    }
    public byte getEmpId() {
        return empId;
    }
    public void setEmpId(byte empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public String getJobRole() {
        return jobRole;
    }
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", age=" + age + ", jobRole="
                + jobRole + "]\n";
    }
}



public class EmployeeDataMain {
    static Employee saveEmployee(Employee employee){
        Employee st1 = new Employee(employee.getEmpId(), employee.getEmpName(), employee.getGender(), employee.getAge(), employee.getJobRole());
        return st1;
    }


    public static void main(String[] args) {
        Employee s1 = new Employee((byte)100, "Adarsh", "male", (byte)22, "HR");
        Employee s2 = new Employee((byte)101, "Shasikant", "male", (byte)25, "Developer");
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(new Employee((byte)102, "Raju", "male", (byte)23, "Manager"));
        Collections.addAll(arrayList,
                new Employee((byte)105, "Abhi", "male", (byte)24, "HR"),
                new Employee((byte)106, "Rajesh", "male", (byte)32, "Coder"));


        Iterator<Employee> emp = arrayList.iterator();
        while (emp.hasNext()){
            Employee ep = emp.next();
            if (ep.getEmpName().charAt(0) == 'A'){
                System.out.println(ep);
            }
        }

        arrayList.forEach(fe -> {
            if (fe.getEmpName().charAt(0) == 'A'){
                System.out.println(fe);
            }
        });

    }
}
