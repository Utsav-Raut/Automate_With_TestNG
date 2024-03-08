package data_providers;

import org.testng.annotations.DataProvider;

public class SauceDemoLoginParams {
	
	
	@DataProvider(name = "LoginData")
	public Object[][] login(){
		return new Object[][] {
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"problem_user", "secret_sauce"}
		};
	}

}
