package erp.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 WebDriver driver=null;
		public HomePage(WebDriver driver)
		{
		   this.driver=driver;	
		   PageFactory.initElements(driver,this);
		}
		
		@FindBy(id="topmenu-login-dropdown")
		private WebElement logindropdown;
		
		@FindBy(xpath="//a[@title='Logout (Keyboard shortcut ALT + l)']")
		private WebElement logout;
		
		@FindBy(linkText="Third-parties")
		private WebElement Thirdparties;
		
		@FindBy(linkText="Commerce")	
		private WebElement Commerce;
		

		
		public WebElement getLogindropdown() {
			return logindropdown;
		}

		public WebElement getLogout() {
			return logout;
		}

		public WebElement getThirdparties() {
			return Thirdparties;
		}

		public WebElement getCommerce() {
			return Commerce;

}
		public void Logout() {
			logindropdown.click();
			logout.click();
			
		}		
}
