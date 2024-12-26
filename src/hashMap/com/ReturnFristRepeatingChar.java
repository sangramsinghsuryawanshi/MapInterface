/*
 * inpput :- swess
output w
 */
package hashMap.com;

import java.util.HashMap;

public class ReturnFristRepeatingChar 
{
	public static void isWrite(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for(Character c:str.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		Character c1='0';
		for(Character c:str.toCharArray()) {
			if(hm.get(c)>1) {
				if(c1=='0') {
					c1=c;
				}
			}
		}
		System.out.println(c1+" ");
	}
	public static void main(String[] args) 
	{
		String str="progr";
		isWrite(str);
	}
}
