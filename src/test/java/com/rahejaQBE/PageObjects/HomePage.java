package com.rahejaQBE.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
   WebDriver ldriver;
   
   HomePage(WebDriver rdriver)
   {
	   ldriver = rdriver;
	 PageFactory.initElements(rdriver, this);
	   
   }
   
   
	
}
