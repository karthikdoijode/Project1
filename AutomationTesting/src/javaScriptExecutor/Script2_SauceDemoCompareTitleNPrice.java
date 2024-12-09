//package javaScriptExecutor;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Script2_SauceDemoCompareTitleNPrice {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.saucedemo.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//		Thread.sleep(1000);
//		//driver.findElement(By.xpath("//input[@id='login-button']")).click();)
//	}
//
//}
