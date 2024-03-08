package data_providers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProvider {
	
	@Test(dataProvider = "data_provider")
	public void test_case1(Integer n, String str) {
		System.out.println("For every " + n + ", there is a "+str);
	}
	
	
	@DataProvider
	public Object[][] data_provider(){
		return new Object[][] {
			{1, "a"},
			{2, "kp"}
		};
	}

}
