package pages;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.Assert;

import commonmethods.CommonMethods;
import testbase.TestBase;

public class Homepage extends TestBase  {

	public static void creatanaccount(Hashtable<String ,String>htdata) throws IOException{
		String Actual_title=driver.getTitle();
		Assert.assertEquals( Actual_title, "My Store");
		passlogstatus("user has been redirected to the"+Actual_title+"appication");
		CommonMethods.clickonelement("Xlogin", "SIGN IN  button");
		 boolean result=CommonMethods.isdisplayed("Xsubmit", "create an account button");
		 Assert.assertEquals(result, true);
		 passlogstatus("create an account section has been displayed");
		 CommonMethods.sendkeys("XEMail", htdata.get("Email_ID"), "Email_ID");
		 CommonMethods.clickonelement("Xsubmit", "submit button");
		 Assert.assertEquals(driver.getTitle(), "Login - My Store");
		 passlogstatus(" Login-My Store section has been displayed");
	
	 

		
}
}
