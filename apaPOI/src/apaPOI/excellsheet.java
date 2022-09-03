package apaPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellsheet {
 public static void main(String[] args) throws Exception {
	 File scr = new File("C:\\Drivers\\Xceldata.\\testdata.xlsx");
		FileInputStream	fis	= new FileInputStream(scr );
		XSSFWorkbook wbb= new XSSFWorkbook(fis);
		 XSSFSheet  sheet11=      wbb.getSheetAt(0);
		 
		 //using for loop
	 int row	= sheet11.getLastRowNum();
	 System.out.println("total number of row" +row);
	    for( int i=0;i<row;i++) {
	    	
	     String data0 =	sheet11.getRow(i).getCell(0).getStringCellValue();
	     System.out.println("testdata from excel is:::"+data0);
	     System.out.println("data from  row "+i+" is " +data0);
	     
	     
	     wbb.close();
	    }
	 
	    }
	   
	   
	 
	 
	 
}

