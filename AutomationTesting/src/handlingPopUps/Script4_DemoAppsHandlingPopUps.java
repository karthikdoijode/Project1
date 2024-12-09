package handlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script4_DemoAppsHandlingPopUps {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("yes");
		System.out.println(a.getText());
		Thread.sleep(2000);
		
		a.accept();
		}
	}


