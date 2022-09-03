import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	// identify testcase colunm by scannes first row

	public ArrayList<String> getData(String string) throws IOException {
		ArrayList<String> a = new ArrayList();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\gaura\\eclipse-workspace\\ExcelDriven\\excelfile\\Book1.xlsx");

		XSSFWorkbook Workbook = new XSSFWorkbook(file);

		int sheet = Workbook.getNumberOfSheets();
		for (int i = 0; i < sheet; i++) {
			Workbook.getSheetName(i).equalsIgnoreCase("Sheet1");
			{

				XSSFSheet Sheet = Workbook.getSheetAt(i);
				Iterator<Row> rowss = Sheet.iterator();
				Row Firstrow = rowss.next();
				Iterator<Cell> ce = Firstrow.cellIterator();

				int k = 0;
				int coloum = 0;

				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcase")) {
						coloum = k;
					}
					k++;
				}

				System.out.println(coloum);

				// onces colum is then identify then scan enire testcase

				while (rowss.hasNext()) {
					Row r = rowss.next();
					if (r.getCell(coloum).getStringCellValue().equalsIgnoreCase("purches"))
						;
					{
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							a.add(cv.next().getStringCellValue());
						}
					}

				}
				return a;
			}
		}
		return a;
	}

	public static void main(String[] args) throws IOException {

	}
}