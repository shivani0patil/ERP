package java;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="word";
		String str="";
		
		
		for(int i=0;i<s.length();i++)
		{
			str=s.charAt(i)+str;
		}
		
		System.out.println(str);
	}

}
