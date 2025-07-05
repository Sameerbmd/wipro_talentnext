package java_fundamentals;
import java.util.*;
public class Question16 {
	public static void main(String[] args) {


        for (int num = 10; num <= 99; num++) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                // Check divisibility from 2 to num/2
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
