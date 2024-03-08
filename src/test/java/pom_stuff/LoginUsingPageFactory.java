package pom_stuff;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUsingPageFactory {
	
	WebDriver driver;
	String url = "https://www.saucedemo.com/";
	LoginPageFactory obj;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}

	@Test(priority = 0)
	public void test_login() throws InterruptedException {
		
		String username = "performance_glitch_user";
		String password = "secret_sauce";
		
		obj = new LoginPageFactory(driver);
		obj.login(username, password);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("My execution is complete.");
	}

}
