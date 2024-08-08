package erp.thirdparty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import erp.generic.ObjectRepository.HomePage;
import erp.generic.ObjectRepository.SalesOrderPage;
import erp.generic.ObjectRepository.ServicePage;
import erp.generic.listener.BaseClass;

public class SalesListTest extends BaseClass{
	
	@Test
	public void viewSalesList() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    HomePage h=new HomePage(driver);
			h.getCommerce().click();
	       
			// click on salesorder and List
			SalesOrderPage sale=new SalesOrderPage(driver);
			sale.getSalesOrder().click();
			sale.getSalesList().click();
		     
			//validation
		     String Expected=driver.findElement(By.xpath("//div[@class='titre inline-block']")).getText();
				System.out.println(Expected);
			Assert.assertEquals("Sales Orders(276)",Expected);
		
	}
	
	@Test
	public void viewSalesDeliveredList() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    HomePage h=new HomePage(driver);
			h.getCommerce().click();
	       
			// click on salesorder and List
			SalesOrderPage sale=new SalesOrderPage(driver);
			sale.getSalesOrder().click();
			sale.getSalesList().click();
		     
			//validation
		     String Expected=driver.findElement(By.xpath("//div[@class='titre inline-block']")).getText();
				System.out.println(Expected);
			Assert.assertEquals("Sales Orders(276)",Expected);
		
			 sale.getdeliveredOrderList().click();
			
			//validation
			String Expectedres=driver.findElement(By.xpath("//div[@class='titre inline-block']")).getText();
			Assert.assertEquals("Sales Orders - Delivered(5)",Expectedres);

	}
	
	
	@Test
	public void viewNotActiveList()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    HomePage h=new HomePage(driver);
		h.getCommerce().click();
       
		ServicePage service=new ServicePage(driver);
		// click on service and NotActiveList
//		driver.findElement(By.xpath("//a[@title='Services']")).click();
//		driver.findElement(By.xpath("//a[@title='Services not active']")).click();
		service.getServices().click();
		service.getServicesNotActive().click();
		
		//validation
		 String Expected=driver.findElement(By.xpath("//div[@class='titre inline-block']")).getText();
			System.out.println(Expected);
		Assert.assertEquals("List of not active services(45)",Expected);
		
	}

}
