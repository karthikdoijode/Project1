package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_24DemoAppsCheckboxIsSelectedWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox/selected?sublist=1");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("domain1"));
		boolean b = ele.isSelected();
		if(b)
		{
			System.out.println("element is selected");
		}
		else {
			System.out.println("element not selected");
		}
	}

}
