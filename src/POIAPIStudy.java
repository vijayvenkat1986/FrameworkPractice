import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.net.HostSpecifier;

public class POIAPIStudy {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//POI API is to handle excel files.
		//Reading data from excel files. Writing data to excel files. Delete excel files. Sheets creation. Add Rows. Add Columns. Add Cell Values. Format Cell Values.
		//Excel File types .xls, .xlsx
		//Workbook is an interface
		//4 Interface to be focused. 1. Workbook 2. Sheet 3.Row 4. Cell
		
		String filepath = "src//ExcelXLSX.xlsx";
		
		String a[] = filepath.split(".");
		
		File excelFile = new File(filepath);
		
		FileInputStream fis = new FileInputStream(excelFile);
		
		Workbook workbook;
		
		if(filepath.endsWith(".xls"))
		{
			workbook = new HSSFWorkbook(fis);
			
		} else {
			
			workbook = new XSSFWorkbook(fis);
		}
		
		Sheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(3);
		
		Cell cell = row.getCell(0);
		
		String cellValue = cell.getStringCellValue();
		
		System.out.println(cellValue);
		
		workbook.close();
		
		
	/*
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		HSSFSheet sheet = workbook.getSheetAt(0);
		
		HSSFRow row = sheet.getRow(3);
		
		HSSFCell cell = row.getCell(2);
		
		String cellValue = cell.getStringCellValue();
		
		System.out.println(cellValue);*/
	
	}

}
