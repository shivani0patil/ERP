package erp.thirdparty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import erp.generic.ObjectRepository.ComercialPage;
import erp.generic.ObjectRepository.HomePage;
import erp.generic.listener.BaseClass;

public class CommercialTest extends BaseClass {
	
	@Test
	public void viewCommercialList()
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 HomePage h=new HomePage(driver);
			h.getCommerce().click();
			
			ComercialPage c=new ComercialPage(driver);
			c.getComercialList().click();
			//driver.findElement(By.linkText("List")).click();
			String value=c.getText().getText();
			//String value=driver.findElement(By.xpath("//div[@class='titre inline-block']")).getText();
			Assert.assertEquals(value, "Commercial proposals");
			
	}

}
