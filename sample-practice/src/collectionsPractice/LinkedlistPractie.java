
package collectionsPractice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistPractie{
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("orange");
		ll.add("apple");
		ll.add("goa");
		ll.add("banana");
		Iterator<String> ite=ll.listIterator();
		for(String str: ll)
			System.out.print("\t"+str);
		System.out.println();
		while(ite.hasNext())
			System.out.print("\t"+ite.next());
		System.out.println();
		LinkedList<String> copy= (LinkedList<String>) ll.clone();
		for(String str:copy)
			System.out.print("\t"+str);
		System.out.println();
		List<String> li=new LinkedList<String>();
		li.add("sidhu");
		li.add("bhaskar");
		li.add("rekha");
		ll.addAll(li);
		System.out.println(ll.containsAll(li));
		String [] str=new String[ll.size()];
		ll.toArray(str);
		for(String st: str)
			System.out.print("\t"+st);
		System.out.println();
		List<String> lis=ll.subList(2, 5);
		System.out.println(lis);
		Collections.reverse(ll);
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
	}
}
