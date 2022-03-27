public class Employee { //Superclass

    private String name;
    private int salary;
    private String department;

    //constructor
    public Employee(String name, int salary,String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void work(){
        System.out.println("Employee is working...");
    }

    public void showInformation(){
        System.out.println("Name: "+name);
        System.out.println("Salary:"+salary);
        System.out.println("Department:"+department);
    }

    public void change_department(String new_department){
        System.out.println("Department is changing...");
        this.department = new_department;
        System.out.println("New department: "+this.department);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
