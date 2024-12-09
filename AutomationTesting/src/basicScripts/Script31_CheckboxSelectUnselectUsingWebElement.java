package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script31_CheckboxSelectUnselectUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/INSPIRON/Desktop/SantoshPr/CheckBoxSelectDeselect1.html");
		Thread.sleep(3000);
		List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
		int count = checkbox.size();
		
		for(int i=0; i<count; i++)
		{
			WebElement ele = checkbox.get(i);
			ele.click();
			Thread.sleep(1000);
		}
		
		for(int i=count-1; i>=0; i--)
		{
			WebElement ele = checkbox.get(i);
			ele.click();
			Thread.sleep(1000);
		}

	}

}
