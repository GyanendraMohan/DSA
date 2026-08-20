package Lab;

public class Employee {
    String name;
    int empId;
    int salary;

    Employee(){
        name = "Gyanendra";
        empId = 1001;
        salary = 12400; 
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        e1.display();
    }
    
}
