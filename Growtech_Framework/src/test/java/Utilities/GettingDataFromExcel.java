package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import CONSTANTS.constants;

public class GettingDataFromExcel {
	
	//constants obj = new constants(); : not needed as URLPATH is static in nature
	
	public static String getURL() throws IOException
	{
		FileInputStream fs = new FileInputStream(constants.URLPATH);//URLPATH from Constants class to optimize hard code paths
		XSSFWorkbook Workbook1= new XSSFWorkbook(fs);
		XSSFSheet Sheet1=Workbook1.getSheetAt(0);
		XSSFCell value=Sheet1.getRow(1).getCell(0);
		String URL=value.toString();
		System.out.println(URL);
		return URL;
	}
	
	

}
