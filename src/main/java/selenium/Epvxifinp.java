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
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
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
		Readfile aid=new Readfile();
		String AIDD="AID";
		s.type("accesseninputbox.png",AIDD);
		sleep(2000);
		s.click("accessensearchbtn.png");
		
		
		//file.close();
		
	}
	public static void sleep(int sleepTime) throws InterruptedException 
	{
		Thread.sleep(sleepTime);
	}
}
