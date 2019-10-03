package commonmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import testbase.TestFacebookBase;

public class Commonmethods2 extends TestFacebookBase {
	public static void sendkeys(String Xpath,String data,String element) throws IOException{
		driver.findElement(By.xpath(or.getProperty(Xpath))).sendKeys(data);
		takescreenshots();
		test.log(LogStatus.PASS,element +"has been entered");
		Reporter.log(element+"has been entered");
}
	public static void clickonelement( String Xpath,String element) throws IOException{
		driver.findElement(By.xpath(or.getProperty(Xpath))).click();
		takescreenshots();
		test.log(LogStatus.PASS,element +"has been clicked");
		Reporter.log(element+"has been clicked");
		
	}
	public static void selectelement(String Xpath,String element) throws IOException{
		Select sel=new Select(driver.findElement(By.xpath(or.getProperty(Xpath))));
		sel.selectByVisibleText(element);
		takescreenshots();
		test.log(LogStatus.PASS, element+"has been selected");
		Reporter.log(element+"has been selected");
	}
	public static void selectelementbyindex(String Xpath,int element) throws IOException{
		Select sel=new Select(driver.findElement(By.xpath(or.getProperty("Xpath"))));
		sel.selectByIndex(element);
		takescreenshots();
		test.log(LogStatus.PASS, element+"has been selected");
		Reporter.log(element+"has been selected");
	}
	public static void selectbyvalue(String Xpath,String element) throws IOException{
		Select sel=new Select(driver.findElement(By.xpath(or.getProperty("Xpath"))));
		sel.selectByValue(element);
		takescreenshots();
		test.log(LogStatus.PASS, element+"has been selected");
		Reporter.log(element+"has been selected");
}
	
	
	
}