package erp.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage {

	
	WebDriver driver=null;
	public ServicePage(WebDriver driver)
	{
	   this.driver=driver;	
	   PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@title='Services']")
	   private WebElement Services;
	 
	public WebElement getServices() {
		return Services;
	}

	@FindBy(xpath="//a[@title='Services not active']")
	   private WebElement ServicesNotactive;
	 
	public WebElement getServicesNotActive() {
		return ServicesNotactive;
	}


}
