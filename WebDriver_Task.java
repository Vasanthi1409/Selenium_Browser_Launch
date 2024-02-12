package Browser_Launch.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Task {

	public void browser_Launch(String B) {
		WebDriver D = new ChromeDriver();
		D.get("http://www.google.com/");				
	}	
	
	public void browser_Launch(String C, String F) {
		if(C.equals("Chrome")) {
			WebDriver D = new ChromeDriver();
			D.get("https://web.whatsapp.com/");
		}else {
//			System.setProperty("webdriver.firefox.driver", "C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\geckodriver.exe");
			WebDriver E = new FirefoxDriver();
			E.get("https://www.w3schools.com/");
		}						
	}	
	
	public static void main(String[] args) { 		
		
		WebDriver_Task WBT = new WebDriver_Task();		
		WBT.browser_Launch("Chrome");
		WBT.browser_Launch("Chrome", "Firefox");
	}

}
