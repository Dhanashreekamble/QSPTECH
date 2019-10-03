package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testassert {
	@Test
	public static void Asserttestclass(){
	Assert.assertEquals("Dhanashree", "Dhanashree");
	Assert.assertEquals(3, 3, "Test is passed");
	}

}
