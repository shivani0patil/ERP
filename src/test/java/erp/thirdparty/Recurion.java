package erp.thirdparty;

public class Recurion {

	public static void revers(String s,int i)
	{
		if(i>=0)
		{
		 System.out.println(s.charAt(i--));
		 revers(s,i);
		}
		
		//String str="";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="welcome";
		int m=name.length()-1;
		revers(name,m);
		 
	}

}
