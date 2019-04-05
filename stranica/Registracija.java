package stranica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registracija {
	//xPaths for HomePage and fields for registration
	public static final String URL = "http://localhost/izlet/";
	public static final String firstName = "//input[@name='firstname']";
	public static final String lastName = "//input[@name='lastname']";
	public static final String username = "//form[@action='processregister.php']//input[@name='username']";
	public static final String email = "//input[@name='email']";
	public static final String password = "//form[@action='processregister.php']//input[@name='password']";
	public static final String register = "//input[@id='blue_btn']";

	// method to find First name field
	public static WebElement getFirstName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(firstName));
		return wb;
	}
	// method to click on First name field
	public static void clickFirstName(WebDriver dr) {
		getFirstName(dr).click();
	}
	// method to set First name
	public static void sendKeysFirstName(WebDriver dr, String str) {
		getFirstName(dr).sendKeys(str);
	}

	// LastName
	public static WebElement getLastName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(lastName));
		return wb;
	}

	public static void clickLastName(WebDriver dr) {
		getLastName(dr).click();
	}

	public static void sendKeysLastName(WebDriver dr, String str) {
		getLastName(dr).sendKeys(str);
	}

	// Username
	public static WebElement getUsername(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(username));
		return wb;
	}

	public static void clickUsername(WebDriver dr) {
		getUsername(dr).click();
	}

	public static void sendKeysUsername(WebDriver dr, String str) {
		getUsername(dr).sendKeys(str);
	}

	// Email
	public static WebElement getEmail(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(email));
		return wb;
	}

	public static void clickEmail(WebDriver dr) {
		getEmail(dr).click();
	}

	public static void sendKeysEmail(WebDriver dr, String str) {
		getEmail(dr).sendKeys(str);
	}

	// Password
	public static WebElement getPassword(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(password));
		return wb;
	}

	public static void clickPassword(WebDriver dr) {
		getPassword(dr).click();
	}

	public static void sendKeysPassword(WebDriver dr, String str) {
		getPassword(dr).sendKeys(str);
	}
    //find register button
	public static WebElement getRegister(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(register));
		return wb;
	}
	//click register button
	public static void clickRegister(WebDriver dr) {
		getRegister(dr).click();
	}

	public static void navigateTo(WebDriver driver) {
		driver.navigate().to(URL);
	}
    //opens home page
	public static void openPage(WebDriver driver) {
		driver.get(URL);
	}
}