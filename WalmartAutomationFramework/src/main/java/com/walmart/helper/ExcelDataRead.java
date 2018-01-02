package com.walmart.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {
	
	static Log logger= null;
	public static Object[][] getExcelData(String sheetName, String fileName){
		Object[][] data= null;
		
		try {
			XSSFWorkbook wb= new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"//Data//"+fileName));
		    XSSFSheet sheet= wb.getSheet(sheetName);
		    int noOfRow= sheet.getLastRowNum();
		    data= new Object[noOfRow][];
		    for(int i=1; i<=noOfRow; i++){
		    	Row row= sheet.getRow(i);
		    	int noOfCell= row.getLastCellNum();
		    	String[] strarray= new String[noOfCell];
		    	for(int j=0; j<noOfCell; j++){
		    		strarray[j]= row.getCell(j).getStringCellValue();
		    		data[i-1]=strarray;
		    	}
		    }
		
		} catch (FileNotFoundException e) {
			logger.error("File not found- please give correct file details");
		
		} catch (IOException e) {
			logger.error("Issue reading the given config file");
			
		}		
		return data;
	}

}
