package Demomaven.Demomaven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static void main(String arg[])
	{
		getRowCount();
	}
	
	public static void getRowCount()
	{
		try
		{
			String projectpath=System.getProperty("user.dir");
			XSSFWorkbook workbook=new XSSFWorkbook(projectpath+"/input/inputj.xlsx");
			XSSFSheet sheet= workbook.getSheet("Sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("no of rows :" +rowCount);
		}
		catch (Exception e)
		{
			
		}
	}

}
