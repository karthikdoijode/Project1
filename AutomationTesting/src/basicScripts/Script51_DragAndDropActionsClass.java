package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Script51_DragAndDropActionsClass {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			Thread.sleep(2000);
			WebElement src = driver.findElement(By.id("box3"));
			WebElement dst = driver.findElement(By.id("box103"));
			Actions act = new Actions(driver);
			act.dragAndDrop(src,dst).perform();
		}

	}
