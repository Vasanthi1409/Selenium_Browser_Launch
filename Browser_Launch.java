package Browser_Launch.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		
		WebDriver D = new ChromeDriver();
		D.get("http://www.google.com/");		

	}

}
