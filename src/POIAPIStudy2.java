
public class POIAPIStudy2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyXLSReader reader = new MyXLSReader("src//ExcelXLSX.xlsx");
		
		int rowCount = reader.getRowCount("EmployeeData");
		
		System.out.println(rowCount);
		
		String cellValue = reader.getCellData("EmployeeData", "Occupation", 4);
		
		System.out.println(cellValue);
		
		String cellValue2 =reader.getCellData("EmployeeData", 3, 4);
		
		System.out.println(cellValue2);
		
		boolean exists = reader.isSheetExist("EmployeeData");
		
		System.out.println(exists);
		
		boolean exists2 = reader.isSheetExist("Vijay");
		
		System.out.println(exists2);
		
		int columnCount = reader.getColumnCount("EmployeeData");
				
		System.out.println(columnCount);
		
		if(reader.isSheetExist("EmployeeData"))
		{
		
		int rowNum = reader.getCellRowNum("EmployeeData", "ID", "002");
		
		System.out.println(rowNum);
		
		}
		
	}

}
