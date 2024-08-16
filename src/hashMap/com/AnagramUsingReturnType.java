package hashMap.com;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramUsingReturnType 
{
	public static boolean isAnagram(String str,String str1)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char i:str.toCharArray())
		{
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		for(char i:str1.toCharArray())
		{
			hm1.put(i, hm1.getOrDefault(i, 0)+1);
		}
		return hm.equals(hm1);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str=sc.nextLine();
		System.out.println("Enter given string: ");
		String str1=sc.nextLine();
		if(isAnagram(str, str1)) 
		{
			System.out.println("Given string is anagram");
		}
		else
		{
			System.out.println("Given string is not anagram");
		}
		
	}

}
