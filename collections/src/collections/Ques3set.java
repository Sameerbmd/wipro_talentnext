package collections;

import java.util.*;
public class Ques3set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		ts.add("mahesh Babu");
		ts.add("ntr");
		ts.add("balayya");
		ts.add("bhAAi");
		ts.add("cherry");
		NavigableSet<String> r = ts.descendingSet();
		System.out.println(r);
		Iterator i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		String check="ntr";
		if(ts.contains(check)) {
			System.out.println("exist");
		}else {
			System.out.println("not exist");
		}
	}

}