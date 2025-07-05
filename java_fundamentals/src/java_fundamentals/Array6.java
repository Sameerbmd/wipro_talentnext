package java_fundamentals;
import java.util.*;
public class Array6 {
	    public static void main(String[] args) {
	        if (args.length != 9) {
	            System.out.println("Please enter exactly 9 integer numbers as command line arguments.");
	            return;
	        }

	        int[][] arr = new int[3][3];
	        int index = 0;

	        // Fill 3x3 array with command line arguments
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                arr[i][j] = Integer.parseInt(args[index]);
	                index++;
	            }
	        }

	        // Find biggest number
	        int max = arr[0][0];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (arr[i][j] > max) {
	                    max = arr[i][j];
	                }
	            }
	        }

	        System.out.println("The biggest number in the 3x3 array is: " + max);
	    }
	}


