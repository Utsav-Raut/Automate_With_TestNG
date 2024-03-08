package data_providers;

import org.testng.annotations.DataProvider;

public class TravellingDataProvider {

	@DataProvider(name = "travel_details")
	public static Object[][] travel_data_provide(){
		return new Object[][] {
			{"Delhi", "Trivandrum"},
			{"infy", "buu home"}
		};
	}
}
