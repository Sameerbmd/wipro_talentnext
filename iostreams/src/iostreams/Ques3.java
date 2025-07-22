package iostreams;

import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-arg constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // To print the object
    @Override
    public String toString() {
        return "Employee Details:\n" +
                "Name        : " + name + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "Department  : " + department + "\n" +
                "Designation : " + designation + "\n" +
                "Salary      : " + salary;
    }
}

public class Ques3{
    public static void main(String[] args) {
        // Create an employee object
        Employee emp = new Employee("Sameer", new Date(3905, 9, 01), "IT", "Software Engineer", 75000.0); // Date(YYYY-1900, MM-1, DD)

        // Serialize to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized to 'data' file.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("\nDeserialized Employee Object:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }

}
