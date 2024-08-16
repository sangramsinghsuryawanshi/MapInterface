/*
 * 6. Write a Java program to get a shallow copy of a HashMap instance.

7. Write a Java program to test if a map contains a mapping for the specified key.

8. Write a Java program to test if a map contains a mapping for the specified value.

9. Write a Java program to create a set view of the mappings contained in a map.

10. Write a Java program to get the value of a specified key in a map.

11. Write a Java program to get a set view of the keys contained in this map.

12. Write a Java program to get a collection view of the values contained in this map.
 */
package hashMap.com;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuationSix 
{
	HashMap<Integer, String> hm;
	public HashMapQuationSix(HashMap<Integer, String> hm)
	{
		this.hm=hm;
	}
	public void shollowCopy()
	{
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(121, "GHI");
		hm1.putAll(hm);
		System.out.println("shallow copy of hashMap obj->hm: "+hm1);
	}
	public void containsKeyAndValue()
	{
		int c=1;
		String s="ABC";
		System.out.println("Key-->"+c);
		System.out.println("value-->"+s);
		if(hm.containsKey(c))
		{
			System.out.println("given key is present");
		}
		else
		{
			System.out.println("given key is not present");
		}
		if(hm.containsValue(s))
		{
			System.out.println("given value is present");
		}
		else
		{
			System.out.println("given value is not present");
		}
		
	}
	public void mapContainsValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given value: ");
		String s=sc.next();
		if(hm.containsValue(s))
		{
			System.out.println("given value is present");
		}
		else
		{
			System.out.println("given value is not present");
		}
	}
	public void mapGetKey()
	{
		hm.get(1);
		System.out.println("get key-->"+hm);
	}
	public void getKey()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given key: ");
		int s=sc.nextInt();
		if(hm.containsKey(s))
		{
			System.out.println("keys contained in this map");
		}
		else
		{
			System.out.println("keys not contained in this map");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "ABC");
		hm.put(23, "XYZ");
		hm.put(45, "LMN");
		hm.put(27, "MNO");
		System.out.println("Enter choice:\n 6. Write a Java program to get a shallow copy of a HashMap instance.\r\n"
				+ "\r\n"
				+ "7. Write a Java program to test if a map contains a mapping for the specified key ;Write a Java program to test if a map contains a mapping for the specified value."
				+ "\r\n"
				+ "\r\n"
				+ "9. Write a Java program to create a set view of the mappings contained in a map.\r\n"
				+ "\r\n"
				+ "10. Write a Java program to get the value of a specified key in a map.\r\n"
				+ "\r\n"
				+ "11. Write a Java program to get a set view of the keys contained in this map.\r\n"
				+ "\r\n"
				+ "12. Write a Java program to get a collection view of the values contained in this map.");
		System.out.println("hm hashMap: "+hm);
		HashMapQuationSix h = new HashMapQuationSix(hm);
		System.out.println("------------------------------------------------------------------------------------------");
		int ch=-1;
		do 
		{
			System.out.println("Enter choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 6: h.shollowCopy();
					break;
				
				case 7: h.containsKeyAndValue();
					break;
					
				case 9: h.mapContainsValue();
					break;
					
				case 10: h.mapGetKey();
					break;
					
				case 11: h.getKey();
				break;
			}
		}while(ch!=0);
	}
}
