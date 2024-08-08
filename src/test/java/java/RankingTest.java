package java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RankingTest {

	@Test
	public void getranking()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.icc-cricket.com/rankings");
		
		List<WebElement> eleme=driver.findElements(By.xpath("(//div[@class='si-table-body'])[2]"));
		for(WebElement e:eleme)
		{
			System.out.println(e.getText());
		}
		
		
	}
}
