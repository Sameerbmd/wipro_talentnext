package java_fundamentals;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		int sum=0;
		for (int i=0;i < arr.length;i++) {
			sum +=arr[i];
		}
		int avg = sum/arr.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
