package com.Qsptech1.Projectname.Modulename;



import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationWorldByRahul.SeleniumTraining.DataCollection;
import com.AutomationWorldByRahul.SeleniumTraining.ExcelReader;


public class ReadingDataFromXlsx {
	static ExcelReader excel=new ExcelReader("C:\\Users\\JAY GANESH\\Documents\\Master_Sheet.xlsx");	

    @Test(dataProvider="Data_Collections")
	public static void readingdatafromxlsx(Hashtable<String,String>htdata){


    	//ExcelReader excel=new ExcelReader("C:\\Users\\JAY GANESH\\Documents\\Master_Sheet.xlsx");	
    	//excel.addSheet("NewSheet");
    	//System.out.println(excel.getCellData("Testcase", 1, 3));
    	//System.out.println(excel.getCellData("Testcase", 1, 2));
    	//System.out.println(excel.setCellData("Testcase"," Test case name", 7, "test6_account"));
    	//excel.addColumn("Test_Cases", "comments");
    	//excel.removeColumn("Test_Cases", "comments");
    	//System.out.println(excel.isSheetExist("Test_Data"));
    	//excel.setCellData("Test_Cases", "comments", 4, "goodjob");
    	//excel.setCellData("Test_Cases", "comments", 3, "goodwork");
    	//excel.removeColumn("Test_Cases", 4);
    	System.out.println("getting data from xlsx using dataprovider" +htdata.get("First_Name"));
    	
    	
   }
    @DataProvider
    public static Object[][] Data_Collections(){
    
    DataCollection dc=new DataCollection(excel,"Test_Data","TC001_Create_an_Account" );
     return dc.dataArray();
    
    
    
    }
    
	//@Test
    public void hashtable(){
    	Hashtable<String,String> htdata=new Hashtable<String,String>();
    	htdata.put("Firstname", "Dhanashree");
    	htdata.put("Firstname1", "rabiya");
    	htdata.put("Firstname2", "rahul");
    	htdata.put("Firstname3", "mansingh");
    	htdata.put("Firstname4", "prashant");
    	htdata.put("Firstname5", "sandip");
        System.out.println(htdata.get("Firstname1"));
    }
}
