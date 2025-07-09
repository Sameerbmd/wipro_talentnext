package oopsAndInheritance;
import java.util.*;
class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }
	
}
class Book{
	private String name;
	private double price;
	private int qty;
	private Author author;
	Book(String name,double price,int qty,Author author){
		this. name=name;
		this.price=price;
		this.qty=qty;
		this.author=author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String toString() {
		return "Book name "+name+" \n"+"price "+price+"\n"+"qty "+qty+"\n"+author.toString();
	}
	
}

public class Question3Author {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("sameer","sameerbmd0110@gmail.com",'m');
		Book book =new Book("Housefull",2000,5,author);
		System.out.println(book.toString());
		
	}

}
