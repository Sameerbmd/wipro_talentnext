package Miniproject;

import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {
    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }

    private static void addEmployee(Scanner sc) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
             AppendableObjectOutputStream oos = new AppendableObjectOutputStream(fos)) {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, age, salary);
            oos.writeObject(emp);

        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }
    }

    private static void displayEmployees() {
        System.out.println("----\nReport\n-----");

        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                Employee emp = (Employee) ois.readObject();
                System.out.println(emp);
            }

        } catch (EOFException e) {
            System.out.println("----\nEnd of Report\n-----");
        } catch (FileNotFoundException e) {
            System.out.println("No employee records found.");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Custom class to append object to file without writing header again
    private static class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        @Override
        protected void writeStreamHeader() throws IOException {
            File file = new File(FILE_NAME);
            if (file.length() == 0) {
                super.writeStreamHeader(); // Write header only if file is empty
            } else {
                reset();
            }
        }
    }
}