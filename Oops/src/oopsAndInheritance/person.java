package oopsAndInheritance;

public class person {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	person(String name ){
		this.name =name;
	}
	public String toString() {
		return name;
	}
}
