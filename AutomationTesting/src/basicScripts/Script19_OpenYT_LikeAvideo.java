package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script19_OpenYT_LikeAvideo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("pushpa 2 trailer");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='PUSHPA 2 - The Rule : Trailer (Hindi) | Allu Arjun, Fahad Faasil, Rashmika | Sukumar | T-Series']")).click(); 



	}

}
