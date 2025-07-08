package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser
{
	public static void main(String[] args)throws InterruptedException
	{
		//Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//set path to chromedriver.exe
		ChromeDriver google= new ChromeDriver();//launch Chrome Browser
		Thread.sleep(2000);
		
		//Edge
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");//set path to msedgedriver.exe
		EdgeDriver microsoft=new EdgeDriver();//launch Edge browser
		Thread.sleep(2000);
		
		//FireFox
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//set path to geckodriver.exe
		FirefoxDriver mozilla=new FirefoxDriver();//launch Firefox browser
	}
}
