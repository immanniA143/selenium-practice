package collectionsPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CsvStringMethod {
	public String csvMethod(List<String> list){
		StringBuilder sb=new StringBuilder();
		for(String str:list) {
			if(sb.length()!=0) {
				sb.append(" , ");
			}
			sb.append(str);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		List<String> li1=new ArrayList<String>() {
			{
			this.add("aravind");
			this.add("sidhu");
			this.add("janu");
			}
		};
		CsvStringMethod csv=new CsvStringMethod();
		System.out.println(csv.csvMethod(li1));
		List<String> li2=new ArrayList<String>() {
			{
				this.add("rekha");
				this.add("bhaskr");
				this.add("uma");
				this.add("usha");
			}
		};
		System.out.println(csv.csvMethod(li2));
	}

}
