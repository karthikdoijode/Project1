package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script15_GoogleMaps {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='sb_ifc50' and @class='sbib_b']")).click();
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose destination...']")).sendKeys("Shivamogga");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath(")))

	}

}
