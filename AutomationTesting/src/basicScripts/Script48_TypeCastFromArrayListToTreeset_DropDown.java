package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script48_TypeCastFromArrayListToTreeset_DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		
		ArrayList<String> l = new ArrayList<String>();
		
		
		for(WebElement we: opt)
		{
			String months = we.getText();
			l.add(months);
		}
		
		TreeSet<String> t = new TreeSet<String>(l);
		
		for(String str1: t)
		{
			System.out.println(str1);
		}
	
	}
}
