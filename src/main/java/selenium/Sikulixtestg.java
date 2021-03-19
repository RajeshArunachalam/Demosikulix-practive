package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikulixtestg {

	public static void main(String[] args) throws FindFailed {
		 //TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Screen s=new Screen();
		
		// selenium Task
		/*System.setProperty("webdriver.chrome.driver","/home/administrator/eclipse-workspace/Demomaven/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/ticket/cancel.do");
		s.type("/home/administrator/eclipse-workspace/Demomaven/tno.png","1234");
		s.type("/home/administrator/eclipse-workspace/Demomaven/uidno.png","9876");
		s.type("/home/administrator/eclipse-workspace/Demomaven/mno.png","1234567890");
		s.click("/home/administrator/eclipse-workspace/Demomaven/srchbtn.png");
		s.click("/home/administrator/eclipse-workspace/Demomaven/okbtn.png");
		s.click("/home/administrator/eclipse-workspace/Demomaven/closebtn.png"); */
				
		// Desktop Task
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.click("/home/administrator/eclipse-workspace/Demomaven/iconorin.png");
		s.click("/home/administrator/eclipse-workspace/Demomaven/nextdesktp.png");
		s.type("/home/administrator/eclipse-workspace/Demomaven/ubuntusrch.png","Text Editor");
		s.click("/home/administrator/Pictures/txteditor.png");
		s.type("/home/administrator/eclipse-workspace/Demomaven/textpad.png","First sikulix");
		s.click("/home/administrator/eclipse-workspace/Demomaven/save.png");
		s.doubleClick("/home/administrator/eclipse-workspace/Demomaven/Desktop.png");
		s.type("/home/administrator/eclipse-workspace/Demomaven/filenametyp.png","text.txt");
		s.click("/home/administrator/eclipse-workspace/Demomaven/savebutton.png");
		s.click("/home/administrator/eclipse-workspace/Demomaven/closebtn.png");
	}
}
