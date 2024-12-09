package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script8_PerformClickUsingTagName {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("C:\\Users\\INSPIRON\\Desktop\\InterviewPrep\\link.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("n1")).click();
		driver.findElement(By.className("c1")).click();
		
	}

}
