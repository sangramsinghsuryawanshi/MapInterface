package hashMap.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class OccurenceOfWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		System.out.println("Enter given string: ");
		String str=sc.nextLine();
		String [] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(hm.containsKey(s[i]))
			{
				hm.put(s[i], hm.get(s[i])+1);
			}
			else
			{
				hm.put(s[i], 1);
			}
		}
		for(Entry<String, Integer> ent: hm.entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}

}
