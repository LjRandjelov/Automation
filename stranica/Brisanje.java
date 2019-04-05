package stranica;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Brisanje {
	private static final String dots = "fa-ellipsis-v";
	public static final String kanta = "fa-trash-alt";
	// button for choosing options
		public static void threeDotsButton(WebDriver driver) {
			List<WebElement> threeDots = driver.findElements(By.className(dots));
			threeDots.get(0).click();
		}

		// button for deleting posts
		public static void deleteButton(WebDriver driver) {
			threeDotsButton(driver);
			List<WebElement> deletePost = driver.findElements(By.className(kanta));
			deletePost.get(0).click();
		}

}
