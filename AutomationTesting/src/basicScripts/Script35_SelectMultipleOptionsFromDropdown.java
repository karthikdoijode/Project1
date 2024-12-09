package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script35_SelectMultipleOptionsFromDropdown {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("C:\\Users\\INSPIRON\\Desktop\\SantoshPr\\DropDownMultiSelect.html");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.id("nandanas"));
	Select s = new Select(ele); // ismultiple
	s.selectByIndex(4);
	Thread.sleep(2000);
	s.selectByValue("l");
	Thread.sleep(2000);
	s.selectByVisibleText("Mutton biryani");
	Thread.sleep(2000);
	s.deselectAll();

}
}
