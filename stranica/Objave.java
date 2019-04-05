package stranica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Objave {
	
	

	public static final String makeAPost = "//a[contains(text(),'Make a post')]";
	public static final String naziv = "//input[@placeholder='Naziv']";
	public static final String lokacija = "//input[@placeholder='Lokacija']";
	public static final String opis = "//textarea[@placeholder='Opis']";
	public static final String post = "//input[@value='Post']";
	// method to find Make A Post button
	public static WebElement getMakeAPost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(makeAPost));
		return wb;
	}
    //click on Make A Post Button
	public static void clickMakeAPost(WebDriver dr) {
		getMakeAPost(dr).click();
	}

	// find Naziv field
	public static WebElement getNaziv(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(naziv));
		return wb;
	}
    //click on Naziv field
	public static void clickNaziv(WebDriver dr) {
		getNaziv(dr).click();
	}
    //sets Naziv 
	public static void sendKeysNaziv(WebDriver dr, String str) {
		getNaziv(dr).sendKeys(str);
	}
	//
	public static WebElement getLokacija(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(lokacija));
		return wb;
	}
    // for location
	public static void clickLokacija(WebDriver dr) {
		getLokacija(dr).click();
	}

	public static void sendKeysLokacija(WebDriver dr, String str) {
		getLokacija(dr).sendKeys(str);
	}
	public static WebElement getOpis(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(opis));
		return wb;
	}
    //for description
	public static void clickOpis(WebDriver dr) {
		getOpis(dr).click();
	}

	public static void sendKeysOpis(WebDriver dr, String str) {
		getOpis(dr).sendKeys(str);
	}
	//Finds post button
	public static WebElement getPost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(post));
		return wb;
	}
	//clicks on post button
	public static void clickPost(WebDriver dr) {
		getPost(dr).click();
	}

}
	
	
