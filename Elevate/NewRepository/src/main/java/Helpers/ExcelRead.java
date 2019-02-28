
	package Helpers;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Iterator;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.ss.usermodel.Row;

	public class ExcelRead {

		public ArrayList<String> readExcel(int colNo) throws IOException {
			FileInputStream fis = new FileInputStream("C:\\Users\\Purnima.Bej\\Desktop\\Data.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Login");

			Iterator<Row> rowit = sh.iterator();
			rowit.next();

			ArrayList<String> list = new ArrayList<String>();

			while (rowit.hasNext()) {
				list.add(rowit.next().getCell(colNo).getStringCellValue());
			}
			System.out.println("list......." + list);
			return list;
		}

		public static void main(String[] args) throws IOException {
			ExcelRead data = new ExcelRead();
			data.readExcel(0);
			data.readExcel(1);
		}
	}


