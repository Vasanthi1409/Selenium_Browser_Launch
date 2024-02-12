package Browser_Launch.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class WebDriver_Methods {

	public static void main(String[] args) {
		
		
		WebDriver D = new ChromeDriver();
		D.get("http://www.google.com/");
//		D.manage().window().maximize();
//		D.manage().window().fullscreen(); 
		Dimension getsize = D.manage().window().getSize();
		System.out.println(getsize);
		D.manage().window().setSize(new Dimension(800, 500));
//		D.navigate().to("https://www.w3schools.com/");
//		D.navigate().back();
//		D.navigate().forward();
//		D.navigate().refresh();
		String title = D.getTitle();
		System.out.println(title);
		String currentUrl = D.getCurrentUrl();
		System.out.println(currentUrl);
//		String pageSource = D.getPageSource();
//		System.out.println(pageSource);
//		D.close();
//		D.quit();

	}

}
