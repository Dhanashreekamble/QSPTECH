package testcase;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;

public class ReadingDataFromXlxs {
	static ExcelReader excel=new ExcelReader("C:\\Users\\JAY GANESH\\Documents\\Master_Sheet.xlsx");
	@Test(dataProvider="Data_Collection")
	public static void readingdatafromxlxs(Hashtable<String,String>htdata){
		
		//ExcelReader excel=new ExcelReader("C:\\Users\\JAY GANESH\\Documents\\Master_Sheet.xlsx");
		//excel.addSheet("newsheet2");
		//excel.removeSheet("newsheet2");
		//excel.removeColumn("Test_Cases", 5);
		//System.out.println(excel.getCellData("Test_Cases", 1, 6));
		//excel.isSheetExist("Test_Data");
		//excel.setCellData("Test_Cases", "Run_Mode", 7, "Y");
		System.out.println("getting data fromxlsx using dataprovider" +htdata.get("First_Name"));
	}
	@DataProvider
	public static Object[][] Data_Collection(){
		DataCollection dc=new DataCollection(excel, "Test_Data", "TC001_Create_an_Account");
		return dc.dataArray();
	}
	
	
	
	
	//@Test
     public void hashtable(){
    	 Hashtable<String,String>htdata=new Hashtable<String,String>();
    	 htdata.put("firstname", "Dhanashree");
    	 htdata.put("firstname1", "rabiya");
    	 htdata.put("firstname2", "shreya");
    	 htdata.put("firstname3", "prashant");
    	 htdata.put("firstname4", "ritu");
    	 System.out.println(htdata.get("firstname2"));
    	 

     }
	
	
}
