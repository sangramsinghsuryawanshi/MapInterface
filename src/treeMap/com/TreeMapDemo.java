/*
 * 6. Write a Java program to delete all elements from a Tree Map.

7. Write a Java program to sort keys in a Tree Map by using a comparator.

8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.

9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.

10. Write a Java program to get a reverse order view of the keys contained in a given map.

11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.

12. Write a Java program to get the greatest key less than or equal to the given key.

13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.

14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.

15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
 */
package treeMap.com;

import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo 
{
	TreeMap<Integer, String> lhm;
	TreeMapDemo(TreeMap<Integer, String> lhm)
	{
		this.lhm=lhm;
	}
	public  TreeMap<Integer, String> isDeleted()
	{
		lhm.clear();
		return lhm;
	}
	public  NavigableSet<Integer> isDemo()
	{
		lhm.put(111, "Blue");
		lhm.put(1, "Black");
		lhm.put(34, "Red");
		lhm.put(134, "Yellow");
		lhm.put(334, "Blue1");
		lhm.put(4, "Red1");
		return lhm.descendingKeySet();
	}
	public  NavigableSet<Integer> isAssociated()
	{
		System.out.println("greatest key and the least key in a map: "+lhm.ceilingEntry(35)+" "+lhm.floorEntry(34));
		return lhm.descendingKeySet();
	}
	public  NavigableSet<Integer> isKey()
	{
		System.out.println("first key and the last key in a map: "+lhm.firstEntry()+" "+lhm.lastEntry());
		return lhm.descendingKeySet();
	}
	public  NavigableSet<Integer> isPor()
	{
		int k=lhm.higherKey(1);
		for(Entry<Integer, String> ent : lhm.entrySet())
		{
			if(ent.getKey()>k)
			{
				System.out.println("Portion: "+ent.getKey()+" "+ent.getValue());
			}
		}
		return lhm.descendingKeySet();
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<Integer, String> lhm = new TreeMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int k = sc.nextInt();
		System.out.println("Enter key and value: ");
		for(int i=0;i<k;i++)
		{
			lhm.put(sc.nextInt(), sc.next());
		}
		TreeMapDemo t = new TreeMapDemo(lhm);
		TreeMap<Integer, String> t1 =t.isDeleted();
		System.out.println("Delete all elements from a Tree Map: "+t1);
		NavigableSet<Integer> t2 =t.isDemo();
		System.out.println("sort keys in a Tree Map: "+t2);
		t.isAssociated();
		t.isKey();
		t.isPor();
	}

}
