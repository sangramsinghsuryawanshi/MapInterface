/*
 * 5. CamelCase Pattern Matching

Input: arr[] = [ “WelcomeGeek”, “WelcomeToGeeksForGeeks”, “GeeksForGeeks” ], pattern = “WTG” 
Output: WelcomeToGeeksForGeeks 
Explanation: 
There is only one abbreviation for the given pattern i.e., WelcomeToGeeksForGeeks.

Input: arr[] = [ “Hi”, “Hello”, “HelloWorld”, “HiTech”, “HiGeek”, “HiTechWorld”, “HiTechCity”, “HiTechLab” ], pattern = “HA” 
Output: No match found 
Explanation: 
There is no such abbreviation for the given pattern.

 */
package hashMap.com;

import java.util.Scanner;
import java.util.Stack;

public class CamelCasePatternMatching 
{

	public static int isLength(String str,String ptr)
	{
		String sp[]=str.split(str.toUpperCase());
		int cnt=0;
		for(int i=0;i<sp.length;i++)
		{
			for(int j=0;j<sp[i].length();j++)
			{
				for(int k=0;k<ptr.length();k++)
				{
					if(sp[i].charAt(j)==ptr.charAt(k))
					{
						cnt=1;
					}
				}
				if(cnt==1)
				{
					System.out.println(sp[i]);
				}
			}
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str = sc.nextLine();
		System.out.println("Enter given pattern: ");
		String ptr = sc.nextLine();
		CamelCasePatternMatching.isLength(str,ptr);
	}
}