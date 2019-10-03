package com.Qsptech1.Projectname.Modulename;

public class Chromedriver implements Webdriver {
	
	public void get(){
		System.out.println(" Chromedriver is redirected to application url");
		
	}
   public void gettitle(String title){
	System.out.println("Chromedriver is redirected to application url tittle:-"+ title);
}
	
	public void click(String Webelement){
    System.out.println("chromedriver has been launched and clicked webelement");		
}
	public void  sendkeys(String Webelement){
		System.out.println("chromedriver has entered testdata");
	}
}
