package erp.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver=null;
	public LoginPage(WebDriver driver)
	{
	   this.driver=driver;	
	   PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement  username;
	
	@FindBy(name="password")
	private WebElement  password;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement  loginbutton;
	
	
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

	public void Login(String user,String pass) {
		 username.sendKeys(user);
		 password.sendKeys(pass);
		 loginbutton.click();
		
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void Logout() {
		logindropdown.click();
		logout.click();
		
	}
}
