package java_fundamentals;
import java .util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char A = sc.next().charAt(0);
		if (Character.isDigit(A)) {
			System.out.println("Digit");
		}
		else if (Character.isLetter(A)) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special character");
		}
	}

}
