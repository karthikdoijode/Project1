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

public class Script49_TypeCastFromTreesetToArrayList_DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		
		TreeSet<String> t = new TreeSet<String>();
		
		for(WebElement we: opt)
		{
			String months = we.getText();
			t.add(months);
		}
		
		ArrayList<String> l = new ArrayList<String>(t);
		
		for(String str1: l)
		{
			System.out.println(str1);
		}
	
	}
}
