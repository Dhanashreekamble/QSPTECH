package testcase;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commonmethods.CommonMethods;
import pages.Createanaccount;
import pages.Homepage;
import pages.Homepage_page_factory;
import testbase.TestBase;

public class TC001_Create_an_Account6 extends TestBase {

	@BeforeClass
	public static void isskip() {
		if (!isexecutable("TC001_Create_an_Account")) // true
			throw new SkipException("skipping testcase as its run mode is set to N");
	}

	@Test(dataProvider = "Data_collection")
	public static void TC001_Create_An_Account(Hashtable<String, String> htdata) throws Exception {
		// test = extent.startTest("TC001_Create_An_Account");
		//driver.findElement(By.linkText("Sign in")).click();
		//Reporter.log("Sign in button has been clicked");
		//takescreenshots();
		//test.log(LogStatus.PASS, "Sign in button has been clicked");
		//CommonMethods.clickonelement("Xlogin", "submit button");


		// driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test.test1234@gmail.com");
		//driver.findElement(By.xpath(OR.getProperty("XEMail"))).sendKeys(htdata.get("Email_ID"));
		//Reporter.log("Email_ID has been entered");
		//takescreenshots();

		//test.log(LogStatus.PASS, "Email_ID has been entered");
		//CommonMethods.sendkeys("XEMail", htdata.get("Email_ID"), "Email_ID");
		
		// driver.findElement(By.xpath(OR.getProperty("Xsubmit"))).click();
		// Reporter.log("submit button has been clicked");
		// takescreenshots();
		// test.log(LogStatus.PASS, "submit button has been clicked");
		//CommonMethods.clickonelement("Xsubmit", "submit button");
		
		Homepage_page_factory hppf= new Homepage_page_factory(driver);
		 hppf.creatanaccountbtn(htdata);
		//Homepage.creatanaccount(htdata);

		// driver.findElement(By.xpath(OR.getProperty("Xgender"))).click();
		// Reporter.log("Gender button has been clicked");
		// takescreenshots();
		// test.log(LogStatus.PASS, "Gender button has been clicked");
		//CommonMethods.clickonelement("Xgender", "Gender button");

		// driver.findElement(By.xpath(OR.getProperty("Xfname"))).sendKeys(htdata.get("First_Name"));
		// Reporter.log("First_Name has been entered");
		// takescreenshots();
		// test.log(LogStatus.PASS, "First_Name has been entered");
		//CommonMethods.sendkeys("Xfname", htdata.get("First_Name"), "First_Name");

		// driver.findElement(By.xpath(OR.getProperty("Xlastname"))).sendKeys(htdata.get("Last_Name"));
		// Reporter.log("Last_Name has been entered");
		// takescreenshots();
		// test.log(LogStatus.PASS, "Last_Name has been entered");
		//CommonMethods.sendkeys("Xlastname", htdata.get("Last_Name"), "Last_Name");

		// driver.findElement(By.xpath(OR.getProperty("Xpwd"))).sendKeys(htdata.get("Password"));
		// Reporter.log("Password has been entered");
		// takescreenshots();
		// test.log(LogStatus.PASS, "Password has been entered");
		//CommonMethods.sendkeys("Xpwd", htdata.get("Password"), "Password");
		 
		//Createanaccount.resgisterwithcredientials(htdata);
		
		
		/*Select sel=new Select(driver.findElement(By.xpath(OR.getProperty("Xdays"))));
		sel.selectByValue("26");
		Select sel1=new Select(driver.findElement(By.xpath(OR.getProperty("Xmnth"))));
		sel.selectByIndex(6);
		Select sel2=new Select(driver.findElement(By.xpath(OR.getProperty("Xyear"))));
		sel.selectByIndex(6);
*/

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}