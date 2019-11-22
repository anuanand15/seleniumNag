

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\anuanand\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		
		String Parent= driver.getWindowHandle();
		System.out.println(Parent);
		
		Actions a= new Actions(driver);
		WebElement x= driver.findElement(By.cssSelector(".facebook"));
		String y= x.getAttribute("title");
		System.out.println(y);
		a.clickAndHold().moveToElement(x).click().perform();
		String link= driver.getCurrentUrl();
		System.out.println("URL is"+link);
		Set<String> WH = driver.getWindowHandles();
		for(String handle: WH)
		{
            if(handle!=Parent)
            {
            driver.switchTo().window(handle);
            }
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement z= driver.findElement(By.id("email"));
		z.sendKeys("anuknit.anand4@gmail.com");
		
		WebElement z2= driver.findElement(By.id("pass"));
		z2.sendKeys("chinkitiwari");
		
		WebElement z3= driver.findElement(By.id("u_0_3"));
		z2.click();
		
		String WH2 = driver.getWindowHandle();
		System.out.println("Window handle is" +WH2);
		
		String Title= driver.getTitle();
		System.out.println(Title);
		

	}
}
