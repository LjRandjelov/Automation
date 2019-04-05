package test;


import java.util.Scanner;
import org.openqa.selenium.WebDriver;


import stranica.Edit;

public class EditTest {
			
			public static void editPost(WebDriver driver) throws Exception {
				try {
					Scanner sc = new Scanner(System.in);
					
                    Edit.threeDotsButton(driver);
					Edit.editPostButton(driver);
					Thread.sleep(3000);
					System.out.println("Enter new description:");
					Edit.deleteEditPostText(driver);
					String opis = sc.nextLine();
					Edit.sendEditPostText(driver, opis);
					Edit.clickEditPostButton(driver);

				} catch (Exception e) {
					throw (e);
				}
			}

		}
