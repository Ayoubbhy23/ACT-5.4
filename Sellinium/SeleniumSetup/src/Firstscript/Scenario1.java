package Firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Provide path to chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		// Instantiate chromedriver class
		WebDriver driver = new ChromeDriver();
		// Site access in Chrome browser
		driver.get("http://demo.guru99.com/test/newtours/");
		// Access to Register menu
		WebElement btn= driver.findElement(By.linkText("REGISTER"));
		btn.click();
		Thread.sleep(500);
		
	
		// Insert infos
		driver.findElement(By.name("firstName")).sendKeys("Ayoub");
		driver.findElement(By.name("lastName")).sendKeys("bhy");
		driver.findElement(By.name("phone")).sendKeys("11111");
		driver.findElement(By.name("userName")).sendKeys("Ayoub@mail.com");
		driver.findElement(By.name("address1")).sendKeys("Charguia");
		driver.findElement(By.name("city")).sendKeys("Tunis");
		driver.findElement(By.name("state")).sendKeys("Tunis");
		driver.findElement(By.name("postalCode")).sendKeys("1002");
		driver.findElement(By.name("country")).sendKeys("tunisia");
		driver.findElement(By.name("email")).sendKeys("abhyyy");
		driver.findElement(By.name("password")).sendKeys("10101010");
		driver.findElement(By.name("confirmPassword")).sendKeys("10101010");
		
		// Click on Envoyer
		WebElement b= driver.findElement(By.name("submit"));
		b.click();
		
		// Access to sign-in menu
		WebElement bt= driver.findElement(By.linkText("sign-in"));
		bt.click();
		Thread.sleep(500);
		
	
		// Insert infos
		driver.findElement(By.name("userName")).sendKeys("Ayoub@mail.com");
		driver.findElement(By.name("password")).sendKeys("10101010");
		
		// Click on submit
		WebElement btnn= driver.findElement(By.name("submit"));
		btnn.click();
		
		
	}

}
