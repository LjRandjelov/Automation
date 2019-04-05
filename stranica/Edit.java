package stranica;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Edit {
	private static final String dots = "fa-ellipsis-v";
	public static final String edit = "fa-edit";
	private static String editPostButton = "#description";
	public static final String post = "//div[@class='popupEdit']//input[@value='Post']";

	// button for choosing options
			public static void threeDotsButton(WebDriver driver) {
				List<WebElement> threeDots = driver.findElements(By.className(dots));
				threeDots.get(0).click();
			}

		// button for editing posts
		public static void editPostButton(WebDriver driver) {
			List<WebElement> editFirstPost = driver.findElements(By.className(edit));
			editFirstPost.get(0).click();
		}

		// delete and write old post

		public static WebElement getEditPost(WebDriver driver) {
			WebElement editPost = driver.findElement(By.cssSelector(editPostButton));
			return editPost;
		}

		public static void clickEditPostText(WebDriver driver) {
			getEditPost(driver).click();
		}

		public static void deleteEditPostText(WebDriver driver) {
			getEditPost(driver).clear(); //deletes post
		}

		public static void sendEditPostText(WebDriver driver, String opis) {
			getEditPost(driver).sendKeys(opis);
		}

		// button for posting edited posts

		public static WebElement getEditPostButton(WebDriver driver) {
			WebElement editPostButton = driver.findElement(By.xpath(post));
			return editPostButton;
		}

		public static void clickEditPostButton(WebDriver driver) {
			getEditPostButton(driver).click();
		}
}