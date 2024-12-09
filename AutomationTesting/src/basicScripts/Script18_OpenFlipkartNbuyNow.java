package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script18_OpenFlipkartNbuyNow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 16");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		driver.findElement(By.xpath("//img[@class='DByuf4' and @alt='Apple iPhone 16 (White, 128 GB)']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp' and @type='button']")).click();
		}
}