package com.Qsptech1.Projectname.Modulename;

public class Firefoxdriver implements Webdriver{

	public  void get(){
		System.out.println(" Firefoxdriver is redirected to application url");
		
	}
   public  void gettitle(String title){
	System.out.println("Firefoxdriver is redirected to application url tittle:-"+ title);
}
	
	public  void click(String Webelement){
    System.out.println("Firefoxdriver has been launched and clicked webelement");		
}
	public  void  sendkeys(String Webelement){
		System.out.println("Firefoxdriver has entered testdata");
	}
}
