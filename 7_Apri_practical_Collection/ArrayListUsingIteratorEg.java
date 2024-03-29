package april_7_23_COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListUsingIteratorEg {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		
		a1.add("Rose");
		a1.add("SunFlower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("MarGold");
		a1.add("Tulip");
		a1.add("Jasmine");
		a1.add("Orchid");
		a1.add("Lotus");
		a1.add("Lavender");
		
		System.out.println("Traversing using for loop");
		for(int i=0;i<a1.size(); i++) {
		System.out.println(a1.get(i));
		}
		System.out.println("Traversing using for each loop");
		for(String a : a1) {
			System.out.println(a);
		}
		System.out.println("Traversing using for iterator");
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing using for iterator-forward");
		ListIterator<String> itr1 =a1.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Traversing using iterator-backward");
		ListIterator<String> itr2 = a1.listIterator(a1.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		System.out.println("Traversing using forEach()method");
		a1.forEach(a->System.out.println(a));
	}	
}
