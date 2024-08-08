package erp.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {

	WebDriver driver=null;
	public SalesOrderPage(WebDriver driver)
	{
	   this.driver=driver;	
	   PageFactory.initElements(driver,this);
	}
	
	 @FindBy(xpath="//div[@class='menu_contenu menu_contenu_commande_list']/a[@title='List']")
	   private WebElement SalesList;
	 
	public WebElement getSalesList() {
		return SalesList;
	}
	@FindBy(xpath="(//a[@class='vmenu'])[2]")
	   private WebElement SalesOder;
	 
	public WebElement getSalesOrder() {
		return SalesOder;
	}
	
	@FindBy(xpath="(//div[@class='menu_contenu menu_contenu_commande_list'])[5]//a[@class='vsmenu']")
	private WebElement deliveredOrderList;
	
	public WebElement getdeliveredOrderList() {
		return deliveredOrderList;
	}
}
