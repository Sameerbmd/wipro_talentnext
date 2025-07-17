package collections;

import java.util.*;

public class Ques4set {
	private TreeSet<String> ts;
	public Ques4set() {
		ts=new TreeSet<>();
	}
	public TreeSet<String> saveCountryName(String countryName) {
		ts.add(countryName);
		return ts;
		
	}
	public String getCountry(String countryName) {
		Iterator<String> i=ts.iterator();
		while(i.hasNext()) {
			String s=i.next();
			if(s.equalsIgnoreCase(countryName)){
				return s;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques4set obj=new Ques4set();
		System.out.println(obj.saveCountryName("India"));
		System.out.println(obj.saveCountryName("USA"));
		System.out.println(obj.saveCountryName("Japan"));
		System.out.println(obj.getCountry("usa"));
		System.out.println(obj.getCountry("china"));

	}

}