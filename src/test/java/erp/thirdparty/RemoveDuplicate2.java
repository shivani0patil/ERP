package erp.thirdparty;

import java.util.LinkedHashSet;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india";
		LinkedHashSet <Character> sh=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			sh.add(s.charAt(i));
		}
		for(Character ch:sh)
		{
			System.out.println(ch);
		}
		
	}

}
