package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptSauceDemoCompareTitleNPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class='inventory_details_name'])[1]"));
		String text1 = ele.getText();
		
		WebElement ele2 = driver.findElement(By.xpath("(//div[@class='inventory_details_price'])[1]"));
		String price1 = ele2.getText();
		
		driver.findElement(By.xpath("//button[.='ADD TO CART']")).click();
		
		driver.findElement(By.xpath("//div[@class='shopping_cart_container']")).click();
		
		 WebElement ele3 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		 String text3 = ele3.getText();
		 
		 WebElement ele4 = driver.findElement(By.xpath("//div[.='29.99']"));
		 String price2 = ele3.getText();
		 
		 
		 if(text1==text3)
		 {
			 System.out.println("Both are same");
		 }
		 else 
		 {
			 System.out.println("not same");
		 }
		 
		 if(price1==price2)
		 {
			 System.out.println("Both are same");
		 }
		 else 
		 {
			 System.out.println("not same");
		 }
		
		 driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		 
		 driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}

}
