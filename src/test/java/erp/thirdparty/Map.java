package erp.thirdparty;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india";
		HashMap<Character,Integer> mp=new HashMap<Character, Integer>();
		//LinkedHashMap
		
		for(int i=0;i<s.length();i++)
		{
			if(mp.containsKey(s.charAt(i)))
			{
				
				 mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
			}
			else
			{
				mp.put(s.charAt(i), 1);			}
		}
		System.out.println(mp);
		
		
	}

}
