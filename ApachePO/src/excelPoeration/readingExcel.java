package excelPoeration;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readingExcel {

	
	public static void main(String[] args) throws Exception {
	
		FileInputStream file = new FileInputStream("C:\\Drivers\\Xceldata.\\testdata.xlsx");
				org.apache.poi.ss.usermodel.Sheet excelFile = WorkbookFactory.create(file).getSheet("Sheet1");
				String value1 = ((org.apache.poi.ss.usermodel.Sheet) excelFile).getRow(0).getCell(0).getStringCellValue();
			 System.out.println(value1);
	}
}
