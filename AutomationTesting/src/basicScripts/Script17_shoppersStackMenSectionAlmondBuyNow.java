package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script17_shoppersStackMenSectionAlmondBuyNow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@id='men' and @name='men']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@alt='100% Natural Premium| Premium Badam Giri | High in Fiber & Boost Immunity | Real Nuts | Whole Natural Badam']")).click();
		driver.findElement(By.xpath("//span[text()='happilo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Buy Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
	}

}
