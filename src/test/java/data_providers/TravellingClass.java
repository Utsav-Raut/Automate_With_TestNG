package data_providers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TravellingClass {

	@BeforeMethod
	public void setup() {
		System.out.println("This is the setup part");
	}
	
	@Test(dataProvider = "travel_details", dataProviderClass = TravellingDataProvider.class)
	public void travel(String source, String destination) {
		System.out.println("I will travelling from " + source + " to " + destination);
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("This is where we teardown");
		System.out.println();
	}
}
