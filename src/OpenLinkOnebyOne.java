import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkOnebyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\anuanand\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://qaclickacademy.com/practice.php");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("no of links present in pgae" +links.size());
		for (int i=0; i<links.size();i++)
		{
			String clickontab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			Set<String> abc= driver.getWindowHandles();
			Iterator<String> it= abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		}
		
		
	}

}
