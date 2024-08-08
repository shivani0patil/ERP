package erp.thirdparty;

public class Reverse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="word";
		String str="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		
		System.out.println(str);
	}

}
