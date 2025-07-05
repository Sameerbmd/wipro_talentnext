package java_fundamentals;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char chr = sc.next().charAt(0);
		if (chr == Character.toLowerCase(chr)) {
			System.out.println(chr +" -> "+Character.toUpperCase(chr));
		}
		else {
			System.out.println(chr +" -> "+Character.toLowerCase(chr));
		}
	}

}
