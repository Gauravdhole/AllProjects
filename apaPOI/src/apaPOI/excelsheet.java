package apaPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;

public class excelsheet {

	public static void main(String[] args) throws Exception {
		File scr = new File("C:\\Drivers\\Xceldata.\\testdata.xlsx");
		FileInputStream	fis	= new FileInputStream(scr );
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		 XSSFSheet  sheet1=      wb.getSheetAt(0);
		
	String  Data0=              	 sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data0 enter  The class:: "+ Data0);
		
		String  Data1=              	 sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data0 enter  The class::"+ Data1);
		
		
		String  Data2=              	 sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data2 enter  The class:: "+ Data2);
		
		String  Data3=              	 sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data3 enter  The class::"+ Data3);
		
		String  Data4=              	 sheet1.getRow(2).getCell(0).getStringCellValue();
		System.out.println("Data4 enter  The class:: "+ Data4);
		
		
		
		
		String  Data6=            	 sheet1.getRow(3).getCell(0).getStringCellValue();
		System.out.println("Data5 enter  The class::"+ Data6);
		
		
		

		String  Data8=            	 sheet1.getRow(4).getCell(0).getStringCellValue();
		System.out.println("Data5 enter  The class::"+ Data8);
		
		
		
		String  Data10=            	 sheet1.getRow(5).getCell(0).getStringCellValue();
		System.out.println("Data5 enter  The class::"+ Data10);
		
		
		

		String  Data12=            	 sheet1.getRow(6).getCell(0).getStringCellValue();
		System.out.println("Data5 enter  The class::"+ Data12);
		
		
		
		String  Data14=            	 sheet1.getRow(7).getCell(0).getStringCellValue();
		System.out.println("Data5 enter  The class::"+ Data14);
		
		
		

		String  Data16=            	 sheet1.getRow(8).getCell(0).getStringCellValue();
		System.out.println("Data5 enter  The class::"+ Data16);
		
		
		

		String  Data18=            	 sheet1.getRow(9).getCell(0).getStringCellValue();
		System.out.println("Data5 enter  The class::"+ Data18);
		
		
		
		String  Data20=            	 sheet1.getRow(10).getCell(0).getStringCellValue();
		System.out.println("Data5 enter  The class::"+ Data20);
		wb.close();
		
	}
}
