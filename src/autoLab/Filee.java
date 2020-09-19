package autoLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filee {
public static void main(String[] args) throws Exception {
	File src=new File("D:\\anexcel\\salray.xlsx");
	FileInputStream file=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String text = sheet1.getRow(0).getCell(2).getStringCellValue();
	System.out.println(text);
	sheet1.getRow(0).createCell(5).setCellValue("accounttype");
	sheet1.getRow(1).createCell(5).setCellValue("saving");
	FileOutputStream fout=new FileOutputStream(src);
	wb.write(fout);
	wb.close();
}
}
