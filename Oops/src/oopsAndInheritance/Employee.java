package oopsAndInheritance;

public class Employee extends person{
	private double salary;
	private int year;
	private String insNo;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsNo() {
		return insNo;
	}
	public void setInsNo(String insNo) {
		this.insNo = insNo;
	}
	public Employee(String name ,double salary, int year, String insNo) {
		super (name);
		this.salary = salary;
		this.year = year;
		this.insNo = insNo;
	}
	public String toString() {
		return super.toString()+"\n"+salary+"\n"+year+"\n"+insNo;
	}
	
}
