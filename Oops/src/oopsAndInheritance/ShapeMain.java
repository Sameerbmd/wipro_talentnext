package oopsAndInheritance;



class Shape{

	void draw() {
		System.out.println("Drwaing Shape");
	} 
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing triangle");
	}
	@Override
	void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing circle");
	}
	@Override
	void erase() {
		System.out.println("Erasing circle");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Square");
	}
	@Override
	void erase() {
		System.out.println("Erasing Square");
	}
}


public class ShapeMain {
	public static void main(String args[]) {
	Shape t = new Triangle();
	Shape c = new Circle();
	Shape s = new Square();
	t.draw();
	t.erase();
	c.draw();
	c.erase();
	s.draw();
	s.erase();
	}
	
}
