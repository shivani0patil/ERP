package erp.generic.listener;

import erp.generic.webutility.UitilityClassObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import erp.generic.fileUtility.*;
import erp.generic.Database.*;
import erp.generic.ObjectRepository.HomePage;
import erp.generic.ObjectRepository.LoginPage;

public class BaseClass {
	PropertyUtility p=new PropertyUtility();
	 public WebDriver driver=null;
	static  WebDriver  sdriver;
	
	
	@BeforeMethod(groups="smokeTest")
	public void configBm() throws Throwable
	{
		System.out.println("login ===");
		//String Url=p.getDataProperty("url");
		String Url="http://49.249.28.218:8889/dolibarr";
		String Username=p.getDataProperty("username");
		String Password=p.getDataProperty("password");
		driver.get(Url);
		LoginPage l=new LoginPage(driver);
		l.Login(Username, Password);
	}

	@AfterMethod(groups="smokeTest")
	public void configAm()
	{
		HomePage h=new HomePage(driver);
		h.Logout();
	
	
	}
	
	//@Parameters("BROWSER")
	@BeforeClass(groups="smokeTest")
	public void confiBC() throws Throwable
	{
		System.out.println("lancu browser");
		String Browser=p.getDataProperty("browser");
		//String Browser=browser;
		
	     if(Browser.equals("chrome"))
	     {
	    	 driver=new ChromeDriver();
	     }
	     else if(Browser.equals("firefox"))
	     {
	    	 driver=new FirefoxDriver();
	    	 
	     }
	     else if(Browser.equals("Edges"))
	     {
	    	 driver=new EdgeDriver();
	    	 
	     }
	     else
	     {
	    	 driver=new ChromeDriver(); 
	     }
	     sdriver=driver;
	     UitilityClassObject.setDriver(driver);
	     
	}
	@AfterClass(groups="smokeTest")
	public void configAC()
	{
		System.out.println("close browser");
		driver.close();
	}

   @BeforeSuite(groups="smokeTest")
   public void config()
   {
   	System.out.println(" open database connection");
   	
   }
   @AfterSuite(groups="smokeTest")
   public void configAS()
   {
   	System.out.println(" close database connection");
   
   }


}
