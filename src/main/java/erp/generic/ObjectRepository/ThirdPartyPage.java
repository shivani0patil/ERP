package erp.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPartyPage {
	WebDriver driver=null;
	public ThirdPartyPage(WebDriver driver)
	{
	   this.driver=driver;	
	   PageFactory.initElements(driver,this);
	}

   @FindBy(linkText="New Third Party")
   private WebElement newThirdparty;
   
   @FindBy(name="name")
   private WebElement Name;
   
   @FindBy(xpath="(//span[@role='presentation'])[2]\"")
   private WebElement Dropdown;
   
   @FindBy(xpath="(//li[text()='Customer']/../li)[4]")
   private WebElement Customer;
   
   @FindBy(xpath="//input[@type='submit']")
   private WebElement Createbutton;
   
public WebElement getNewThirdparty() {
	return newThirdparty;
}

public WebElement getName() {
	return Name;
}

public WebElement getDropdown() {
	return Dropdown;
}

public WebElement getCustomer() {
	return Customer;
}

public WebElement getCreatebutton() {
	return Createbutton;
}

}
