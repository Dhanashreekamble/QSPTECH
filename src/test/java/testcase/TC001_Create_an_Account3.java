package testcase;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.relevantcodes.extentreports.LogStatus;

import pages.Createanaccount;
import pages.Homepage;
import testbase.TestBase;

public class TC001_Create_an_Account3 extends TestBase {
	
	@BeforeClass
	public static void isskip(){
		if(!isexecutable("TC001_Create_an_Account3"))	//true		
		throw new SkipException("skipping testcase as its run mode is set to N");
	}
	
	
	@Test(dataProvider="Data_collection")
	public static void TC001_Create_An_Account3(Hashtable<String,String> htdata) throws Exception{
		test = extent.startTest("TC001_Create_An_Account3");
		/*driver.findElement(By.linkText("Sign in")).click();
		Reporter.log("Sign in button has been clicked");
		takescreenshots();
	    test.log(LogStatus.PASS, "Sign in button has been clicked");

	
		
		//driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test.test1234@gmail.com");
		driver.findElement(By.xpath(OR.getProperty("EMail"))).sendKeys(htdata.get("Email_ID"));
		Reporter.log("Email_ID has been entered");
        takescreenshots();
        test.log(LogStatus.PASS, "Email_ID has been entered");
        
        driver.findElement(By.xpath(OR.getProperty("Xsubmit"))).click();
		Reporter.log("submit button has been clicked");
        takescreenshots();
        test.log(LogStatus.PASS, "submit button has been clicked");

        driver.findElement(By.xpath(OR.getProperty("Xgender"))).click();
        Reporter.log("Gender button has been clicked");
		takescreenshots();
        test.log(LogStatus.PASS, "Gender button has been clicked");

        driver.findElement(By.xpath(OR.getProperty("Xfname"))).sendKeys(htdata.get("First_Name"));
        Reporter.log("First_Name has been entered");
		takescreenshots();
       test.log(LogStatus.PASS, "First_Name has been entered");

        driver.findElement(By.xpath(OR.getProperty("Xlastname"))).sendKeys(htdata.get("Last_Name"));
        Reporter.log("Last_Name has been entered");
		takescreenshots();
        test.log(LogStatus.PASS, "Last_Name has been entered");

        driver.findElement(By.xpath(OR.getProperty("Xpwd"))).sendKeys(htdata.get("Password"));
        Reporter.log("Password has been entered");
		takescreenshots();
        test.log(LogStatus.PASS, "Password has been entered");

*/
		 Homepage.creatanaccount(htdata);
	      Createanaccount.resgisterwithcredientials(htdata); 


		
	
	
	}

    

}