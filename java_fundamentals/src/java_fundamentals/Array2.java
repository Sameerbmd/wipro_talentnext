package java_fundamentals;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		int[] arr =new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max =arr[0];	
		int min =arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
