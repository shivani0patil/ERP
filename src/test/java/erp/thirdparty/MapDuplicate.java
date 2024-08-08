package erp.thirdparty;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDuplicate {

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
				
		for(Entry<Character, Integer> e:mp.entrySet())
		{
			//System.out.println(e.getKey());
			if(e.getValue()>1)
			{
				//mp.put(e.getKey(),1);
			System.out.println(e.getKey());
			}
			
		}
		
		

	}

}
