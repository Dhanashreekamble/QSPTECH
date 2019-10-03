package testcase;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commonmethods.CommonMethods;
import commonmethods.Commonmethods2;
import testbase.TestFacebookBase;

public class TestFacebookTestcase extends TestFacebookBase {
	@BeforeClass
	public static void isskip(){
		if(!isexecutable("testcase1"))
			throw new SkipException("skipping testcase if runmode is N");
	}

	@Test(dataProvider="Data_collection")
	public static void testcase1new(Hashtable<String, String>htdata) throws IOException{
		
		Commonmethods2 .sendkeys("XFNAME", htdata.get("firstname"), "firstname");
		
		Commonmethods2 .sendkeys("XLNAME", htdata.get("surname"), "surname");

		Commonmethods2 .sendkeys("XMOB", htdata.get("mobnum"), "mobnum");

		Commonmethods2 .sendkeys("XNEW", htdata.get("password"), "password");
		Commonmethods2 .clickonelement("XGENDER", "Gender");


		
		/*Select sel=new Select(driver.findElement(By.xpath(or.getProperty("XDAY"))));
		sel.selectByVisibleText("6");
		takescreenshots();
		Reporter.log("date has been selected");
		test.log(LogStatus.PASS, "date has been selected");*/
		//Commonmethods2.selectelementbyindex("XDAY", '6');
		//Commonmethods2.selectbyvalue("XDAY", "6");


		/*Select sel1=new Select(driver.findElement(By.xpath(or.getProperty("XMONTH"))));
		sel1.selectByVisibleText("May");
		takescreenshots();
		Reporter.log("month has been selected");
		test.log(LogStatus.PASS, "month has been selected");
		*/
        Commonmethods2.selectelement("XMONTH", "May");
		
		/*Select sel2=new Select(driver.findElement(By.xpath(or.getProperty("XYEAR"))));
		sel2.selectByVisibleText("2001");
		takescreenshots();
		Reporter.log("year has been selected");
		test.log(LogStatus.PASS, "year has been selected");
       */
		Commonmethods2.selectelement("XYEAR", "2001");
		
	}
	
	
	
	
	
}
