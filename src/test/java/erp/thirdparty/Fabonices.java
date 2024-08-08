package erp.thirdparty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Fabonices {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int first=0;
		int scond=1;
		int third;
	
		System.out.println(first);
		System.out.println(scond);
		
		for(int i=0;i<10;i++)
		{
			third=first+scond;
			first=scond;
			scond=third;
			System.out.println(third);
			//System.out.println(scond);
			
		}
		
		   
	}
}
