package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Epvxifinp 
{

	//private static String AID = "";
	public static void main(String[] args) throws InterruptedException, FindFailed, IOException 
	{
		// TODO Auto-generated method stub
	/*	File inputFile = new File("/home/administrator/eclipse-workspace/Demomaven/input/file1_to_process.xlsx");

		FileInputStream file = new FileInputStream(inputFile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		int topCount = sheet.getPhysicalNumberOfRows();
		
		Iterator<Row> rowIterator = sheet.iterator();
		int count = 0;
		int headerAvoid = 0;
		
		while (rowIterator.hasNext())
		{

			if (headerAvoid == 0) 
			{
				rowIterator.next();
			}
			headerAvoid = 1;
			Row row = rowIterator.next();

			// For each row, iterate through all the columns
			Iterator<Cell> cellIterator = row.cellIterator();
			boolean num_flag = false;
			while (cellIterator.hasNext()) 
			{
				Cell cell = cellIterator.next();
				// Check the cell type and format accordingly
				cell.setCellType(Cell.CELL_TYPE_STRING);
				if ((cell.getCellType() == Cell.CELL_TYPE_STRING)) 
				{
					count = count + 1;

					if (count == 4) 
					{
						AID = cell.getStringCellValue();
						continue;
					}
					continue;
				}
				if (count == 6) 
				{
						// ERRNOTE = cell.getStringCellValue();
						count = 0;
						continue;
				}
				count = 0;
			}
			System.out.println("AID - " + AID);
			System.out.println();
		
			
		}*/
		

//----------------------------
	    sleep(5000);
		Keyboard keyboard = new DesktopKeyboard();
		ImagePath.setBundlePath("/home/administrator/eclipse-workspace/Demomaven/input-images");
		Screen s=new Screen();
		// Eligibility Verification process view - xifin
		System.setProperty("webdriver.chrome.driver","/home/administrator/eclipse-workspace/Demomaven/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://osbremote.xifin.net/portal/webclient/index.html");
		sleep(10000);
		s.click("accept.png");
		sleep(5000);
		s.type("usrname.png","cthar_pnataraj");
		
		sleep(2000);
		s.type("passwrd.png","Thar@123456789");
		sleep(2000);
		s.click("lginbtn.png");
		sleep(10000);
		s.click("cntrl.png");
		sleep(50000);
		s.doubleClick("xifindesktpicn.png");
		sleep(50000);
		keyboard.keyDown(Keys.F11);
		sleep(40000);
		s.type("xifinemail.png","keerthana.shetty@tharworx.com");
		sleep(2000);
		s.type("xifinpasswd.png","Thar@123");
		sleep(2000);
		s.click("xifinlogin.png");
		sleep(5000);
		s.click("xifinapp.png");
		sleep(3000);
		s.wait("accesion.png",10);
		s.hover("accesion.png");
		sleep(3000);
		s.click("detials.png");
		sleep(2000);
		String AID=" 105286136-2101";
		s.type("accesseninputbox.png",AID);
		sleep(2000);
		s.click("accessensearchbtn.png");
		
		//file.close();
		
	}
	public static void sleep(int sleepTime) throws InterruptedException 
	{
		Thread.sleep(sleepTime);
	}
}
