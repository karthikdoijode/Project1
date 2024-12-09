package basicScripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2_launchEmptyFirefoxBrowser {

	public static void main(String[] args) 
	{

		
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		
		System.setProperty(key, value);
		
		FirefoxDriver driver = new FirefoxDriver();
		
		// webdriver exception or session - browser not updated
		// IllegalstateExceptio - if error in key n value
	}

}
