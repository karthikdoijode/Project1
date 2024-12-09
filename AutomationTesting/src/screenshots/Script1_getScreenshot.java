package screenshots;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Script1_getScreenshot {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		//Step1
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Step2
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step3
		File dst = new File("C:\\Users\\INSPIRON\\Pictures\\Screenshots\\FirstImage.jpeg");
		
		//Step4
		FileHandler.copy(src, dst);
		
	}
}
