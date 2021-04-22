package Demomaven.Demomaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		sleep(5000);
		Keyboard keyboard = new DesktopKeyboard();
		ImagePath.setBundlePath("/home/administrator/eclipse-workspace/Demomaven/serch-image");
		Screen s=new Screen();
		// Eligibility Verification process view - xifin
		System.setProperty("webdriver.chrome.driver","/home/administrator/eclipse-workspace/Demomaven/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wordpress.org/plugins/user-registration/");
		sleep(5000);
		try
		{
			
			s.type("type.png","jenkins");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		try {
			s.click("srch.png");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sleep(int sleepTime) throws InterruptedException 
	{
		Thread.sleep(sleepTime);
	}

}
