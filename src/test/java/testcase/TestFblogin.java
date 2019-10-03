package testcase;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commonmethods.Commonmethods2;
import testbase.TestFacebookBase;

public class TestFblogin extends  TestFacebookBase{
	@BeforeClass
	public static void isskip(){
		if(!isexecutable("testcase3"))
			throw new SkipException("skipping testcase if runmode is N");

}
	@Test(dataProvider="Data_collection")
	public static void TestFbLogin(Hashtable<String, String>htdata) throws IOException{
		Commonmethods2.sendkeys("XMAIL",htdata.get("emailid") , "Emailid");
		Commonmethods2.sendkeys("XPASS",htdata.get("passwrd") , "password");
		Commonmethods2.clickonelement("XLOGIN", "login button");
		
	}
	
	
	
	}

