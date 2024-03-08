package pom_stuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	
	WebDriver driver;
	
	By username = By.name("user-name");
	By pwd = By.name("password");
	By loginBtn = By.id("login-button");
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		driver.findElement(this.pwd).sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void login(String uname, String pwd) throws InterruptedException {
		this.setUserName(uname);
		this.setPassword(pwd);
		Thread.sleep(3000);
		this.clickLoginBtn();
		Thread.sleep(2000);
	}

}
