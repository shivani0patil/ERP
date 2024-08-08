package erp.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComercialPage {
	 WebDriver driver=null;
		public ComercialPage(WebDriver driver)
		{
		   this.driver=driver;	
		   PageFactory.initElements(driver,this);
		}
		 @FindBy(linkText="List")
		   private WebElement ComercialList;
		public WebElement getComercialList() {
			return ComercialList;
		}
		 
		 @FindBy(xpath="//div[@class='titre inline-block']")
		 private WebElement getText;
		 
		 public WebElement getText() {
				return getText;
			}
}
