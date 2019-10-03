package pages;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;

import commonmethods.CommonMethods;
import testbase.TestBase;

public class Createanaccount extends TestBase {
	
	public static void resgisterwithcredientials(Hashtable<String ,String>htdata) throws IOException{
		Assert.assertEquals(driver.getTitle(),"Login - My Store");
		passlogstatus("user has been redirected to"+driver.getTitle() +"application");
		boolean result=driver.findElement(By.xpath(OR.getProperty("Xprsnl"))).isDisplayed();
		Assert.assertEquals(result, true);
		CommonMethods.clickonelement("Xgender", "Gender button");
		CommonMethods.sendkeys("Xfname", htdata.get("First_Name"), "First_Name");
		CommonMethods.sendkeys("Xlastname", htdata.get("Last_Name"), "Last_Name");
		CommonMethods.sendkeys("Xpwd", htdata.get("Password"), "Password");
		boolean result1=driver.findElement(By.xpath(OR.getProperty("Xaddtext"))).isDisplayed();
		Assert.assertEquals(result1, true);
		CommonMethods.sendkeys("XFN", htdata.get("First_Name"), "First_Name");
		CommonMethods.sendkeys("XLN", htdata.get("Last_Name"), "Last_Name");
		CommonMethods.sendkeys("XCOM", "QSP", "company name");
		CommonMethods.sendkeys("XADD", "pune camp", "Address");
		CommonMethods.sendkeys("XCITY", "pune", "city name");
		

		
	}

	
}
