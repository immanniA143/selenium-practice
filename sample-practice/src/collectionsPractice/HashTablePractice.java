package collectionsPractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTablePractice {
	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("1", "aravind");
		ht.put("2", "harish");
		ht.put("3", "sr");
		ht.put("4", "ravikanth");
		ht.put("5", "aravind");
		ht.put("1", "immanni");
		ht.put("6", "harish");
		System.out.println(ht);
		System.out.println(ht.get("1"));
		System.out.println(ht.isEmpty());
		System.out.println(ht.size());
		Set<String> keys=ht.keySet();
		for(String key: keys)
			System.out.println("value of  "+key+" is "+ht.get(key));
		HashMap<String,String> submsp=new HashMap<String,String>();
		submsp.put("a1", "lella");
		submsp.put("a2", "rambabu");
		ht.putAll(submsp);
		System.out.println(ht);
		System.out.println(ht.containsKey("a1"));
		System.out.println(ht.containsKey("a3"));
		Set<String> ke=ht.keySet();
		for(String key:ke)
			System.out.println(key);
		
	}

}
