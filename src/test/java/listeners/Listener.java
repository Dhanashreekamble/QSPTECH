package listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import testbase.TestBase;

public class Listener extends TestBase implements ITestListener {

	public void onFinish(ITestContext arg0) {
		Reporter.log("Test is finished:" + arg0.getName());

	}

	public void onStart(ITestContext arg0) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
}

	public void onTestStart(ITestResult arg0) {
		if (skip == "No")
			LaunchingBrowser();
	}

	public void onTestFailure(ITestResult result) {
		if (!result.isSuccess()) {
			String timestamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
			String methodName = result.getName();
			test.log(LogStatus.FAIL, "Test Case fail due to:- " + result.getThrowable());
			Reporter.log("Test case fail due to:- " + result.getThrowable());

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
						+ "\\src\\test\\resources\\screenShots\\Failed\\" + methodName + "_" + timestamp + ".png";
				File destFile = new File(reportDirectory);

				FileHandler.copy(scrFile, destFile);
				test.log(LogStatus.FAIL, test.addScreenCapture(reportDirectory));
				// Reporter.log("<a href='" + destFile.getAbsolutePath() + "'>
				// <img src='" + destFile.getAbsolutePath()
				// + "' height='100' width='100'/> </a>");

			} catch (IOException e) {
				e.printStackTrace();
			}

			test.log(LogStatus.FAIL, "*** Script execution for " + testcasename + " is Failed. *** ");
			Reporter.log("*** Script execution for " + testcasename + " is Failed. *** ");
		}
		closebrowser();
	}

	public void onTestSuccess(ITestResult result) {
		if (result.isSuccess()) {
			test.log(LogStatus.PASS, " Script execution for " + testcasename + " is completed. ");
			Reporter.log(" Script execution for " + testcasename + " is completed. ");
			closebrowser();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(testcasename + " Test case is skipped by listener as Run mode set to N");
		Reporter.log(testcasename + " Test case is skipped by listener as Run mode set to N");
		// System.out.println(testCaseName +
		// "****************************************************");
		if (skip == "No") {
			Reporter.log("Test case is skipped by listener due to:-:" + result.getMethod().getMethodName());
			test.log(LogStatus.WARNING, "Test case Skipped by listener due to:- " + result.getThrowable());
			closebrowser();
		}
	}

}
