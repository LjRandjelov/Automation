package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import stranica.Objave;;

public class ObjaveTestSc {
	//make a post through console (by user)
	public static void fillForm (WebDriver driver) throws Exception {
		try {
			Scanner sc = new Scanner (System.in);
			//make a post button
			Objave.clickMakeAPost(driver);
			//name
			System.out.println("Naziv: ");
			Objave.clickNaziv(driver);
			String naziv = sc.next();
			Objave.sendKeysNaziv(driver, naziv);
			//location
			System.out.println("Lokacija: ");
			Objave.clickLokacija(driver);
			String lokacija = sc.next();
			Objave.sendKeysLokacija(driver, lokacija);
			//description
			System.out.println("Opis: ");
			Objave.clickOpis(driver);
			String opis = sc.next();
			Objave.sendKeysOpis(driver, opis);
			//clicks on post button
			Objave.clickPost(driver);
			
		 } catch (Exception ex) {
	            System.out.println(ex.toString());
	        } finally {
	}
	}
}
