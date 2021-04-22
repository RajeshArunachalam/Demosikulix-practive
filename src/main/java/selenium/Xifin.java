package selenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class Xifin {
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] arg) throws InterruptedException, IOException
	{
		//getRowcount();
		getxifin();
		
	}
	
	public static void getxifin() throws InterruptedException
	{
		int rr=0;
		sleep(5000);
		Keyboard keyboard = new DesktopKeyboard();
		ImagePath.setBundlePath("/home/administrator/eclipse-workspace/Developments/Images");
		Screen s=new Screen();
		// Eligibility Verification process view - xifin
		projectpath=System.getProperty("user.dir");
		
		
		try 
		{
			workbook=new XSSFWorkbook(projectpath+"/input/file1_to_process.xlsx");
		} 
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.setProperty("webdriver.chrome.driver","/home/administrator/eclipse-workspace/Demomaven/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		try
		{
		sleep(5000);
		driver.get("https://osbremote.xifin.net/portal/webclient/index.html");
		sleep(10000);
		keyboard.keyDown(Keys.F11);
		keyboard.keyUp(Keys.F11);
		sleep(3000);
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
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		outer:
		for(int j=1; j<rowCount; j++)
		{
				
			try 
				{
			
					/*projectpath=System.getProperty("user.dir");
					workbook=new XSSFWorkbook(projectpath+"/input/file1_to_process.xlsx");
					sheet=workbook.getSheet("Sheet1");*/
					
					sleep(3000);
					s.doubleClick("xifindesktpicn.png");
					sleep(20000);
					int count1 = 0;
					while (count1 < 50) 
					{
						count1 += 1;

						try 
						{
							sleep(10);
							keyboard.keyDown(Keys.BACKSPACE);
							keyboard.keyUp(Keys.BACKSPACE);
							keyboard.keyDown(Keys.DELETE);
							keyboard.keyUp(Keys.DELETE);

						} 
						catch (Exception e) 
						{
							// logger.error("backspace/del op failed.");
						}
					}
						
						s.type("xifinemail.png","keerthana.shetty@tharworx.com");
						sleep(3000);
						while (count1 < 50) 
						{
							count1 += 1;

							try 
							{
								sleep(10);
								keyboard.keyDown(Keys.BACKSPACE);
								keyboard.keyUp(Keys.BACKSPACE);
								keyboard.keyDown(Keys.DELETE);
								keyboard.keyUp(Keys.DELETE);

							} 
							catch (Exception e) 
							{
								// logger.error("backspace/del op failed.");
							}
						}
						s.type("xifinpasswd.png","Thar@123");
						sleep(2000);
						s.click("xifinlogin.png");
						sleep(5000);
						s.click("xifinapp.png");
						sleep(3000);
						s.wait("accesion.png",10);
						s.hover("accesion.png");
						sleep(5000);
						s.click("detials.png");
						sleep(3000);
						System.out.println("No of rows :"+rowCount);
						rr=rr+1;
						label:
						for (int r=rr; r<=rowCount; r++)
						{
							String id=sheet.getRow(r).getCell(3).getStringCellValue();
							System.out.println("Accesion id:" +id);
							//getCelldata(r);
							s.type("accesseninputbox.png",id);
							break label;
						}
						sleep (3000);
						s.click("accessensearchbtn.png");
						sleep(15000);
						s.click("/home/administrator/eclipse-workspace/Demomaven/input-images/temp.png");
						sleep(8000);
						s.click("/home/administrator/eclipse-workspace/Demomaven/input-images/temp1.png");
						sleep(8000);
						//s.click("close1.png");
						keyboard.keyDown(Keys.F11);
						keyboard.keyUp(Keys.F11);
						sleep(9000);
						s.click("/home/administrator/eclipse-workspace/Demomaven/input-images/closewindow.png");
						sleep(9000);
						
							
					} 
					catch (FindFailed e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			continue outer;
				}
		}
		public static void sleep(int sleepTime) throws InterruptedException 
		{
			Thread.sleep(sleepTime);
		}

}
