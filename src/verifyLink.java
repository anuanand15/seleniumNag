import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyLink {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\anuanand\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		List <WebElement> ls= driver.findElements(By.tagName("a"));
		System.out.print(ls.size());
		for (int i=0; i<ls.size();i++)
		{
			WebElement elem= ls.get(i);
			String url= elem.getAttribute("href");
			//System.out.println(url);
			VerifyLink(url);
		}
		
		
		
	}

	private static void VerifyLink(String url) {
		// TODO Auto-generated method stub
		 try {
			 //Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
			 URL link = new URL(url);
			 // Create a connection using URL object (i.e., link)
			 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			 //Set the timeout for 2 seconds
			 httpConn.setConnectTimeout(2000);
			 //connect using connect method
			 httpConn.connect();
			 //use getResponseCode() to get the response code. 
			 if(httpConn.getResponseCode()== 200) { 
			 System.out.println(url+" - "+httpConn.getResponseMessage());
			 }
			 if(httpConn.getResponseCode()== 404) {
			 System.out.println(url+" - "+httpConn.getResponseMessage());
			 }
			 }
			 //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
			 catch (Exception e) {
			 //e.printStackTrace();
		
	}

}
}