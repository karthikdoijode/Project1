package javaScriptExecutor;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script4_FetchTitleOfallBrowserNclose {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://skpatro.github.io/demo/links");
			driver.findElement(By.name("NewWindow")).click();
			
			Set<String> allwh = driver.getWindowHandles();
			
			for(String wh:allwh)
			{
				driver.switchTo().window(wh);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.close();
				
			}

		}

	}

