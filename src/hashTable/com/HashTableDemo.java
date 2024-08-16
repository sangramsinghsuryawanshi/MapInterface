package hashTable.com;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableDemo 
{
	public static void isDemo(Hashtable<Integer, String> lhm)
	{
		System.out.println("Hashtable Demo: "+lhm);
	}
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> lhm = new Hashtable<Integer, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int k = sc.nextInt();
		System.out.println("Enter key and value: ");
		for(int i=0;i<k;i++)
		{
			lhm.put(sc.nextInt(), sc.next());
		}
		isDemo(lhm);
	}
}
