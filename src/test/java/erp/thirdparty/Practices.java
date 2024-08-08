package erp.thirdparty;

import java.util.Arrays;

public class Practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="i am automation engineer";
		String[] ar=name.split(" ");
	for(int j=0;j<3;j++)
		{
					String str=ar[ar.length-1];

		for(int i=ar.length-1;i>=0;i--)
		{
			if(i-1>=0)
			{
				ar[i]=ar[i-1];
			}
		}
		
		ar[0]=str;
		}
		System.out.println(Arrays.toString(ar));

	}

}
