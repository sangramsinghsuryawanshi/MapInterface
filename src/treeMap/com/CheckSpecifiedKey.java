package treeMap.com;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CheckSpecifiedKey 
{
	public static TreeMap<Integer, String> isDemo(TreeMap<Integer, String> tMap,String k)
	{
		if(tMap.containsValue(k))
		{
			System.out.println("Given Value is present");
		}
		else
		{
			System.out.println("Given Value is not present");
		}
		System.out.println("Key");
		for(Entry<Integer, String> ent : tMap.entrySet())
		{
			System.out.println(ent.getKey()+" ");
		}
//		if(tMap.containsKey(k))
//		{
//			System.out.println("Given key present");
//		}
//		else
//		{
//			System.out.println("Given key is not present");
//		}
		TreeMap<Integer, String> tMap1 = new TreeMap<Integer, String>(tMap);
		
		return tMap1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given value: ");
		String v = sc.next();
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(23, "Red");
		tMap.put(60, "Yellow");
		tMap.put(90, "Black");
		tMap.put(11, "White");
		tMap.put(78, "Orange");
		
		System.out.println("Copy: "+isDemo(tMap,v));
	}

}