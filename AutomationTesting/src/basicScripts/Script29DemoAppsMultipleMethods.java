package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script29DemoAppsMultipleMethods{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Login']"));
		String text = ele.getText();
		System.out.println(text);
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder = 'Enter your password']"));
		String title = ele1.getAttribute("placeholder");
		System.out.println(title);
		
		Point p = ele.getLocation();
		System.out.println(p);
		
		WebElement ele2 = driver.findElement(By.xpath("//section[text()='Radio Button']"));
		int h = ele2.getSize().getHeight();
		System.out.println(h);
		int w = ele2.getSize().getWidth();
		System.out.println(w);
		
		
		
	}
}
