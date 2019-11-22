
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Brokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\anuanand\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		WebDriverWait wait= new WebDriverWait(driver, 30);
		WebElement elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/button")));
		//Alert alert= driver.switchTo().alert();
		//String alertMessage= driver.switchTo().alert().getText();
		//System.out.print(alertMessage);
		 elem.click();
		 
		 Actions a= new Actions(driver);
		 a.
		 
		 List<WebElement> Links= driver.findElements(By.tagName("a"));
		 int linkno= Links.size();
		 Iterator<int>
		 {
		 
		
	}

}
