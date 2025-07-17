
package abstraction;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=(a,b,c)->a+b+c;
		Test t2=(a,b,c)->a*b*c;
		int res1=t1.myFunction(2, 3, 4);
		int res2=t2.myFunction(2, 3, 4);
		System.out.println("addition: "+res1);
		System.out.println("mul: "+res2);
	}

}
