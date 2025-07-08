package oopsAndInheritance;

public class Question1 {
	double w;
	double b;
	double l;
	Question1(double w,double b,double l){
		this.w=w;
		this.b=b;
		this.l=l;
	}
	double volume() {
		return w*b*l;
	}
class Main{
	public static void main(String args[]) {
		Question1 obj =new Question1(1,2,3);
		double vol = obj.volume();
		System.out.println(vol);
	}
}
}