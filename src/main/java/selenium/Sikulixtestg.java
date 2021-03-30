package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikulixtestg {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		 //TODO Auto-generated method stub
		sleep(5000);
		Screen s=new Screen();
		// selenium Task
		System.setProperty("webdriver.chrome.driver","/home/administrator/eclipse-workspace/Demomaven/chromedriver");
		WebDriver driver=new ChromeDriver();
		/* driver.get("https://www.apsrtconline.in/oprs-web/guest/ticket/cancel.do");
		s.type("/home/administrator/eclipse-workspace/Demomaven/tno.png","1234");
		s.type("/home/administrator/eclipse-workspace/Demomaven/uidno.png","9876");
		s.type("/home/administrator/eclipse-workspace/Demomaven/mno.png","1234567890");
		s.click("/home/administrator/eclipse-workspace/Demomaven/srchbtn.png");
		s.click("/home/administrator/eclipse-workspace/Demomaven/okbtn.png");
		s.click("/home/administrator/eclipse-workspace/Demomaven/closebtn.png"); 
				
		// Desktop Task
		sleep(2000);
		s.click("/home/administrator/eclipse-workspace/Demomaven/iconorin.png");
		//s.click("/home/administrator/eclipse-workspace/Demomaven/nextdesktp.png");
		sleep(2000);
		s.type("/home/administrator/eclipse-workspace/Demomaven/ubuntusrch.png","Text Editor");
		sleep(2000);
		s.click("/home/administrator/Pictures/txteditor.png");
		sleep(2000);
		s.type("/home/administrator/eclipse-workspace/Demomaven/textpad.png","First sikulix");
		s.click("/home/administrator/eclipse-workspace/Demomaven/save.png");
		s.doubleClick("/home/administrator/eclipse-workspace/Demomaven/Desktop.png");
		s.type("/home/administrator/eclipse-workspace/Demomaven/filenametyp.png","text.txt");
		s.click("/home/administrator/eclipse-workspace/Demomaven/savebutton.png");
		s.click("/home/administrator/eclipse-workspace/Demomaven/closebtn.png");*/
		
		//xifinlogin
		/* driver.get("https://osbremote.xifin.net/portal/webclient/index.html");
		sleep(10000);
		s.click("/home/administrator/eclipse-workspace/Demomaven/images/accept.png");
		sleep(5000);
		s.type("/home/administrator/eclipse-workspace/Demomaven/images/usrname.png","cthar_kshetty");
		sleep(2000);
		s.type("/home/administrator/eclipse-workspace/Demomaven/images/passwrd.png","Thar&123456789");
		sleep(2000);
		s.click("/home/administrator/eclipse-workspace/Demomaven/images/lginbtn.png");
		sleep(10000);
		s.click("/home/administrator/eclipse-workspace/Demomaven/images/cntrl.png");
		sleep(50000);
		s.doubleClick("/home/administrator/eclipse-workspace/Demomaven/images/xifindesktpicn.png");
		sleep(50000);
		s.type("/home/administrator/eclipse-workspace/Demomaven/images/email.png","keerthana.shetty@tharworx.com");
		sleep(2000);
		s.type("/home/administrator/eclipse-workspace/Demomaven/images/passrd.png","Thar@123");
		sleep(2000);
		s.click("/home/administrator/eclipse-workspace/Demomaven/images/xifinlogin.png");*/
		
	}
	public static void sleep(int sleepTime) throws InterruptedException {
		Thread.sleep(sleepTime);
	}
}
