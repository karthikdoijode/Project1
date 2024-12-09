package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script28_FetchTextOfAnElementInWebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(10000);
		WebElement ele= driver.findElement(By.xpath("//a[text()='Privacy dashboard']"));
		String text = ele.getText();
		System.out.println(text);

	}

}
