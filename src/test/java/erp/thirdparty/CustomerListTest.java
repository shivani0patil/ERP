package erp.thirdparty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import erp.generic.ObjectRepository.CustomerListPage;
import erp.generic.ObjectRepository.HomePage;
import erp.generic.ObjectRepository.ThirdPartyPage;
import erp.generic.listener.BaseClass;

public class CustomerListTest extends BaseClass {
	
	@Test
	public void viewCustomerList() {
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 ThirdPartyPage th=new ThirdPartyPage(driver);
		 CustomerListPage customer=new CustomerListPage(driver);
		 HomePage h=new HomePage(driver);
			h.getThirdparties().click();
			customer.getCustomerList().click();
						
	}

}
