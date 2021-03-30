package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Format;
import java.util.Date;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.sikuli.script.FindFailed;

public class ExcelTest 
{
	private static String firstName="";
	private static String lastName="";
	private static String PSID="";
	private static String AID="";
	private static String DOS="";
	
	static FileOutputStream failedLog=null;
	
	public static void main(String arg[]) throws FindFailed, InterruptedException, IOException
	{
		File inputFile=new File("/home/administrator/eclipse-workspace/Demomaven/input/input.xlsx");
		FileInputStream file=new FileInputStream(inputFile);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		int topCount=sheet.getPhysicalNumberOfRows();
		
		//Iterator rowIterator=(Iterator) sheet.iterator();
		Iterator<Row> rowIterator=sheet.iterator();
		int count=0;
		int headerAvoid=0;
		while(rowIterator.hasNext())
		{
			if (headerAvoid==0)
			{
				rowIterator.next();
			}
			headerAvoid=1;
			Row row=rowIterator.next();
			
			Iterator<Cell> cellIterator=row.cellIterator();
			boolean num_flag=false;
			while(cellIterator.hasNext())
			{
				Cell cell=cellIterator.next();
				cell.setCellType(Cell.CELL_TYPE_STRING);
				if((cell.getCellType()==Cell.CELL_TYPE_STRING))
				{
					count=count+1;
					if(count == 1)
					{
						firstName=cell.getStringCellValue();
						continue;
					}
					if(count == 2)
					{
						lastName=cell.getStringCellValue();
						continue;
					}
					if(count == 3)
					{
						PSID=cell.getStringCellValue();
						continue;
					}
					if(count == 4)
					{
						AID=cell.getStringCellValue();
						continue;
					}
					if(count == 5)
					{
						try
						{
							DOS=cell.getStringCellValue();
							if(DOS.contains("/"))
							{
								//System.out.println("Date is in correct formate");
							}
							else
							{
								throw new Exception("Date is in in-correct formate");
							}
						}
						catch (Exception e)
						{
							System.out.println("converting to correct formate");
							Date javaDate=DateUtil.getJavaDate(Double.parseDouble(cell.getStringCellValue()));
							DOS=new SimpleDateFormate("dd/MM/yyyy").formate(javaDate);
						}
						continue;
					}
					if(count==6)
					{
						count=0;
						continue;
					}
					count=0;
				}
				
			}
			System.out.println("firstName	-" +firstName);
			System.out.println("lastName	-" +lastName);
			System.out.println("PSID	-" +PSID);
			System.out.println("AID		-" +AID);
			System.out.println("DOS		-" +DOS);
			System.out.println();
		}
		file.close();
	}
}