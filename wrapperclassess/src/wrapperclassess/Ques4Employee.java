package wrapperclassess;

class Employee implements Cloneable {
    int id;
    String name;

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Clone method
    public Employee clone() {
        try {
            return (Employee) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Ques4Employee {
    public static void main(String[] args) {
        // Create original employee
        Employee emp1 = new Employee(1, "Sameer");

        // Clone the employee
        Employee emp2 = emp1.clone();

        // Print before changing
        System.out.println("Before change:");
        System.out.print("Original: ");
        emp1.display();
        System.out.print("Clone   : ");
        emp2.display();

        // Change original employee details
        emp1.name = "Mahesh Babu";

        // Print after changing
        System.out.println("\nAfter changing original:");
        System.out.print("Original: ");
        emp1.display();
        System.out.print("Clone   : ");
        emp2.display();
    }
}