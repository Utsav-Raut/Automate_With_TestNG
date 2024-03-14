package automate_using_properties_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	
	@FindBy(name="user-name")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public LoginPageFactory(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		this.pwd.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void login(String uname, String pwd) throws InterruptedException {
		this.setUserName(uname);
		this.setPassword(pwd);
		Thread.sleep(3000);
		this.clickLoginBtn();
		Thread.sleep(2000);
	}
	
}
