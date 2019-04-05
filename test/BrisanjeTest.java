package test;

import org.openqa.selenium.WebDriver;
import stranica.Brisanje;


public class BrisanjeTest {
	// method for deleting
	public static void deletePosts(WebDriver driver, int brPostova) throws Exception {
		try {
			for (int i = 0; i < brPostova; i++) {
				Brisanje.deleteButton(driver);
			}
		} catch (Exception e) {
			throw (e);
		}
	}

}
