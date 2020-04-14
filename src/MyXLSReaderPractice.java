import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyXLSReaderPractice 

{
	String filepath;
	String fileextension;
	FileInputStream fis;
	FileOutputStream fileOutput;
	Workbook workbook;
	Sheet sheet;
	Row row;
	Cell cell;
	
	public MyXLSReaderPractice(String filepath) throws IOException
	{
		this.filepath = filepath;
		String fileextension = filepath.substring(filepath.indexOf(".x"));
		try {
			fis = new FileInputStream(filepath);
			if(fileextension.equals(".xls"))
			{
				workbook = new HSSFWorkbook(fis);
			}
			else if(fileextension.equals(".xlsx"))
			{
				workbook = new XSSFWorkbook(fis);
			}
			sheet = workbook.getSheetAt(0);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
