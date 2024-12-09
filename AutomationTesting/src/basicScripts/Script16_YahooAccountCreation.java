package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script16_YahooAccountCreation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Karthik DR");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Karthik177798");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kar1998");
		driver.findElement(By.xpath("//select[@id='usernamereg-month]")).sendKeys(args);
		

	}

}
