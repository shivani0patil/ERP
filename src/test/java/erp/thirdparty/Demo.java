package erp.thirdparty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {
	
	public static int rev(String num)
	{
		String[] str=num.split(",");
		String n1=str[str.length-1];
		int max=Integer.parseInt(n1);
		
		for(int i=0;i<str.length;i++)
		{
			int temp=0;
			
			
			String n2=str[i];
			int n3=Integer.parseInt(n2);
			if(max<n3)
			{
				temp=n3;
				n3=max;
				max=temp;
			}
		}
		return max; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="dheeraj";
//		String n="";
//		int len=name.length();
////		for(int i=len-1;i>=0;i--)
////		{
////			char ch=name.charAt(i);
////			System.out.print(ch);
////		}
//		
//		String [] ar=name.split("");
//		String str="";
//		for(int i=0;i<ar.length;i++)
//		{
//			str=ar[i]+str;
//		}
//		 System.out.println(str);
		
		//remove duplicates
//		int cunt;
//		char[] ch=name.toCharArray();
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			for(int j=i+1;j<ch.length;j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					ch[j]='i';
//				}
//				
//				}
//			}
//		
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]!='i')
//			{
//				System.out.println(ch[i]);
//			}
//		}
		
		
		//lower case and Uppercase
//		String name2="i Am ShiVaNi";
//		String[] s=name2.split(" ");
//		
//		int lcount=0;
//		int Ucount=0;
//		for(int j=0;j<s.length;j++)
//		{
//			String str=s[j];
//			char[] ch=str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			
//			if(ch[i]>=65&&ch[i]<=90)
//			{
//				Ucount++;
//			}
//			else
//			{
//				lcount++;
//			}
//		}
//		}
//		
//		System.out.println("lower"+lcount);
//		System.out.println("upper"+Ucount);
		
		//convert lower to upper
		
//		String input="Listen";
//		String s="";
//		char 
//		chh=0;
//		char[] ch=input.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]>=65&&ch[i]<=90)
//			{
//				chh=(char)(ch[i]+32);
//			}
//			else if(ch[i]>=97&&ch[i]<=122)
//			{
//				chh=(char)(ch[i]-32);
//			}
//		 s+=chh;
//		}
//		System.out.print(s);
		
		//minimum and lowest
//		int[] a= {1,3,9,6,2,7};
//		int max=a.length-1;
//		int min=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			int temp=0;
//			if(max<a[i])
//			{
//				temp=a[i];
//				a[i]=max;
//				max=temp;
//				
//			}
//		}
		
//		System.out.println(max);
//		for(int i=0;i<a.length;i++)
//		{
//			int temp=0;
//			if(min>a[i])
//			{
//				temp=a[i];
//				a[i]=min;
//				min=temp;
//				
//			}
//		}
//		System.out.println(min);
	

//	String s="a am i Student";
//	String[] ss=s.split(" ");
//	String lowest=ss[0];
//	String lar="";
//	for(int i=0; i<ss.length;i++)
//	{
//	  if(ss[i].length()>lar.length())	
//	  {
//		  lar=ss[i];
//	  }
//	  else if(ss[i].length()<lowest.length())
//	  {
//		  lowest=ss[i];
//	  }
//	}
//	System.out.println(lar);
//	System.out.println(lowest);
		
    String number="1,50,30,20,40";
    int max=rev(number);
    System.out.println("maximun"+max);
    
    
    // Use the reverse() method to reverse the string
   
	}
}
