import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class longtextSapmle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anuanand\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement wb= driver.findElement(By.name("q"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value= 'job charactgsggsgfsfafsfdfasgasasdasfhgfashgfdhafshtdfhgfsdhgfsahgdfhsfdhfhsdfhsfhfghsf' ;", wb);
		
		
		
		
		
		
		
	}

}
