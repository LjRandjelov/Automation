package test;

import org.openqa.selenium.WebDriver;

import stranica.Objave;
import utils.Const;
import utils.ExcelUtils;

public class ObjaveTest {
	//posts using data from Excel file
	public static void fillForm(WebDriver driver,int i) throws Exception {
		String data;
		//sets excel file
		ExcelUtils.
		setExcelFile
		(Const.PathExcel + Const.FileExcel, Const.SheetName2);
		//make a post button
		Objave.clickMakeAPost(driver);
		//title
		Objave.clickNaziv(driver);
		data = ExcelUtils.getCellData(i, 1);
		Objave.sendKeysNaziv(driver, data);
		//location
		Objave.clickLokacija(driver);
		data = ExcelUtils.getCellData(i, 2);
		Objave.sendKeysLokacija(driver, data);
		//description
		Objave.clickOpis(driver);
		data = ExcelUtils.getCellData(i, 0);
		Objave.sendKeysOpis(driver, data);
		//post button
		Objave.clickPost(driver);
	}
	//posts row by row, with all data from excel file
	public static void testWithAllData(WebDriver driver) throws Exception {
		ExcelUtils.
		setExcelFile
		(Const.PathExcel + Const.FileExcel, Const.SheetName2);
		for(int i=1;i<ExcelUtils.getWSheet().getLastRowNum()+1;i++) {
			fillForm(driver, i);
		}
		
		
	}


}
