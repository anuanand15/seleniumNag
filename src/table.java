import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\anuanand\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	

	driver.get("http://demo.guru99.com/test/web-table-element.php");
	WebElement table= driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
	List<WebElement> rows= table.findElements(By.tagName("tr"));
	int rowno= rows.size();
	System.out.print(rows.size());
	for (int i=0; i<rowno ;i++)
	{
		
		String rowtext= rows.get(i).getText();
		System.out.println(rowtext);
		List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
		int col= cols.size();
		System.out.println(cols.size());
		
		for(int j=0;j<col;j++)
		{
			String celtext= cols.get(j).getText();
			System.out.println(celtext);
		}
	}
	
	WebElement header= driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead"));
	List<WebElement> h= header.findElements(By.tagName("th"));
	//System.out.print(h.size());
	
	for(int k=0; k<h.size();k++)
	{
		String headertext= h.get(k).getText();
		System.out.print(headertext);
	}
}
}
