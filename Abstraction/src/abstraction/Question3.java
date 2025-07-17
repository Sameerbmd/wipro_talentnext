package abstraction;

import java.util.Scanner;
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Custom exception for out-of-range values
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nStd=2;
		int nSub=3;
		for(int i=1;i<=nStd;i++) {
			try {
				System.out.println("Enter the name of the student "+i+":");
				String name = sc.nextLine();
				int totalMarks=0;
				for(int j=1;j<=nSub;j++) {
					System.out.println("enter the subject "+j+"marks:");
					String s=sc.nextLine();
					int mark;
					try {
						mark=Integer.parseInt(s);
					}
					catch (NumberFormatException e) {
                        throw new NumberFormatException("Invalid input: Please enter an integer for marks.");
                    }
					 if (mark < 0) {
	                        throw new NegativeValueException("Marks cannot be negative.");
	                    }

	                    if (mark > 100) {
	                        throw new OutOfRangeException("Marks must be between 0 and 100.");
	                    }

	                    totalMarks += mark;
				}
				double average = totalMarks / (double)nSub;
                System.out.println("Average marks for " + name + ": " + average);
			}
			catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            } catch (NegativeValueException e) {
                System.out.println("NegativeValueException: " + e.getMessage());
            } catch (OutOfRangeException e) {
                System.out.println("OutOfRangeException: " + e.getMessage());
            }

            System.out.println();
		}
	}

}