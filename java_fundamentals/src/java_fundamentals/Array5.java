package java_fundamentals;
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Take array size
		        System.out.print("Enter number of elements: ");
		        int n = sc.nextInt();

		        int arr[] = new int[n];
		        int result[] = new int[n];
		        int k = 0;

		        // Take array elements
		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // First add even numbers to result array
		        for (int i = 0; i < n; i++) {
		            if (arr[i] % 2 == 0) {
		                result[k] = arr[i];
		                k++;
		            }
		        }

		        // Then add odd numbers to result array
		        for (int i = 0; i < n; i++) {
		            if (arr[i] % 2 != 0) {
		                result[k] = arr[i];
		                k++;
		            }
		        }

		        // Print result
		        System.out.println("Array after rearranging:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(result[i] + " ");
		        }
		    

	}

}
