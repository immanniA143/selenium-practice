package collectionsPractice;

import java.util.LinkedList;

public class CsvLinkedList {
	public String csvMethod(LinkedList<String> ll) {
		StringBuilder sb=new StringBuilder();
		for(String str: ll) {
			if(sb.length()!=0)
				sb.append(" , ");
			sb.append(str);
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>() {
			{
				this.add("orange");
				this.add("apple");
				this.add("goa");
				this.add("banana");
				this.add("grape");
			}
		};
		CsvLinkedList csv=new CsvLinkedList();
		System.out.println(csv.csvMethod(ll));
	}
	

}
