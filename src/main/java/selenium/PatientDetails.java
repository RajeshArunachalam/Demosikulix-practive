package selenium;
import java.io.*;
public class PatientDetails 
{
	public String fName="";
	public String lName="";
	public String pSID = "";
	public String aID = "";
	public String dOS = "";
	
	public PatientDetails(String fristName)
	{
		fName=fristName;
	}
	public void lastName(String lastName)
	{
		lName=lastName;
	}
	public void PSID(String PSID)
	{
		pSID=PSID;
	}
	public void AID(String AID)
	{
		aID=AID;
	}
	public void DOS(String DOS)
	{
		dOS=DOS;
	}
	public void Exceldetials()
	{
		System.out.println("fName:" +fName);
		System.out.println("lName:" +lName);
		System.out.println("PSID :" +pSID);
		System.out.println("AID:" +aID);
		System.out.println("DOS :" +dOS);
	}
}
