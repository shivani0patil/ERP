package erp.thirdparty;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="shivi";
		String s2="mahajan";
		
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println(s2);
		s1=s1.substring(s2.length());
		System.out.println(s1);
		
	}

}
