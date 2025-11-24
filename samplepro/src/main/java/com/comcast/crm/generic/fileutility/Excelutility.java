package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {

public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
{
	FileInputStream fis =new FileInputStream("./Excelfile/TestData1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
String datas = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	return datas;
	
}
public int getRowcount(String Sheetname) throws EncryptedDocumentException, IOException
{
	FileInputStream fis =new FileInputStream("./Excelfile/TestData1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
     int rowcount=wb.getSheet(Sheetname).getLastRowNum();
     return rowcount;
}
public void SetdataintoExcel(String Sheetname,int rownum,int celnum,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis =new FileInputStream("./Excelfile/TestData1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
    wb.getSheet(Sheetname).getRow(rownum).createCell(celnum);
    FileOutputStream fos =new FileOutputStream("./Excelfile/TestData1.xlsx");
    wb.write(fos);
    wb.close();
	}
	
}
