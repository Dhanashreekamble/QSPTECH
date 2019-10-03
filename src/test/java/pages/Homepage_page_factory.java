package pages;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testbase.TestBase;



public class Homepage_page_factory extends TestBase {
	
	WebDriver driver;
public 	Homepage_page_factory(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
    @FindBy(xpath="//*[@class='login']")
	WebElement Xlogin;
    @FindBy(xpath="//input[@id='email_create']")
   	WebElement XEMail;
    @FindBy(xpath="//*[@id='SubmitCreate']")
   	WebElement Xsubmit;
    @FindBy(xpath="//*[@id='id_gender1']")
  	WebElement Xgender;
    @FindBy(xpath="//*[@id='customer_firstname']")
  	WebElement Xfname;
    @FindBy(xpath="//*[@id='customer_lastname']")
  	WebElement Xlastname;
    @FindBy(xpath="//*[@id='passwd']")
  	WebElement Xpwd;
    @FindBy(xpath="//*[text()='Your personal information']")
   	WebElement Xprsnl;
    @FindBy(xpath="//*[@id='firstname']")
   	WebElement XFN;
    @FindBy(xpath="//*[@id='lastname']")
   	WebElement XLN;
    @FindBy(xpath="//*[@id='company']")
   	WebElement XCOM;
    @FindBy(xpath="//*[@id='address1']")
	WebElement XADD;
    @FindBy(xpath="//*[@id='city']")
	WebElement XCITY;
   // @FindBy(xpath="//*[@id='id_state']")
	//WebElement XSTATE;
   // @FindBy(xpath="//*[@id='phone_mobile']")
	//WebElement XMOB;
    
  public void creatanaccountbtn(Hashtable<String,String>htdata){
	  Xlogin.click();
	  boolean result=Xsubmit.isDisplayed();
	  Assert.assertEquals(result, true);
	  XEMail.sendKeys(htdata.get("Email_ID"));
	  Xsubmit.click();
	  Assert.assertEquals(driver.getTitle(), "Login - My Store");
	  Xgender.click();
	  Xfname.sendKeys( htdata.get("First_Name"));
	  Xlastname.sendKeys(htdata.get("Last_Name"));
	  Xpwd.sendKeys(htdata.get("Password"));
	  boolean result1=Xprsnl.isDisplayed();
	  Assert.assertEquals(result1, true);
	  XFN.sendKeys( htdata.get("First_Name"));
	  XLN.sendKeys( htdata.get("Last_Name"));
	  XCOM.sendKeys("QSP");
	  XADD.sendKeys("pune camp");
	  XCITY.sendKeys("pune");
	  
	  
  }
    
    
    
    
    
    
    
    
    
	


}
