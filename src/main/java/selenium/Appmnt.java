package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;

public class Appmnt {

	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		// TODO Auto-generated method stub
		sleep(5000);
		ImagePath.setBundlePath("/home/administrator/eclipse-workspace/Demomaven/input-images");
		Screen skl=new Screen();
		//static Screen screen = new Screen();
		System.setProperty("webdriver.chrome.driver","/home/administrator/eclipse-workspace/Demomaven/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vims.ac.in/healthcare/appointment.html");
		skl.click("title-schema.png");
		skl.wait(("title-schema.png"),10);
		skl.click("title-DR.png");
		skl.type("fname.png","abc");
		skl.type("mname.png","zxc");
		skl.type("lname.png","zzz");
		skl.type("emailname.png","abc@super.com");
			
	}
	public static void sleep(int sleepTime) throws InterruptedException {
		Thread.sleep(sleepTime);
	}

}
