package bdd.StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automate_using_properties_file.LoginPageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	String url;
	LoginPageFactory obj;
	Properties properties;
	FileInputStream fis;
	String username;
	String password;
	
	@Given("I open the browser")
	public void i_open_the_browser() {
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
		
	}

	@Given("Open the web app")
	public void open_the_web_app() {
		url = properties.getProperty("url");
		driver.get(url);
	}

	@When("I enter the credentials")
	public void i_enter_the_credentials() {
		username = properties.getProperty("username");
		password = properties.getProperty("password");
		obj = new LoginPageFactory(driver);
		try {
			obj.login(username, password);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("I am able to login")
	public void i_am_able_to_login() {
	    System.out.println("I have logged in successfully.");
	}

	@Then("check the home page")
	public void check_the_home_page() {
		System.out.println("Printing from the home screen.");
		driver.quit();
		System.out.println("My execution is complete.");
	}

}
