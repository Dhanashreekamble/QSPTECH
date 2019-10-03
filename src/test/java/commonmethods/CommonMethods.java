package commonmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import testbase.TestBase;

public class CommonMethods extends TestBase {
	
public static void clickonelement( String Xpath,String element) throws IOException{
	try{
	driver.findElement(By.xpath(OR.getProperty(Xpath))).click();
	takescreenshots();
	test.log(LogStatus.PASS,element +"has been clicked");
	Reporter.log(element+"has been clicked");
	}catch(Throwable t){
	System.out.println("I am in exception method"+t.getMessage());
	test.log(LogStatus.FAIL,element +"is not clicked beacause of"+t.getMessage());
	takescreenshots();

		
	}
	
}
public static void sendkeys(String Xpath,String data,String element) throws IOException{
	try{
	driver.findElement(By.xpath(OR.getProperty(Xpath))).sendKeys(data);
	takescreenshots();
	test.log(LogStatus.PASS,element +"has been entered");
	Reporter.log(element+"has been entered");
	}catch(Throwable t){
		System.out.println("I am in exception method"+t.getMessage());
		test.log(LogStatus.FAIL,"unable to enter testdata in:-"+element+" beacause of"+t.getMessage());
		takescreenshots();

		
	}
}
public static boolean isdisplayed(String xpath,String webelement){
	try {
		driver.findElement(By.xpath(OR.getProperty(xpath))).isDisplayed();
		return true;
	
	} catch (Exception e) {
	}
	return false;
}



/*public static void selectbyvalue(String Xpath,String value) throws IOException{
	Select sel=new Select(driver.findElement(By.xpath(OR.getProperty(Xpath))));
	takescreenshots();
	test.log(LogStatus.PASS,value +"has been entered");
	Reporter.log(value+"has been entered");
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	





