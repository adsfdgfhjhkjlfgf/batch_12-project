package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_11 {

	private static char[] data_1;

	public static void main(String[] args) throws IOException {
String path="C:\\Users\\lenovo\\eclipse-workspace\\batch_12_project\\test_data";
FileInputStream fis=new FileInputStream(path); 
XSSFWorkbook wb=new XSSFWorkbook(fis);
wb.getSheet("sheet_1").getRow(0).getCell(0).getRichStringCellValue();
System.out.println(data_1);
wb.getSheet("sheet_1").getRow(0).getCell(0).getRichStringCellValue();
System.out.println("data_2");



	}

}
