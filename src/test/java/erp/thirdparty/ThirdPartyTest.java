package erp.thirdparty;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import erp.generic.ObjectRepository.HomePage;
import erp.generic.ObjectRepository.ThirdPartyPage;
import erp.generic.fileUtility.ExcelUtility;
import erp.generic.listener.BaseClass;
import erp.generic.webutility.JavaUtility;
import erp.generic.webutility.WebDriverUtility;

public class ThirdPartyTest extends BaseClass{
  
	@Test
	public void createThirdParty() throws IOException, Throwable
	{

	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ExcelUtility e=new ExcelUtility();
		WebDriverUtility wb=new WebDriverUtility(); 
		JavaUtility j=new JavaUtility();
		ThirdPartyPage th=new ThirdPartyPage(driver);
		HomePage h=new HomePage(driver);
		h.getThirdparties().click();
//	     
		int num=j.random();
		String name=e.getDataExcel("Sheet1", 1, 2)+num;
//		
		th.getNewThirdparty().click();
		th.getName().sendKeys(name);
		WebElement s=th.getCustomer();
		System.out.println("done");
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single flat']")).click();
		System.out.println("done");
		wb.moveToelement(driver, s);
		
		th.getCreatebutton().click();
		
//		driver.findElement(By.xpath("//span[text()='Third-parties']")).click();
//		driver.findElement(By.linkText("New Third Party")).click();
//		driver.findElement(By.name("name")).sendKeys(name);
//		driver.findElement(By.xpath("(//span[@role='presentation'])[2]")).click();
//		WebElement s=driver.findElement(By.xpath("//li[text()='Customer']"));
//		Actions a=new Actions(driver);
//		a.moveToElement(s).click().perform();
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		
		
		
	}
}
