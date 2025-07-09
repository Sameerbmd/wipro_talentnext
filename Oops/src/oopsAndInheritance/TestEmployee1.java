package oopsAndInheritance;

	import java.util.Optional;

	public class TestEmployee1 {

	    public static void main(String[] args) {
	        Employee1 employee = null;  // Try setting this to new Employee1("John") to test valid case

	        try {
	            Optional.ofNullable(employee)
	                    .orElseThrow(() -> new InvalidEmployee1Exception("Employee1 object is invalid (null)!"));

	            System.out.println("Employee1 is valid!");

	        } catch (InvalidEmployee1Exception e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	}


