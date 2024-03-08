package data_providers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterise_Without_Data_Provider {
	
	WebDriver driver;
	String url = "https://www.saucedemo.com/";
	String driver_path = "C:\\Users\\Boom\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.chrome.driver", driver_path);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}

	@Test
	@Parameters({"username", "password"})
	public void test_login(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDown() {
//		driver.close();
		driver.quit();
		System.out.println("My execution is complete.");
	}
}
