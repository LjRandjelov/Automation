package upis;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import stranica.Registracija;
import test.BrisanjeTest;
import test.EditTest;
import test.LogInSc;
import test.LogInTest;
import test.ObjaveTest;
import test.ObjaveTestSc;
import test.RegistracijaTest;
import test.RegistracijeSc;

public class GlavniProgram {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		try {
			Uputstva.uputstva(); //shows messages with instructions
			Registracija.openPage(driver);
			Scanner sc = new Scanner(System.in);
			switch (sc.nextInt()) {
			case 1:
				RegistracijaTest.testWithAllData(driver);// register with data from excel
			case 2:
				RegistracijeSc.fillForm(driver);// registration through console
				break;
			case 3:
				LogInTest.testWithAllData(driver);// log in with data from excel
				break;
			case 4:
				LogInSc.fillForm(driver);// log in through scanner
				break;
			case 5:
				LogInTest.fillForm(driver, 2);// excel data with valid user name and password
				ObjaveTest.testWithAllData(driver);// data from excel posts
				break;
			case 6:
				LogInTest.fillForm(driver, 2);
				ObjaveTestSc.fillForm(driver);// data that user types in console
				break;
			case 7:
				LogInTest.fillForm(driver, 2);
				BrisanjeTest.deletePosts(driver, 2);// deletes first two posts
			case 8:
				LogInTest.fillForm(driver, 2);
				EditTest.editPost(driver);// edits posts 
			default:
				System.out.println("You entered invalid number");
				break;
			}
			Thread.sleep(10000);
			sc.close();

		} catch (Exception ex) {
			
			ex.printStackTrace();
		} finally {
			
			driver.close();
		}
	}

}
