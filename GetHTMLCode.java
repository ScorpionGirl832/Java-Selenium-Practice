package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHTMLCode
{
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement username=driver.findElement(By.id("email"));
		System.out.println(username.getAttribute("outerHTML"));
		
		if(username.getAttribute("outerHTML").contains("id=\"email\""))
		System.out.println("present");	
	}
}
