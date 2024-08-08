package erp.thirdparty;

public class Demo2 {
	
	public static int rev(String num)
	{
		String[] str=num.split(",");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			
			 arr[i]=Integer.parseInt(str[i]);
			 
			 
		}
	
		
	   int higest=0;
	 //  System.out.println(higest);
	   int second=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   //int j=arr[i];
		   if(arr[i]>higest)
		   {
			   
			  second= higest;
			  higest=arr[i];
		   }
		   else if(arr[i]>second&&arr[i]!=higest)
		   {
			   second=arr[i];
		   }
		  //
		   System.out.println("h===="+higest);
	   }
		//System.out.println(arr[arr.length-2]);
	    
		
		return second;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number="55,300,100,200,67";
//		String[] str=number.split(",");
//		int[] arr=new int[str.length];
//		for(int i=0;i<str.length;i++)
//		{
//			
//			 arr[i]=Integer.parseInt(str[i]);
//		}
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				int temp=0;
//				if(arr[i]>arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr[arr.length-2]);
		
		
	System.out.println(rev(number));
		
	}

}
