package screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script8_GetWindowHanlde1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		String addOfBrowser = driver.getWindowHandle();
		System.out.println(addOfBrowser);
	}

}
