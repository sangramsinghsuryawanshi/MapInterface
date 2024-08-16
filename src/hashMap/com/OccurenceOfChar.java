package hashMap.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfChar 
{
	public static HashMap<Character, Integer> isFre(String str)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("---------------------------------");
		System.out.println("Character\tCount");
		int max=0,min=Integer.MAX_VALUE;
		char ch1='\0',ch2='\0';
		for(Map.Entry<Character, Integer> u: isFre(str).entrySet())
		{
			char chKey=u.getKey();
			int cVal=u.getValue();
			if(cVal>max)
			{
				max=cVal;
				ch1=chKey;
			}
			else if(cVal<min)
			{
				min=cVal;
				ch2=chKey;
			}
			System.out.println(u.getKey()+"\t\t"+u.getValue());
		}
		System.out.println("---------------------------------");
		System.out.println("Max Character\tMax Count");
		System.out.println(ch1+"\t\t"+max);
		
		System.out.println("---------------------------------");
		System.out.println("Max Character\tMax Count");
		System.out.println(ch2+"\t\t"+min);
	}

}
