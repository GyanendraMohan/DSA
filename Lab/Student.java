package Lab;

public class Student {
    String name;
    int rollNo;
    String branch;

    Student(){
        name = "Gyanendra";
        rollNo = 7;
        branch = "DA"; 
    }

    public static void main(String[] args) {
        
        Student s1 = new Student();
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Branch: " + s1.branch);
    }

}


