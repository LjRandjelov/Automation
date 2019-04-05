package test;

import org.openqa.selenium.WebDriver;

import utils.ExcelUtils;
import stranica.Registracija;
import utils.Const;


public class RegistracijaTest {
	//method to fill in registration form using data from Excel file
	public static void fillForm(WebDriver driver,int i) throws Exception {
		String data;
		//sets excel file
		ExcelUtils.
		setExcelFile
		(Const.PathExcel + Const.FileExcel, Const.SheetName1);
		//first name
		Registracija.clickFirstName(driver);
		data = ExcelUtils.getCellData(i, 0);
		Registracija.sendKeysFirstName(driver, data);
		//last name
		Registracija.clickLastName(driver);
		data = ExcelUtils.getCellData(i, 1);
		Registracija.sendKeysLastName(driver, data);
		//username
		Registracija.clickUsername(driver);
		data = ExcelUtils.getCellData(i, 2);
		Registracija.sendKeysUsername(driver, data);
		//email
		Registracija.clickEmail(driver);
		data = ExcelUtils.getCellData(i, 3);
		Registracija.sendKeysEmail(driver, data);
		//password
		Registracija.clickPassword(driver);
		data = ExcelUtils.getCellData(i, 4);
		Registracija.sendKeysPassword(driver, data);
		//registration button
		Registracija.clickRegister(driver);
	}
        //tests data row by row from given excel sheet
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