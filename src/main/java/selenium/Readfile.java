package selenium;
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfile 
{
	private static String fristName="";
	private static String lastName="";
	private static String PSID = "";
	public static String AID = "";
	private static String DOS = "";
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File file=new File("/home/administrator/eclipse-workspace/Demomaven/input/file1_to_process.xlsx");
		
		FileInputStream inputStream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for (int r=1; r<=rowCount; r++)
		{
			int cellCount=sheet.getRow(r).getLastCellNum();
			for(int c=0; c<cellCount; c++)
			{
				Row row=sheet.getRow(r);
				Cell cell=row.getCell(c);
				if (c==0)
				{
					fristName=cell.getStringCellValue();
					//System.out.println(fristName);
				}
				if (c==1)
				{
					lastName=cell.getStringCellValue();
					//System.out.println(lastName);
				}
				if (c==2)
				{
					PSID=cell.getStringCellValue();
					//System.out.println(PSID);
				}
				if (c==3)
				{
					AID=cell.getStringCellValue();
					//System.out.println(AID);
				}
				if (c==4)
				{
					DOS=cell.getStringCellValue();
					//System.out.println(DOS);
					
					System.out.println("firstName :"+fristName);
					System.out.println("lastname :"+lastName);
					System.out.println("PSID :"+PSID);
					System.out.println("AID :" +AID);
					System.out.println("DOS :" +DOS);
				}
				
				}
			System.out.println();
		}
		
	}
	public static void sleep(int sleepTime) throws InterruptedException {
		Thread.sleep(sleepTime);
	}

}
