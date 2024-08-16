package hashMap.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMethods 
{
	HashMap<Integer, String> hm;
	public HashMapMethods(HashMap<Integer, String> hm)
	{
		this.hm=hm;
	}
	public void putMethods()
	{
		hm.put(1, "ABC");
		hm.put(23, "XYZ");
		hm.put(45, "LMN");
		hm.put(27, "MNO");
		System.out.println(hm);
	}
	public void keyCount()
	{
		int cnt=0;
		for(Map.Entry<Integer, String> en : hm.entrySet())
		{
			cnt++;
			System.out.print(en.getKey()+" ");
		}
		System.out.println("Count of key value: "+cnt);
	}
	public void copyAll()
	{
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(12, "ABC");
		hm1.put(213, "XYZ");
		hm1.put(145, "LMN");
		hm1.put(217, "MNO");
		hm1.putAll(hm);
		System.out.println("putAll"+hm1);
		hm1.remove(hm);
		System.out.println("remove"+hm1);
	}
	public void keyEmpty()
	{
		if(hm.isEmpty())
		{
			System.out.println("givem map is empty");
		}
		else
		{
			System.out.println("givem map is not empty");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		HashMapMethods h = new HashMapMethods(hm);
		System.out.print("Enter choice1. Write a Java program to associate the specified value with the specified key in a HashMap.\r\n"
				+ "\r\n"
				+ "2. Write a Java program to count the number of key-value (size) mappings in a map.\r\n"
				+ "\r\n"
				+ "3. Write a Java program to copy all mappings from the specified map to another map.\r\n"
				+ "\r\n"
				+ "4. Write a Java program to remove all mappings from a map.\r\n"
				+ "\r\n"
				+ "5. Write a Java program to check whether a map contains key-value mappings (empty) or not.");
		int ch=-1;
		do
		{
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: h.putMethods();
				break;
				
				case 2: h.keyCount();;
				break;
				
				case 3: h.copyAll();;
				break;
				
				case 4: h.keyEmpty();;
				break;
			}	
			
		}while(ch!=0);
	}
}
