package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import stranica.Registracija;
public class RegistracijeSc {
	//fill in log in form through console 
	public static void fillForm (WebDriver driver) throws Exception {
		try {
			Scanner sc = new Scanner (System.in);
			//first name
			System.out.println("First name: ");
			Registracija.clickFirstName(driver);
			String firstName = sc.nextLine();
			Registracija.sendKeysFirstName(driver, firstName);
			//last name
			System.out.println("Last name: ");
			Registracija.clickLastName(driver);
			String lastName = sc.nextLine();
			Registracija.sendKeysLastName(driver, lastName);
			//username
			System.out.println("Username: ");
			Registracija.clickUsername(driver);
			String username = sc.nextLine();
			Registracija.sendKeysUsername(driver, username);
			//email
			System.out.println("Email: ");
			Registracija.clickEmail(driver);
			String email = sc.nextLine();
			Registracija.sendKeysEmail(driver, email);
			//password
			System.out.println("Password: ");
			Registracija.clickPassword(driver);
			String password = sc.nextLine();
			Registracija.sendKeysPassword(driver, password);
			//registration button
			Registracija.clickRegister(driver);
			
			
		 } catch (Exception ex) {
	            System.out.println(ex.toString());
	        } finally {
	}

}
}
