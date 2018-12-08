package com.bml.qa.testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readExcel 
{
    static Workbook workbook;
    static Sheet    sheet;
    static FileInputStream fis;
    
    static String filename=System.getProperty("user.dir")+"/src/main/java/com/bml/qa/testData/Test Data.xlsx";
    
    public static Object[][] readExcelFile() throws IOException
    {
    	fis=new FileInputStream(filename);
    	
    	String fileext=filename.substring(filename.indexOf("."));
    	
    	if(fileext.contains(".xlsx"))
    	{
    		workbook=new XSSFWorkbook(fis);
    	}
    	else if(fileext.contains(".xls"))
    	{
    		workbook=new HSSFWorkbook(fis);
    	}
    	
    	sheet=workbook.getSheet("login");
    	
    	int rowCount=sheet.getLastRowNum();
    	int colCount=sheet.getRow(0).getLastCellNum();
    	
    	Object[][] obj=new Object[rowCount][colCount];
    	
    	for(int i=0;i<rowCount;i++)
    	{
    		for(int j=0;j<colCount;j++)
    		{
    			obj[i][j]=sheet.getRow(i+1).getCell(j).toString();
    			
    			//System.out.println(obj[i][j]);
    		}
    	}
    	
    	return obj;
    		
    }
	
    
}
