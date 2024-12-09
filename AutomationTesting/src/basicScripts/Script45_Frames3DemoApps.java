package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script45_Frames3DemoApps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(2000);
		
		WebElement f1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(f1);
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("karthik@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
		pwd.sendKeys("In82@@@");
		
		WebElement cpd = driver.findElement(By.xpath("(//input[@name='password'])[2]"));
		pwd.sendKeys("In82@@@");
		
		driver.switchTo().defaultContent();
		
		WebElement f2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(f2);
		Thread.sleep(1000);
		
		WebElement us = driver.findElement(By.xpath("(//input[@id='username']"));
		email.sendKeys("abcd");
		
		WebElement psw1 = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
		psw1.sendKeys("defg");
		
}
}