package erp.thirdparty;

public class Amstringnumber {
	
	public static int  power(int num)
	{
	
		int count=0;
		 while(num>0)
		 {
			 count++;
			 num=num/10;
		 }
		 return num;
	}
	
	public static int  findpower(int rem,int base)
	{
	
		int prod=1;
		 for(int i=1;i<=rem;i++)
		 {
			prod=prod*base;
		 }
		 return prod;
	}
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=153;
	        int po=power(num);
	        int sum=0;
	        int temp=num;
	        
	        while(num>0)
	        {
	        	int rem=num%10;
	        	int sqaure=findpower(rem,po);
	        	sum=sum+sqaure;
	        	num=num/10;
	        	
	        }
	       
	        if(temp==sum)
	        {
	        	System.out.println("yes");
	        }
	        else
	        {
	        	System.out.println("no");
	        }
	        
		
	}
	}

 

