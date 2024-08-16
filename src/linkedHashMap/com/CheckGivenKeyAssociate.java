package linkedHashMap.com;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CheckGivenKeyAssociate {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int k = sc.nextInt();
		System.out.println("Enter key and value: ");
		for(int i=0;i<k;i++)
		{
			lhm.put(sc.nextInt(), sc.next());
		}
		System.out.println("Associate with given Key and value: \n"+lhm);
		LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<Integer, String>(lhm);
		System.out.println("Copy of LinkedHashMap: "+lhm1);
		System.out.println("Enter given key: ");
		int k1 = sc.nextInt();
		System.out.println("Enter given value: ");
		String v = sc.next();
		if(lhm.containsKey(k1))
		{
			System.out.println("Given  key is present");
		}
		else
		{
			System.out.println("Given key is not present");
		}
		if(lhm.containsValue(v))
		{
			System.out.println("Given value is present");
		}
		else
		{
			System.out.println("Given value is not present");
		}
		System.out.println("AllKey");
		for(Entry<Integer, String> ent : lhm1.entrySet())
		{
			System.out.println(ent.getKey()+" ");
		}
		System.out.println("Before clear: "+lhm);
		lhm.clear();
		System.out.println("After clear: "+lhm);
		TreeMap<Integer, String> m = new TreeMap<Integer, String>(lhm1);
		System.out.println("greatest key: "+m.lastKey());
		System.out.println("least key: "+m.firstKey());
		
		System.out.println(m.descendingMap());
			
	}

}
