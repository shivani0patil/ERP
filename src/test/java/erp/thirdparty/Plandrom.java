package erp.thirdparty;

public class Plandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nayan";
		String str="";
		
		
		for(int i=0;i<s.length();i++)
		{
			str=s.charAt(i)+str;
		}
		
		System.out.println(str);
		
		if(s.equals(str))
		{
			System.out.println("yes, it is plandrom");
		}
		else
		{
			System.out.println("no, it is not plandrom");
		}
	}

}
