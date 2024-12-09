package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script22_VerifyFbTitleCompletlyAndParitally 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		String title = driver.getTitle();
		//System.out.println(title);
		
		if (title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}

	}

}
