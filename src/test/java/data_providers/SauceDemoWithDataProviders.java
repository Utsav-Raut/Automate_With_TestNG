package data_providers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoWithDataProviders {
	
	WebDriver driver;
	String url = "https://www.saucedemo.com/";
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}

	@Test(dataProvider = "LoginData", dataProviderClass = SauceDemoLoginParams.class)
	public void test_login(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("My execution is complete.");
	}
}
