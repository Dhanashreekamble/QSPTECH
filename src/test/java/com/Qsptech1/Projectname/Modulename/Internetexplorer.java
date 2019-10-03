package com.Qsptech1.Projectname.Modulename;

public class Internetexplorer implements Webdriver {

	public  void get(){
		System.out.println(" Internetexplorer is redirected to application url");
		
	}
   public  void gettitle(String title){
	System.out.println("Internetexplorer is redirected to application url tittle:-"+ title);
}
	
	public  void click(String Webelement){
    System.out.println("Internetexplorer has been launched and clicked webelement");		
}
	public  void  sendkeys(String Webelement){
		System.out.println("Internetexplorer has entered testdata");
	}

}
