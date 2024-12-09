package handlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2_DemoAppsHandlePopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.accept();
	}

}

