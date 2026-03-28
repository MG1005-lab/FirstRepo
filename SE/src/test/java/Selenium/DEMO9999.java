package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DEMO9999 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\mohin\\Downloads\\PT.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		XSSFWorkbook f2 = new XSSFWorkbook(f1);
		XSSFSheet f3 = f2.getSheetAt(0);

		String s = f3.getRow(1).getCell(0).getStringCellValue();
		System.out.println(s);
		double t = f3.getRow(3).getCell(1).getNumericCellValue();
		System.out.println(t);
		CellType g = f3.getRow(1).getCell(0).getCellType();
		System.out.println(g);
		CellType h = f3.getRow(3).getCell(1).getCellType();
		System.out.println(h);

	}

}
