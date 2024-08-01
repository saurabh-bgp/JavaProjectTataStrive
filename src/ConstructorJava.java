
class Parent
{
    private String name;
    private byte age;
    private int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Parent() {
        System.out.println("this is the parent class constructor");
    }

    void printParent() {
        System.out.println("Name : "+getName()+"\nID : "+getId()+"\nAge : "+getAge());
    }

    Parent(String name, byte age,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
}
class Child extends Parent {
    private int salary;

    Child(){
        super();
        System.out.println("this is child class constructor");
    }
    Child(String name, byte age,int salary, int id)
    {
        super();
        this.salary=salary;
        this.setAge(age);
        this.setName(name);
        this.setId(id);
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    void printStatement() {
        super.printParent();
        System.out.println("Salary :"+getSalary()+"\n");
    }
}
public class ConstructorJava {
    public static void main(String[] args) {
        Child e1 = new Child();
        e1.setName("Saurabh Kumar");
        e1.setId(121);
        e1.setAge((byte)24);
        e1.setSalary(45000);
        e1.printStatement();

        Child e2 = new Child("Vishal Singh",(byte)26,55000,122);
        e2.printStatement();
    }
}