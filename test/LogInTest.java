package test;

import org.openqa.selenium.WebDriver;

import stranica.LogIn;
import stranica.Registracija;
import utils.Const;
import utils.ExcelUtils;

public class LogInTest {
	//method to fill in LogIn form using data from Excel file
	public static void fillForm(WebDriver driver,int i) throws Exception {
		String data;
		//sets excel file
		ExcelUtils.
		setExcelFile
		(Const.PathExcel + Const.FileExcel, Const.SheetName1);
		//username
		LogIn.clickUsername(driver);
		data = ExcelUtils.getCellData(i, 2);
		LogIn.sendKeysUsername(driver, data);
		//password
		LogIn.clickPassword(driver);
		data = ExcelUtils.getCellData(i, 4);
		LogIn.sendKeysPassword(driver, data);
		//log in button
		LogIn.clickLogIn(driver);
	}
	//tests log in row by row, with all data from excel file
		public static void testWithAllData(WebDriver driver) throws Exception {
			ExcelUtils.
			setExcelFile
			(Const.PathExcel + Const.FileExcel, Const.SheetName1);
			for(int i=1;i<ExcelUtils.getWSheet().getLastRowNum()+1;i++) {
				fillForm(driver, i);
				Registracija.navigateTo(driver);
			}
			
}
}
