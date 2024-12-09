package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script30_MethodsNavigateETC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.firefox.com");
		driver.navigate().to("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Dimension d = new Dimension(200,300);
		driver.manage().window().setSize(d);
		
		Point p = new Point(200, 300);
		driver.manage().window().setPosition(p);
		
		driver.manage().deleteAllCookies();
	}
}
