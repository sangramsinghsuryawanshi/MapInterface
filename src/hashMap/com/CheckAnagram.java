/*
 * Write a function to check if two strings are anagrams of each 
 * other using a HashMap.
 */
package hashMap.com;

import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str=sc.nextLine();
		System.out.println("Enter given string: ");
		String str1=sc.nextLine();
		if(isAnagram(str,str1))
		{
			System.out.println("is anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
		public static boolean isAnagram(String str,String str1)
		{
			if(str.length()!=str1.length())
			{
				return false;
			}
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
			for(char c: str.toCharArray())
			{
				hm.put(c, hm.getOrDefault(c, 0)+1);
			}
			System.out.println(hm);
			for(char c1: str1.toCharArray())
			{
				h1.put(c1, h1.getOrDefault(c1, 0)+1);
			}
			return hm.equals(h1);
		}

}
