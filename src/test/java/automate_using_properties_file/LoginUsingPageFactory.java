package automate_using_properties_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUsingPageFactory {
	
	WebDriver driver;
	String url;
	LoginPageFactory obj;
	Properties properties;
	FileInputStream fis;
	String username;
	String password;
	
	@BeforeMethod
	public void setup() {
		properties = new Properties();
		
		try {
			fis = new FileInputStream("configs/config.properties");
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		url = properties.getProperty("url");
		username = properties.getProperty("username");
		password = properties.getProperty("password");
		driver.get(url);
	
	}

	@Test(priority = 0)
	public void test_login() throws InterruptedException {
		
		obj = new LoginPageFactory(driver);
		obj.login(username, password);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("My execution is complete.");
	}

}
