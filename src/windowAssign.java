import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\anuanand\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		Set<String> wh= driver.getWindowHandles();
		Iterator<String> it= wh.iterator();
		String parentid= it.next();
		String childid= driver.getWindowHandle();
		driver.switchTo().window(childid);
		System.out.print(driver.getTitle());
	
		
		driver.findElement(By.linkText("Click Here")).click();
		String newhandle= driver.getWindowHandle();
		driver.switchTo().window(newhandle);
		System.out.print(driver.getTitle());
		driver.switchTo().window(childid);
		System.out.print(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
		
		
		
	}

}
