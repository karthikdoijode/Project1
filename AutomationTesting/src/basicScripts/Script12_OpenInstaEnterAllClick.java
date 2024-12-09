package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12_OpenInstaEnterAllClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='_aa4b _add6 _ac4d _ap35']")).sendKeys("abcd");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='_aa4b _add6 _ac4d _ap35']")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class=' _acan _acap _acas _aj1- _ap30']")).click();

	}

}
