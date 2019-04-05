package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelUtils {
    //refrences to private filds for excel objects
	private static HSSFSheet excelWSheet;
	private static HSSFWorkbook excelWBook;
	private static HSSFCell cell;
	private static HSSFRow row;
	private static DataFormatter formatter;
	
	//this method sets excel files and name of workSheet 
	public static void setExcelFile(String path, String sheetName) throws Exception {
		try {
			FileInputStream fis = new FileInputStream(path);
			excelWBook = new HSSFWorkbook(fis);
			excelWSheet = excelWBook.getSheet(sheetName);
			formatter = new DataFormatter();
		} catch (Exception ex) {
			throw (ex);
		}
	}
	
	//sets data in given cell (row + column)
	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		try {
			row = excelWSheet.getRow(RowNum);
			cell = row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
			if (cell == null) {
				cell = row.createCell(ColNum);
				cell.setCellValue(Result);
			} else {
				cell.setCellValue(Result);
			}
			FileOutputStream fileOut = new FileOutputStream(Const.PathExcel + Const.FileExcel);
			excelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();
		} catch (Exception e) {
			throw (e);

		}

	}
	//gets date from excel table for given row and column
	public static String getCellData(int rowNum, int colNum) throws Exception {
		try {
			cell = excelWSheet.getRow(rowNum).getCell(colNum);
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		} catch (Exception ex) {
			return "";
		}
	}
	// method for getting numbers of rows
		public static int getRowCount(String sheetName) {
			excelWSheet = excelWBook.getSheet(sheetName);
			int rowCount = excelWSheet.getLastRowNum() + 1;
			return rowCount;
		}


    //returns reference to work sheet
	public static HSSFSheet getWSheet() {
		return excelWSheet;
	}

}
