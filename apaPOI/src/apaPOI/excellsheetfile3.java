package apaPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellsheetfile3 {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\\\Drivers\\\\Xceldata.\\\\testdata.xlsx");

		XSSFWorkbook Workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = Workbook.getSheet("Sheet1");

		int rowcount = Sheet.getLastRowNum();
		int colcoum = Sheet.getRow(0).getLastCellNum();

		for (int i = 0; i < rowcount; i++) {

			XSSFRow currentRow = Sheet.getRow(i);

			for (int j = 0; j < colcoum; j++) {
				String value = currentRow.getCell(j).toString();
				System.out.println(value);

			}
			System.out.println();

		}

	}

}
