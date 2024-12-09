package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script20_DemoAppsQspiders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("karthik");
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/button");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='text-white hover:text-slate-300 text-[14px]' and @href='/ui/link/contact']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='attended']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='domain1']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='absolute left-[3px] top-[2px] translate-x-0 inline-block w-3 h-3 transition duration-300 ease-in-out transform bg-white border border-gray-300 rounded-full']")).click();
		
	}

}
