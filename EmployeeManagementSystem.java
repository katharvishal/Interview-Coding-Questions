abstract class Employee{
    private String Name;
    private int Id;
    private double salary;

    public Employee(String Name, int Id, double salary){
        this.Name = Name;
        this.Id = Id;
        this.salary = salary;
    }

    public String getName(){
        return Name;
    }
    public int getId(){
        return Id;
    }
    public double getSalary(){
        return salary;
    }

    abstract void displayInfo();
}

class developer extends Employee{
    private String Domain;

    public developer(String Name, int Id, double salary, String Domain){
        super(Name, Id, salary);
        this.Domain = Domain;
    }

    public String getDomain(){
        return Domain;
    }

    @Override
    public void displayInfo(){
        System.out.println("Tester name : " + getName());
        System.out.println("Tester ID : " + getId());
        System.out.println("Tester Salary : " + getSalary());
        System.out.println("Tester Domain : " + getDomain());
    }
}

class tester extends Employee{
    private String ProjectName;

    public tester(String Name, int Id, double salary, String ProjectName){
        super(Name, Id, salary);
        this.ProjectName = ProjectName;
    }

    public String getProjectName(){
        return ProjectName;
    }

    @Override
    public void displayInfo(){
        System.out.println("Developer name : " + getName());
        System.out.println("Developer ID : " + getId());
        System.out.println("Developer Salary : " + getSalary());
        System.out.println("Developer ProjectName : " + getProjectName());
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee employee1 = new developer("Vishal", 110, 250000.00, "IT");
        
        employee1.displayInfo();
    }
}
